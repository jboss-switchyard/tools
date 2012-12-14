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
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getDaemon <em>Daemon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelTimerBindingTypeImpl extends BaseCamelBindingImpl implements CamelTimerBindingType {
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
	protected static final Long PERIOD_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
	protected Long period = PERIOD_EDEFAULT;

	/**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected static final Long DELAY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected Long delay = DELAY_EDEFAULT;

	/**
     * The default value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFixedRate()
     * @generated
     * @ordered
     */
	protected static final Boolean FIXED_RATE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFixedRate() <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFixedRate()
     * @generated
     * @ordered
     */
	protected Boolean fixedRate = FIXED_RATE_EDEFAULT;

	/**
     * This is true if the Fixed Rate attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean fixedRateESet;

	/**
     * The default value of the '{@link #getDaemon() <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDaemon()
     * @generated
     * @ordered
     */
	protected static final Boolean DAEMON_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDaemon() <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDaemon()
     * @generated
     * @ordered
     */
	protected Boolean daemon = DAEMON_EDEFAULT;

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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME, oldCamelBindingName, camelBindingName));
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
	public Long getPeriod() {
        return period;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriod(Long newPeriod) {
        Long oldPeriod = period;
        period = newPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD, oldPeriod, period));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getDelay() {
        return delay;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(Long newDelay) {
        Long oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY, oldDelay, delay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getFixedRate() {
        return fixedRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFixedRate(Boolean newFixedRate) {
        Boolean oldFixedRate = fixedRate;
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
        Boolean oldFixedRate = fixedRate;
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
    public Boolean getDaemon() {
        return daemon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDaemon(Boolean newDaemon) {
        Boolean oldDaemon = daemon;
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
        Boolean oldDaemon = daemon;
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME:
                return getCamelBindingName();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                return getTime();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                return getPattern();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                return getPeriod();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                return getDelay();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE:
                return getFixedRate();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON:
                return getDaemon();
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName((String)newValue);
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName(CAMEL_BINDING_NAME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                setTime(TIME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                setPattern(PATTERN_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                setPeriod(PERIOD_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                setDelay(DELAY_EDEFAULT);
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME:
                return CAMEL_BINDING_NAME_EDEFAULT == null ? camelBindingName != null : !CAMEL_BINDING_NAME_EDEFAULT.equals(camelBindingName);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
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
        result.append(" (camelBindingName: ");
        result.append(camelBindingName);
        result.append(", time: ");
        result.append(time);
        result.append(", pattern: ");
        result.append(pattern);
        result.append(", period: ");
        result.append(period);
        result.append(", delay: ");
        result.append(delay);
        result.append(", fixedRate: ");
        if (fixedRateESet) result.append(fixedRate); else result.append("<unset>");
        result.append(", daemon: ");
        if (daemonESet) result.append(daemon); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelTimerBindingTypeImpl
