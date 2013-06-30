/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Composer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MessageComposerTypeImpl#isUnwrapped <em>Unwrapped</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageComposerTypeImpl extends org.switchyard.tools.models.switchyard1_0.switchyard.impl.MessageComposerTypeImpl implements MessageComposerType {
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
     * This is true if the Unwrapped attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unwrappedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageComposerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.MESSAGE_COMPOSER_TYPE;
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
        boolean oldUnwrappedESet = unwrappedESet;
        unwrappedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.MESSAGE_COMPOSER_TYPE__UNWRAPPED, oldUnwrapped, unwrapped, !oldUnwrappedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUnwrapped() {
        boolean oldUnwrapped = unwrapped;
        boolean oldUnwrappedESet = unwrappedESet;
        unwrapped = UNWRAPPED_EDEFAULT;
        unwrappedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SOAPPackage.MESSAGE_COMPOSER_TYPE__UNWRAPPED, oldUnwrapped, UNWRAPPED_EDEFAULT, oldUnwrappedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUnwrapped() {
        return unwrappedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.MESSAGE_COMPOSER_TYPE__UNWRAPPED:
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
            case SOAPPackage.MESSAGE_COMPOSER_TYPE__UNWRAPPED:
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
            case SOAPPackage.MESSAGE_COMPOSER_TYPE__UNWRAPPED:
                unsetUnwrapped();
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
            case SOAPPackage.MESSAGE_COMPOSER_TYPE__UNWRAPPED:
                return isSetUnwrapped();
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
        if (unwrappedESet) result.append(unwrapped); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //MessageComposerTypeImpl
