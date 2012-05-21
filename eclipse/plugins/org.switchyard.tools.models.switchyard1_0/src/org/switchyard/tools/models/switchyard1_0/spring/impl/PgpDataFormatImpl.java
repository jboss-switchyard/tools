/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pgp Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PgpDataFormatImpl#isArmored <em>Armored</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PgpDataFormatImpl#isIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PgpDataFormatImpl#getKeyFileName <em>Key File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PgpDataFormatImpl#getKeyUserid <em>Key Userid</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PgpDataFormatImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PgpDataFormatImpl extends DataFormatImpl implements PgpDataFormat {
    /**
     * The default value of the '{@link #isArmored() <em>Armored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isArmored()
     * @generated
     * @ordered
     */
    protected static final boolean ARMORED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isArmored() <em>Armored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isArmored()
     * @generated
     * @ordered
     */
    protected boolean armored = ARMORED_EDEFAULT;

    /**
     * This is true if the Armored attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean armoredESet;

    /**
     * The default value of the '{@link #isIntegrity() <em>Integrity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIntegrity()
     * @generated
     * @ordered
     */
    protected static final boolean INTEGRITY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIntegrity() <em>Integrity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIntegrity()
     * @generated
     * @ordered
     */
    protected boolean integrity = INTEGRITY_EDEFAULT;

    /**
     * This is true if the Integrity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean integrityESet;

    /**
     * The default value of the '{@link #getKeyFileName() <em>Key File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyFileName()
     * @generated
     * @ordered
     */
    protected static final String KEY_FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeyFileName() <em>Key File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyFileName()
     * @generated
     * @ordered
     */
    protected String keyFileName = KEY_FILE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getKeyUserid() <em>Key Userid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyUserid()
     * @generated
     * @ordered
     */
    protected static final String KEY_USERID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeyUserid() <em>Key Userid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyUserid()
     * @generated
     * @ordered
     */
    protected String keyUserid = KEY_USERID_EDEFAULT;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PgpDataFormatImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getPgpDataFormat();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isArmored() {
        return armored;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArmored(boolean newArmored) {
        boolean oldArmored = armored;
        armored = newArmored;
        boolean oldArmoredESet = armoredESet;
        armoredESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PGP_DATA_FORMAT__ARMORED, oldArmored, armored, !oldArmoredESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetArmored() {
        boolean oldArmored = armored;
        boolean oldArmoredESet = armoredESet;
        armored = ARMORED_EDEFAULT;
        armoredESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.PGP_DATA_FORMAT__ARMORED, oldArmored, ARMORED_EDEFAULT, oldArmoredESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetArmored() {
        return armoredESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIntegrity() {
        return integrity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntegrity(boolean newIntegrity) {
        boolean oldIntegrity = integrity;
        integrity = newIntegrity;
        boolean oldIntegrityESet = integrityESet;
        integrityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PGP_DATA_FORMAT__INTEGRITY, oldIntegrity, integrity, !oldIntegrityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIntegrity() {
        boolean oldIntegrity = integrity;
        boolean oldIntegrityESet = integrityESet;
        integrity = INTEGRITY_EDEFAULT;
        integrityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.PGP_DATA_FORMAT__INTEGRITY, oldIntegrity, INTEGRITY_EDEFAULT, oldIntegrityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIntegrity() {
        return integrityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeyFileName() {
        return keyFileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyFileName(String newKeyFileName) {
        String oldKeyFileName = keyFileName;
        keyFileName = newKeyFileName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME, oldKeyFileName, keyFileName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeyUserid() {
        return keyUserid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyUserid(String newKeyUserid) {
        String oldKeyUserid = keyUserid;
        keyUserid = newKeyUserid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PGP_DATA_FORMAT__KEY_USERID, oldKeyUserid, keyUserid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PGP_DATA_FORMAT__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.PGP_DATA_FORMAT__ARMORED:
                return isArmored();
            case SpringPackage.PGP_DATA_FORMAT__INTEGRITY:
                return isIntegrity();
            case SpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
                return getKeyFileName();
            case SpringPackage.PGP_DATA_FORMAT__KEY_USERID:
                return getKeyUserid();
            case SpringPackage.PGP_DATA_FORMAT__PASSWORD:
                return getPassword();
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
            case SpringPackage.PGP_DATA_FORMAT__ARMORED:
                setArmored((Boolean)newValue);
                return;
            case SpringPackage.PGP_DATA_FORMAT__INTEGRITY:
                setIntegrity((Boolean)newValue);
                return;
            case SpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
                setKeyFileName((String)newValue);
                return;
            case SpringPackage.PGP_DATA_FORMAT__KEY_USERID:
                setKeyUserid((String)newValue);
                return;
            case SpringPackage.PGP_DATA_FORMAT__PASSWORD:
                setPassword((String)newValue);
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
            case SpringPackage.PGP_DATA_FORMAT__ARMORED:
                unsetArmored();
                return;
            case SpringPackage.PGP_DATA_FORMAT__INTEGRITY:
                unsetIntegrity();
                return;
            case SpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
                setKeyFileName(KEY_FILE_NAME_EDEFAULT);
                return;
            case SpringPackage.PGP_DATA_FORMAT__KEY_USERID:
                setKeyUserid(KEY_USERID_EDEFAULT);
                return;
            case SpringPackage.PGP_DATA_FORMAT__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
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
            case SpringPackage.PGP_DATA_FORMAT__ARMORED:
                return isSetArmored();
            case SpringPackage.PGP_DATA_FORMAT__INTEGRITY:
                return isSetIntegrity();
            case SpringPackage.PGP_DATA_FORMAT__KEY_FILE_NAME:
                return KEY_FILE_NAME_EDEFAULT == null ? keyFileName != null : !KEY_FILE_NAME_EDEFAULT.equals(keyFileName);
            case SpringPackage.PGP_DATA_FORMAT__KEY_USERID:
                return KEY_USERID_EDEFAULT == null ? keyUserid != null : !KEY_USERID_EDEFAULT.equals(keyUserid);
            case SpringPackage.PGP_DATA_FORMAT__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
        result.append(" (armored: ");
        if (armoredESet) result.append(armored); else result.append("<unset>");
        result.append(", integrity: ");
        if (integrityESet) result.append(integrity); else result.append("<unset>");
        result.append(", keyFileName: ");
        result.append(keyFileName);
        result.append(", keyUserid: ");
        result.append(keyUserid);
        result.append(", password: ");
        result.append(password);
        result.append(')');
        return result.toString();
    }

} //PgpDataFormatImpl
