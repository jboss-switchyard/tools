/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Ftps Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl#getSecurityProtocol <em>Security Protocol</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl#isIsImplicit <em>Is Implicit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl#getExecPbsz <em>Exec Pbsz</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl#getExecProt <em>Exec Prot</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl#isDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelFtpsBindingTypeImpl extends CamelFtpBindingTypeImpl implements CamelFtpsBindingType {
    /**
     * The default value of the '{@link #getSecurityProtocol() <em>Security Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityProtocol()
     * @generated
     * @ordered
     */
    protected static final String SECURITY_PROTOCOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurityProtocol() <em>Security Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityProtocol()
     * @generated
     * @ordered
     */
    protected String securityProtocol = SECURITY_PROTOCOL_EDEFAULT;

    /**
     * The default value of the '{@link #isIsImplicit() <em>Is Implicit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsImplicit()
     * @generated
     * @ordered
     */
    protected static final boolean IS_IMPLICIT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsImplicit() <em>Is Implicit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsImplicit()
     * @generated
     * @ordered
     */
    protected boolean isImplicit = IS_IMPLICIT_EDEFAULT;

    /**
     * This is true if the Is Implicit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isImplicitESet;

    /**
     * The default value of the '{@link #getExecPbsz() <em>Exec Pbsz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecPbsz()
     * @generated
     * @ordered
     */
    protected static final long EXEC_PBSZ_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getExecPbsz() <em>Exec Pbsz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecPbsz()
     * @generated
     * @ordered
     */
    protected long execPbsz = EXEC_PBSZ_EDEFAULT;

    /**
     * This is true if the Exec Pbsz attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean execPbszESet;

    /**
     * The default value of the '{@link #getExecProt() <em>Exec Prot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecProt()
     * @generated
     * @ordered
     */
    protected static final String EXEC_PROT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecProt() <em>Exec Prot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecProt()
     * @generated
     * @ordered
     */
    protected String execProt = EXEC_PROT_EDEFAULT;

    /**
     * The default value of the '{@link #isDisableSecureDataChannelDefaults() <em>Disable Secure Data Channel Defaults</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisableSecureDataChannelDefaults()
     * @generated
     * @ordered
     */
    protected static final boolean DISABLE_SECURE_DATA_CHANNEL_DEFAULTS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDisableSecureDataChannelDefaults() <em>Disable Secure Data Channel Defaults</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisableSecureDataChannelDefaults()
     * @generated
     * @ordered
     */
    protected boolean disableSecureDataChannelDefaults = DISABLE_SECURE_DATA_CHANNEL_DEFAULTS_EDEFAULT;

    /**
     * This is true if the Disable Secure Data Channel Defaults attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disableSecureDataChannelDefaultsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelFtpsBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FtpPackage.Literals.CAMEL_FTPS_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurityProtocol(String newSecurityProtocol) {
        String oldSecurityProtocol = securityProtocol;
        securityProtocol = newSecurityProtocol;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL, oldSecurityProtocol, securityProtocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsImplicit() {
        return isImplicit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsImplicit(boolean newIsImplicit) {
        boolean oldIsImplicit = isImplicit;
        isImplicit = newIsImplicit;
        boolean oldIsImplicitESet = isImplicitESet;
        isImplicitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT, oldIsImplicit, isImplicit, !oldIsImplicitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsImplicit() {
        boolean oldIsImplicit = isImplicit;
        boolean oldIsImplicitESet = isImplicitESet;
        isImplicit = IS_IMPLICIT_EDEFAULT;
        isImplicitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT, oldIsImplicit, IS_IMPLICIT_EDEFAULT, oldIsImplicitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsImplicit() {
        return isImplicitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getExecPbsz() {
        return execPbsz;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecPbsz(long newExecPbsz) {
        long oldExecPbsz = execPbsz;
        execPbsz = newExecPbsz;
        boolean oldExecPbszESet = execPbszESet;
        execPbszESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ, oldExecPbsz, execPbsz, !oldExecPbszESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExecPbsz() {
        long oldExecPbsz = execPbsz;
        boolean oldExecPbszESet = execPbszESet;
        execPbsz = EXEC_PBSZ_EDEFAULT;
        execPbszESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ, oldExecPbsz, EXEC_PBSZ_EDEFAULT, oldExecPbszESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExecPbsz() {
        return execPbszESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExecProt() {
        return execProt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecProt(String newExecProt) {
        String oldExecProt = execProt;
        execProt = newExecProt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT, oldExecProt, execProt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDisableSecureDataChannelDefaults() {
        return disableSecureDataChannelDefaults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisableSecureDataChannelDefaults(boolean newDisableSecureDataChannelDefaults) {
        boolean oldDisableSecureDataChannelDefaults = disableSecureDataChannelDefaults;
        disableSecureDataChannelDefaults = newDisableSecureDataChannelDefaults;
        boolean oldDisableSecureDataChannelDefaultsESet = disableSecureDataChannelDefaultsESet;
        disableSecureDataChannelDefaultsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS, oldDisableSecureDataChannelDefaults, disableSecureDataChannelDefaults, !oldDisableSecureDataChannelDefaultsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisableSecureDataChannelDefaults() {
        boolean oldDisableSecureDataChannelDefaults = disableSecureDataChannelDefaults;
        boolean oldDisableSecureDataChannelDefaultsESet = disableSecureDataChannelDefaultsESet;
        disableSecureDataChannelDefaults = DISABLE_SECURE_DATA_CHANNEL_DEFAULTS_EDEFAULT;
        disableSecureDataChannelDefaultsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS, oldDisableSecureDataChannelDefaults, DISABLE_SECURE_DATA_CHANNEL_DEFAULTS_EDEFAULT, oldDisableSecureDataChannelDefaultsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisableSecureDataChannelDefaults() {
        return disableSecureDataChannelDefaultsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL:
                return getSecurityProtocol();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT:
                return isIsImplicit();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ:
                return getExecPbsz();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT:
                return getExecProt();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS:
                return isDisableSecureDataChannelDefaults();
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
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL:
                setSecurityProtocol((String)newValue);
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT:
                setIsImplicit((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ:
                setExecPbsz((Long)newValue);
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT:
                setExecProt((String)newValue);
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS:
                setDisableSecureDataChannelDefaults((Boolean)newValue);
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
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL:
                setSecurityProtocol(SECURITY_PROTOCOL_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT:
                unsetIsImplicit();
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ:
                unsetExecPbsz();
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT:
                setExecProt(EXEC_PROT_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS:
                unsetDisableSecureDataChannelDefaults();
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
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL:
                return SECURITY_PROTOCOL_EDEFAULT == null ? securityProtocol != null : !SECURITY_PROTOCOL_EDEFAULT.equals(securityProtocol);
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT:
                return isSetIsImplicit();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ:
                return isSetExecPbsz();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__EXEC_PROT:
                return EXEC_PROT_EDEFAULT == null ? execProt != null : !EXEC_PROT_EDEFAULT.equals(execProt);
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS:
                return isSetDisableSecureDataChannelDefaults();
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
        result.append(" (securityProtocol: ");
        result.append(securityProtocol);
        result.append(", isImplicit: ");
        if (isImplicitESet) result.append(isImplicit); else result.append("<unset>");
        result.append(", execPbsz: ");
        if (execPbszESet) result.append(execPbsz); else result.append("<unset>");
        result.append(", execProt: ");
        result.append(execProt);
        result.append(", disableSecureDataChannelDefaults: ");
        if (disableSecureDataChannelDefaultsESet) result.append(disableSecureDataChannelDefaults); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelFtpsBindingTypeImpl
