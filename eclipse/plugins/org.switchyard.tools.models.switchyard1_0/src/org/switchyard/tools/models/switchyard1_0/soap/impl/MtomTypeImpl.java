/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import java.math.BigInteger;
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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl#getXopExpand <em>Xop Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MtomTypeImpl extends CommonExtensionBaseImpl implements MtomType {
    /**
     * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabled()
     * @generated
     * @ordered
     */
    protected static final Object ENABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabled()
     * @generated
     * @ordered
     */
    protected Object enabled = ENABLED_EDEFAULT;

    /**
     * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreshold()
     * @generated
     * @ordered
     */
    protected static final Object THRESHOLD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreshold()
     * @generated
     * @ordered
     */
    protected Object threshold = THRESHOLD_EDEFAULT;

    /**
     * The default value of the '{@link #getXopExpand() <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXopExpand()
     * @generated
     * @ordered
     */
    protected static final Object XOP_EXPAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXopExpand() <em>Xop Expand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXopExpand()
     * @generated
     * @ordered
     */
    protected Object xopExpand = XOP_EXPAND_EDEFAULT;

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
    public Object getEnabled() {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnabled(Object newEnabled) {
        Object oldEnabled = enabled;
        enabled = newEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.MTOM_TYPE__ENABLED, oldEnabled, enabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getThreshold() {
        return threshold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThreshold(Object newThreshold) {
        Object oldThreshold = threshold;
        threshold = newThreshold;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.MTOM_TYPE__THRESHOLD, oldThreshold, threshold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getXopExpand() {
        return xopExpand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXopExpand(Object newXopExpand) {
        Object oldXopExpand = xopExpand;
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
                return getEnabled();
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                return getThreshold();
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                return getXopExpand();
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
                setEnabled(newValue);
                return;
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                setThreshold(newValue);
                return;
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                setXopExpand(newValue);
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
                return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
            case SOAPPackage.MTOM_TYPE__THRESHOLD:
                return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
            case SOAPPackage.MTOM_TYPE__XOP_EXPAND:
                return XOP_EXPAND_EDEFAULT == null ? xopExpand != null : !XOP_EXPAND_EDEFAULT.equals(xopExpand);
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
