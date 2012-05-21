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

import org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl;

import org.switchyard.tools.models.switchyard1_0.commonrules.ClockType;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl#isAgent <em>Agent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl#getEventProcessing <em>Event Processing</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl#getMaxThreads <em>Max Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl#isMultithreadEvaluation <em>Multithread Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommonImplementationTypeImpl extends ImplementationImpl implements CommonImplementationType {
    /**
     * The default value of the '{@link #isAgent() <em>Agent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAgent()
     * @generated
     * @ordered
     */
    protected static final boolean AGENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAgent() <em>Agent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAgent()
     * @generated
     * @ordered
     */
    protected boolean agent = AGENT_EDEFAULT;

    /**
     * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClock()
     * @generated
     * @ordered
     */
    protected static final ClockType CLOCK_EDEFAULT = ClockType.REALTIME;

    /**
     * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClock()
     * @generated
     * @ordered
     */
    protected ClockType clock = CLOCK_EDEFAULT;

    /**
     * The default value of the '{@link #getEventProcessing() <em>Event Processing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventProcessing()
     * @generated
     * @ordered
     */
    protected static final EventProcessingType EVENT_PROCESSING_EDEFAULT = EventProcessingType.CLOUD;

    /**
     * The cached value of the '{@link #getEventProcessing() <em>Event Processing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventProcessing()
     * @generated
     * @ordered
     */
    protected EventProcessingType eventProcessing = EVENT_PROCESSING_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxThreads() <em>Max Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxThreads()
     * @generated
     * @ordered
     */
    protected static final int MAX_THREADS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxThreads() <em>Max Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxThreads()
     * @generated
     * @ordered
     */
    protected int maxThreads = MAX_THREADS_EDEFAULT;

    /**
     * The default value of the '{@link #isMultithreadEvaluation() <em>Multithread Evaluation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMultithreadEvaluation()
     * @generated
     * @ordered
     */
    protected static final boolean MULTITHREAD_EVALUATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMultithreadEvaluation() <em>Multithread Evaluation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMultithreadEvaluation()
     * @generated
     * @ordered
     */
    protected boolean multithreadEvaluation = MULTITHREAD_EVALUATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommonImplementationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonRulesPackage.Literals.COMMON_IMPLEMENTATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAgent() {
        return agent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAgent(boolean newAgent) {
        boolean oldAgent = agent;
        agent = newAgent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT, oldAgent, agent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClockType getClock() {
        return clock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClock(ClockType newClock) {
        ClockType oldClock = clock;
        clock = newClock == null ? CLOCK_EDEFAULT : newClock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK, oldClock, clock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProcessingType getEventProcessing() {
        return eventProcessing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventProcessing(EventProcessingType newEventProcessing) {
        EventProcessingType oldEventProcessing = eventProcessing;
        eventProcessing = newEventProcessing == null ? EVENT_PROCESSING_EDEFAULT : newEventProcessing;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING, oldEventProcessing, eventProcessing));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxThreads() {
        return maxThreads;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxThreads(int newMaxThreads) {
        int oldMaxThreads = maxThreads;
        maxThreads = newMaxThreads;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS, oldMaxThreads, maxThreads));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMultithreadEvaluation() {
        return multithreadEvaluation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultithreadEvaluation(boolean newMultithreadEvaluation) {
        boolean oldMultithreadEvaluation = multithreadEvaluation;
        multithreadEvaluation = newMultithreadEvaluation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION, oldMultithreadEvaluation, multithreadEvaluation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT:
                return isAgent();
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK:
                return getClock();
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING:
                return getEventProcessing();
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS:
                return getMaxThreads();
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION:
                return isMultithreadEvaluation();
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
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT:
                setAgent((Boolean)newValue);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK:
                setClock((ClockType)newValue);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING:
                setEventProcessing((EventProcessingType)newValue);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS:
                setMaxThreads((Integer)newValue);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION:
                setMultithreadEvaluation((Boolean)newValue);
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
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT:
                setAgent(AGENT_EDEFAULT);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK:
                setClock(CLOCK_EDEFAULT);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING:
                setEventProcessing(EVENT_PROCESSING_EDEFAULT);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS:
                setMaxThreads(MAX_THREADS_EDEFAULT);
                return;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION:
                setMultithreadEvaluation(MULTITHREAD_EVALUATION_EDEFAULT);
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
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT:
                return agent != AGENT_EDEFAULT;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK:
                return clock != CLOCK_EDEFAULT;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING:
                return eventProcessing != EVENT_PROCESSING_EDEFAULT;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS:
                return maxThreads != MAX_THREADS_EDEFAULT;
            case CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION:
                return multithreadEvaluation != MULTITHREAD_EVALUATION_EDEFAULT;
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
        result.append(" (agent: ");
        result.append(agent);
        result.append(", clock: ");
        result.append(clock);
        result.append(", eventProcessing: ");
        result.append(eventProcessing);
        result.append(", maxThreads: ");
        result.append(maxThreads);
        result.append(", multithreadEvaluation: ");
        result.append(multithreadEvaluation);
        result.append(')');
        return result.toString();
    }

} //CommonImplementationTypeImpl
