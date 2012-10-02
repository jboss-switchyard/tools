/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl#getPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl#getSoTimeout <em>So Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl#getSiteCommand <em>Site Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelFtpBindingTypeImpl extends CamelRemoteBindingTypeImpl implements CamelFtpBindingType {
    /**
     * The default value of the '{@link #getPassiveMode() <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassiveMode()
     * @generated
     * @ordered
     */
    protected static final Boolean PASSIVE_MODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassiveMode() <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassiveMode()
     * @generated
     * @ordered
     */
    protected Boolean passiveMode = PASSIVE_MODE_EDEFAULT;

    /**
     * This is true if the Passive Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean passiveModeESet;

    /**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected Integer timeout = TIMEOUT_EDEFAULT;

    /**
     * This is true if the Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeoutESet;

    /**
     * The default value of the '{@link #getSoTimeout() <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer SO_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSoTimeout() <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoTimeout()
     * @generated
     * @ordered
     */
    protected Integer soTimeout = SO_TIMEOUT_EDEFAULT;

    /**
     * This is true if the So Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean soTimeoutESet;

    /**
     * The default value of the '{@link #getSiteCommand() <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteCommand()
     * @generated
     * @ordered
     */
    protected static final String SITE_COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSiteCommand() <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteCommand()
     * @generated
     * @ordered
     */
    protected String siteCommand = SITE_COMMAND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelFtpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_FTP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getPassiveMode() {
        return passiveMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassiveMode(Boolean newPassiveMode) {
        Boolean oldPassiveMode = passiveMode;
        passiveMode = newPassiveMode;
        boolean oldPassiveModeESet = passiveModeESet;
        passiveModeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, passiveMode, !oldPassiveModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPassiveMode() {
        Boolean oldPassiveMode = passiveMode;
        boolean oldPassiveModeESet = passiveModeESet;
        passiveMode = PASSIVE_MODE_EDEFAULT;
        passiveModeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, PASSIVE_MODE_EDEFAULT, oldPassiveModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPassiveMode() {
        return passiveModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeout(Integer newTimeout) {
        Integer oldTimeout = timeout;
        timeout = newTimeout;
        boolean oldTimeoutESet = timeoutESet;
        timeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimeout() {
        Integer oldTimeout = timeout;
        boolean oldTimeoutESet = timeoutESet;
        timeout = TIMEOUT_EDEFAULT;
        timeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTimeout() {
        return timeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getSoTimeout() {
        return soTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSoTimeout(Integer newSoTimeout) {
        Integer oldSoTimeout = soTimeout;
        soTimeout = newSoTimeout;
        boolean oldSoTimeoutESet = soTimeoutESet;
        soTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, soTimeout, !oldSoTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSoTimeout() {
        Integer oldSoTimeout = soTimeout;
        boolean oldSoTimeoutESet = soTimeoutESet;
        soTimeout = SO_TIMEOUT_EDEFAULT;
        soTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, SO_TIMEOUT_EDEFAULT, oldSoTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSoTimeout() {
        return soTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSiteCommand() {
        return siteCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSiteCommand(String newSiteCommand) {
        String oldSiteCommand = siteCommand;
        siteCommand = newSiteCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND, oldSiteCommand, siteCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return getPassiveMode();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                return getTimeout();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                return getSoTimeout();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                return getSiteCommand();
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
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                setPassiveMode((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                setTimeout((Integer)newValue);
                return;
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                setSoTimeout((Integer)newValue);
                return;
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                setSiteCommand((String)newValue);
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
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                unsetPassiveMode();
                return;
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                unsetTimeout();
                return;
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                unsetSoTimeout();
                return;
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                setSiteCommand(SITE_COMMAND_EDEFAULT);
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
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return isSetPassiveMode();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                return isSetTimeout();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                return isSetSoTimeout();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                return SITE_COMMAND_EDEFAULT == null ? siteCommand != null : !SITE_COMMAND_EDEFAULT.equals(siteCommand);
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
        result.append(" (passiveMode: ");
        if (passiveModeESet) result.append(passiveMode); else result.append("<unset>");
        result.append(", timeout: ");
        if (timeoutESet) result.append(timeout); else result.append("<unset>");
        result.append(", soTimeout: ");
        if (soTimeoutESet) result.append(soTimeout); else result.append("<unset>");
        result.append(", siteCommand: ");
        result.append(siteCommand);
        result.append(')');
        return result.toString();
    }

} //CamelFtpBindingTypeImpl
