/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mtom Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl#isXopExpand <em>Xop Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MtomTypeImpl extends CommonExtensionBaseImpl implements MtomType {
    /**
     * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean ENABLED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
    protected boolean enabled = ENABLED_EDEFAULT;

    /**
     * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreshold()
     * @generated
     * @ordered
     */
    protected static final Integer THRESHOLD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreshold()
     * @generated
     * @ordered
     */
    protected Integer threshold = THRESHOLD_EDEFAULT;

    /**
     * The default value of the '{@link #isXopExpand() <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isXopExpand()
     * @generated
     * @ordered
     */
    protected static final boolean XOP_EXPAND_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isXopExpand() <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isXopExpand()
     * @generated
     * @ordered
     */
    protected boolean xopExpand = XOP_EXPAND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MtomTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.MTOM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnabled(boolean newEnabled) {
        boolean oldEnabled = enabled;
        enabled = newEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.MTOM_TYPE__ENABLED, oldEnabled, enabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThreshold(Integer newThreshold) {
        Integer oldThreshold = threshold;
        threshold = newThreshold;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.MTOM_TYPE__THRESHOLD, oldThreshold, threshold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isXopExpand() {
        return xopExpand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXopExpand(boolean newXopExpand) {
        boolean oldXopExpand = xopExpand;
        xopExpand = newXopExpand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.MTOM_TYPE__XOP_EXPAND, oldXopExpand, xopExpand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.MTOM_TYPE__ENABLED:
                return isEnabled();
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                return getThreshold();
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                return isXopExpand();
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
            case SOAPPackage.MTOM_TYPE__ENABLED:
                setEnabled((Boolean)newValue);
                return;
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                setThreshold((Integer)newValue);
                return;
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                setXopExpand((Boolean)newValue);
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
            case SOAPPackage.MTOM_TYPE__ENABLED:
                setEnabled(ENABLED_EDEFAULT);
                return;
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                setThreshold(THRESHOLD_EDEFAULT);
                return;
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                setXopExpand(XOP_EXPAND_EDEFAULT);
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
            case SOAPPackage.MTOM_TYPE__ENABLED:
                return enabled != ENABLED_EDEFAULT;
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                return xopExpand != XOP_EXPAND_EDEFAULT;
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
        result.append(" (enabled: ");
        result.append(enabled);
        result.append(", threshold: ");
        result.append(threshold);
        result.append(", xopExpand: ");
        result.append(xopExpand);
        result.append(')');
        return result.toString();
    }

} //MtomTypeImpl
