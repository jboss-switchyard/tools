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

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl#getKnownHostsFile <em>Known Hosts File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl#getPrivateKeyFile <em>Private Key File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSftpBindingTypeImpl extends CamelRemoteBindingTypeImpl implements CamelSftpBindingType {
    /**
     * The default value of the '{@link #getKnownHostsFile() <em>Known Hosts File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKnownHostsFile()
     * @generated
     * @ordered
     */
    protected static final String KNOWN_HOSTS_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKnownHostsFile() <em>Known Hosts File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKnownHostsFile()
     * @generated
     * @ordered
     */
    protected String knownHostsFile = KNOWN_HOSTS_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getPrivateKeyFile() <em>Private Key File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivateKeyFile()
     * @generated
     * @ordered
     */
    protected static final String PRIVATE_KEY_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrivateKeyFile() <em>Private Key File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivateKeyFile()
     * @generated
     * @ordered
     */
    protected String privateKeyFile = PRIVATE_KEY_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getPrivateKeyFilePassphrase() <em>Private Key File Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivateKeyFilePassphrase()
     * @generated
     * @ordered
     */
    protected static final String PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrivateKeyFilePassphrase() <em>Private Key File Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivateKeyFilePassphrase()
     * @generated
     * @ordered
     */
    protected String privateKeyFilePassphrase = PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSftpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_SFTP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKnownHostsFile() {
        return knownHostsFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKnownHostsFile(String newKnownHostsFile) {
        String oldKnownHostsFile = knownHostsFile;
        knownHostsFile = newKnownHostsFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE, oldKnownHostsFile, knownHostsFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrivateKeyFile() {
        return privateKeyFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivateKeyFile(String newPrivateKeyFile) {
        String oldPrivateKeyFile = privateKeyFile;
        privateKeyFile = newPrivateKeyFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE, oldPrivateKeyFile, privateKeyFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrivateKeyFilePassphrase() {
        return privateKeyFilePassphrase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivateKeyFilePassphrase(String newPrivateKeyFilePassphrase) {
        String oldPrivateKeyFilePassphrase = privateKeyFilePassphrase;
        privateKeyFilePassphrase = newPrivateKeyFilePassphrase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE, oldPrivateKeyFilePassphrase, privateKeyFilePassphrase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                return getKnownHostsFile();
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                return getPrivateKeyFile();
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                return getPrivateKeyFilePassphrase();
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
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                setKnownHostsFile((String)newValue);
                return;
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                setPrivateKeyFile((String)newValue);
                return;
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                setPrivateKeyFilePassphrase((String)newValue);
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
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                setKnownHostsFile(KNOWN_HOSTS_FILE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                setPrivateKeyFile(PRIVATE_KEY_FILE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                setPrivateKeyFilePassphrase(PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT);
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
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                return KNOWN_HOSTS_FILE_EDEFAULT == null ? knownHostsFile != null : !KNOWN_HOSTS_FILE_EDEFAULT.equals(knownHostsFile);
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                return PRIVATE_KEY_FILE_EDEFAULT == null ? privateKeyFile != null : !PRIVATE_KEY_FILE_EDEFAULT.equals(privateKeyFile);
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                return PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT == null ? privateKeyFilePassphrase != null : !PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT.equals(privateKeyFilePassphrase);
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
        result.append(" (knownHostsFile: ");
        result.append(knownHostsFile);
        result.append(", privateKeyFile: ");
        result.append(privateKeyFile);
        result.append(", privateKeyFilePassphrase: ");
        result.append(privateKeyFilePassphrase);
        result.append(')');
        return result.toString();
    }

} //CamelSftpBindingTypeImpl
