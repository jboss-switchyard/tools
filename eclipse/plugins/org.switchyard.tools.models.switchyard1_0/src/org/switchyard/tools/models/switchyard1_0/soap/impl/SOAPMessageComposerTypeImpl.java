/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.soap.SOAPMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.MessageComposerTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Composer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPMessageComposerTypeImpl#isUnwrapped <em>Unwrapped</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOAPMessageComposerTypeImpl extends MessageComposerTypeImpl implements SOAPMessageComposerType {
    /**
     * The default value of the '{@link #isUnwrapped() <em>Unwrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnwrapped()
     * @generated
     * @ordered
     */
    protected static final boolean UNWRAPPED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUnwrapped() <em>Unwrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnwrapped()
     * @generated
     * @ordered
     */
    protected boolean unwrapped = UNWRAPPED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SOAPMessageComposerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.SOAP_MESSAGE_COMPOSER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUnwrapped() {
        return unwrapped;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnwrapped(boolean newUnwrapped) {
        boolean oldUnwrapped = unwrapped;
        unwrapped = newUnwrapped;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_MESSAGE_COMPOSER_TYPE__UNWRAPPED, oldUnwrapped, unwrapped));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.SOAP_MESSAGE_COMPOSER_TYPE__UNWRAPPED:
                return isUnwrapped();
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
            case SOAPPackage.SOAP_MESSAGE_COMPOSER_TYPE__UNWRAPPED:
                setUnwrapped((Boolean)newValue);
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
            case SOAPPackage.SOAP_MESSAGE_COMPOSER_TYPE__UNWRAPPED:
                setUnwrapped(UNWRAPPED_EDEFAULT);
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
            case SOAPPackage.SOAP_MESSAGE_COMPOSER_TYPE__UNWRAPPED:
                return unwrapped != UNWRAPPED_EDEFAULT;
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
        result.append(" (unwrapped: ");
        result.append(unwrapped);
        result.append(')');
        return result.toString();
    }

} //SOAPMessageComposerTypeImpl
