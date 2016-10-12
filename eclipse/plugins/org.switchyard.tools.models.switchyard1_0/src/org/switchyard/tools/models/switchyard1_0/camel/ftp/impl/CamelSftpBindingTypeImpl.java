/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl#getKnownHostsFile <em>Known Hosts File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl#getPrivateKeyFile <em>Private Key File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSftpBindingTypeImpl extends GenericFtpBindingTypeImpl implements CamelSftpBindingType {
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
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
    protected RemoteFileConsumerType consume;

    /**
     * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProduce()
     * @generated
     * @ordered
     */
    protected RemoteFileProducerType produce;

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
        return FtpPackage.Literals.CAMEL_SFTP_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE, oldKnownHostsFile, knownHostsFile));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE, oldPrivateKeyFile, privateKeyFile));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE, oldPrivateKeyFilePassphrase, privateKeyFilePassphrase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteFileConsumerType getConsume() {
        return consume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsume(RemoteFileConsumerType newConsume, NotificationChain msgs) {
        RemoteFileConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsume(RemoteFileConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteFileProducerType getProduce() {
        return produce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProduce(RemoteFileProducerType newProduce, NotificationChain msgs) {
        RemoteFileProducerType oldProduce = produce;
        produce = newProduce;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProduce(RemoteFileProducerType newProduce) {
        if (newProduce != produce) {
            NotificationChain msgs = null;
            if (produce != null)
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE:
                return basicSetProduce(null, msgs);
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
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                return getKnownHostsFile();
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                return getPrivateKeyFile();
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                return getPrivateKeyFilePassphrase();
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME:
                return getConsume();
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE:
                return getProduce();
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
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                setKnownHostsFile((String)newValue);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                setPrivateKeyFile((String)newValue);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                setPrivateKeyFilePassphrase((String)newValue);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME:
                setConsume((RemoteFileConsumerType)newValue);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE:
                setProduce((RemoteFileProducerType)newValue);
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
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                setKnownHostsFile(KNOWN_HOSTS_FILE_EDEFAULT);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                setPrivateKeyFile(PRIVATE_KEY_FILE_EDEFAULT);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                setPrivateKeyFilePassphrase(PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME:
                setConsume((RemoteFileConsumerType)null);
                return;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE:
                setProduce((RemoteFileProducerType)null);
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
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE:
                return KNOWN_HOSTS_FILE_EDEFAULT == null ? knownHostsFile != null : !KNOWN_HOSTS_FILE_EDEFAULT.equals(knownHostsFile);
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE:
                return PRIVATE_KEY_FILE_EDEFAULT == null ? privateKeyFile != null : !PRIVATE_KEY_FILE_EDEFAULT.equals(privateKeyFile);
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE:
                return PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT == null ? privateKeyFilePassphrase != null : !PRIVATE_KEY_FILE_PASSPHRASE_EDEFAULT.equals(privateKeyFilePassphrase);
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__CONSUME:
                return consume != null;
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE__PRODUCE:
                return produce != null;
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
