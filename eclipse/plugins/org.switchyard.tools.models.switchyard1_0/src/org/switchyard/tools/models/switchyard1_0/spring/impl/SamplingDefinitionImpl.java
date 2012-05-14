/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SamplingDefinitionImpl#getMessageFrequency <em>Message Frequency</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SamplingDefinitionImpl#getSamplePeriod <em>Sample Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SamplingDefinitionImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SamplingDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SamplingDefinitionImpl extends OutputImpl implements SamplingDefinition {
	/**
     * The default value of the '{@link #getMessageFrequency() <em>Message Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMessageFrequency()
     * @generated
     * @ordered
     */
	protected static final long MESSAGE_FREQUENCY_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getMessageFrequency() <em>Message Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMessageFrequency()
     * @generated
     * @ordered
     */
	protected long messageFrequency = MESSAGE_FREQUENCY_EDEFAULT;

	/**
     * This is true if the Message Frequency attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean messageFrequencyESet;

	/**
     * The default value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSamplePeriod()
     * @generated
     * @ordered
     */
	protected static final long SAMPLE_PERIOD_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSamplePeriod()
     * @generated
     * @ordered
     */
	protected long samplePeriod = SAMPLE_PERIOD_EDEFAULT;

	/**
     * This is true if the Sample Period attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean samplePeriodESet;

	/**
     * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
	protected static final String UNITS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
	protected String units = UNITS_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SamplingDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getSamplingDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getMessageFrequency() {
        return messageFrequency;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMessageFrequency(long newMessageFrequency) {
        long oldMessageFrequency = messageFrequency;
        messageFrequency = newMessageFrequency;
        boolean oldMessageFrequencyESet = messageFrequencyESet;
        messageFrequencyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY, oldMessageFrequency, messageFrequency, !oldMessageFrequencyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMessageFrequency() {
        long oldMessageFrequency = messageFrequency;
        boolean oldMessageFrequencyESet = messageFrequencyESet;
        messageFrequency = MESSAGE_FREQUENCY_EDEFAULT;
        messageFrequencyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY, oldMessageFrequency, MESSAGE_FREQUENCY_EDEFAULT, oldMessageFrequencyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMessageFrequency() {
        return messageFrequencyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getSamplePeriod() {
        return samplePeriod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSamplePeriod(long newSamplePeriod) {
        long oldSamplePeriod = samplePeriod;
        samplePeriod = newSamplePeriod;
        boolean oldSamplePeriodESet = samplePeriodESet;
        samplePeriodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD, oldSamplePeriod, samplePeriod, !oldSamplePeriodESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetSamplePeriod() {
        long oldSamplePeriod = samplePeriod;
        boolean oldSamplePeriodESet = samplePeriodESet;
        samplePeriod = SAMPLE_PERIOD_EDEFAULT;
        samplePeriodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD, oldSamplePeriod, SAMPLE_PERIOD_EDEFAULT, oldSamplePeriodESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetSamplePeriod() {
        return samplePeriodESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUnits() {
        return units;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUnits(String newUnits) {
        String oldUnits = units;
        units = newUnits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SAMPLING_DEFINITION__UNITS, oldUnits, units));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.SAMPLING_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.SAMPLING_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
                return getMessageFrequency();
            case SpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
                return getSamplePeriod();
            case SpringPackage.SAMPLING_DEFINITION__UNITS:
                return getUnits();
            case SpringPackage.SAMPLING_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
            case SpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
                setMessageFrequency((Long)newValue);
                return;
            case SpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
                setSamplePeriod((Long)newValue);
                return;
            case SpringPackage.SAMPLING_DEFINITION__UNITS:
                setUnits((String)newValue);
                return;
            case SpringPackage.SAMPLING_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
                unsetMessageFrequency();
                return;
            case SpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
                unsetSamplePeriod();
                return;
            case SpringPackage.SAMPLING_DEFINITION__UNITS:
                setUnits(UNITS_EDEFAULT);
                return;
            case SpringPackage.SAMPLING_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
                return isSetMessageFrequency();
            case SpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
                return isSetSamplePeriod();
            case SpringPackage.SAMPLING_DEFINITION__UNITS:
                return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
            case SpringPackage.SAMPLING_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (messageFrequency: ");
        if (messageFrequencyESet) result.append(messageFrequency); else result.append("<unset>");
        result.append(", samplePeriod: ");
        if (samplePeriodESet) result.append(samplePeriod); else result.append("<unset>");
        result.append(", units: ");
        result.append(units);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //SamplingDefinitionImpl
