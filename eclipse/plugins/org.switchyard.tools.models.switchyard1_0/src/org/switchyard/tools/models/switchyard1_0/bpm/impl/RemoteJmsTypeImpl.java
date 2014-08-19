/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteJmsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Jms Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getKeystoreLocation <em>Keystore Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getKeystorePassword <em>Keystore Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getMessagingPort <em>Messaging Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getRemotingPort <em>Remoting Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getTruststoreLocation <em>Truststore Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getTruststorePassword <em>Truststore Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteJmsTypeImpl#getUseSsl <em>Use Ssl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteJmsTypeImpl extends RemoteTypeImpl implements RemoteJmsType {
    /**
     * The default value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostName()
     * @generated
     * @ordered
     */
    protected static final String HOST_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostName()
     * @generated
     * @ordered
     */
    protected String hostName = HOST_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getKeystoreLocation() <em>Keystore Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeystoreLocation()
     * @generated
     * @ordered
     */
    protected static final String KEYSTORE_LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeystoreLocation() <em>Keystore Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeystoreLocation()
     * @generated
     * @ordered
     */
    protected String keystoreLocation = KEYSTORE_LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getKeystorePassword() <em>Keystore Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeystorePassword()
     * @generated
     * @ordered
     */
    protected static final String KEYSTORE_PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeystorePassword() <em>Keystore Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeystorePassword()
     * @generated
     * @ordered
     */
    protected String keystorePassword = KEYSTORE_PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getMessagingPort() <em>Messaging Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessagingPort()
     * @generated
     * @ordered
     */
    protected static final Object MESSAGING_PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessagingPort() <em>Messaging Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessagingPort()
     * @generated
     * @ordered
     */
    protected Object messagingPort = MESSAGING_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getRemotingPort() <em>Remoting Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemotingPort()
     * @generated
     * @ordered
     */
    protected static final Object REMOTING_PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemotingPort() <em>Remoting Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemotingPort()
     * @generated
     * @ordered
     */
    protected Object remotingPort = REMOTING_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getTruststoreLocation() <em>Truststore Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTruststoreLocation()
     * @generated
     * @ordered
     */
    protected static final String TRUSTSTORE_LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTruststoreLocation() <em>Truststore Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTruststoreLocation()
     * @generated
     * @ordered
     */
    protected String truststoreLocation = TRUSTSTORE_LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getTruststorePassword() <em>Truststore Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTruststorePassword()
     * @generated
     * @ordered
     */
    protected static final String TRUSTSTORE_PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTruststorePassword() <em>Truststore Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTruststorePassword()
     * @generated
     * @ordered
     */
    protected String truststorePassword = TRUSTSTORE_PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getUseSsl() <em>Use Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseSsl()
     * @generated
     * @ordered
     */
    protected static final Object USE_SSL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUseSsl() <em>Use Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseSsl()
     * @generated
     * @ordered
     */
    protected Object useSsl = USE_SSL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteJmsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.REMOTE_JMS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHostName(String newHostName) {
        String oldHostName = hostName;
        hostName = newHostName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__HOST_NAME, oldHostName, hostName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeystoreLocation() {
        return keystoreLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeystoreLocation(String newKeystoreLocation) {
        String oldKeystoreLocation = keystoreLocation;
        keystoreLocation = newKeystoreLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_LOCATION, oldKeystoreLocation, keystoreLocation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeystorePassword() {
        return keystorePassword;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeystorePassword(String newKeystorePassword) {
        String oldKeystorePassword = keystorePassword;
        keystorePassword = newKeystorePassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_PASSWORD, oldKeystorePassword, keystorePassword));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMessagingPort() {
        return messagingPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessagingPort(Object newMessagingPort) {
        Object oldMessagingPort = messagingPort;
        messagingPort = newMessagingPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__MESSAGING_PORT, oldMessagingPort, messagingPort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getRemotingPort() {
        return remotingPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemotingPort(Object newRemotingPort) {
        Object oldRemotingPort = remotingPort;
        remotingPort = newRemotingPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__REMOTING_PORT, oldRemotingPort, remotingPort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTruststoreLocation() {
        return truststoreLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTruststoreLocation(String newTruststoreLocation) {
        String oldTruststoreLocation = truststoreLocation;
        truststoreLocation = newTruststoreLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION, oldTruststoreLocation, truststoreLocation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTruststorePassword() {
        return truststorePassword;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTruststorePassword(String newTruststorePassword) {
        String oldTruststorePassword = truststorePassword;
        truststorePassword = newTruststorePassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD, oldTruststorePassword, truststorePassword));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUseSsl() {
        return useSsl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseSsl(Object newUseSsl) {
        Object oldUseSsl = useSsl;
        useSsl = newUseSsl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_JMS_TYPE__USE_SSL, oldUseSsl, useSsl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.REMOTE_JMS_TYPE__HOST_NAME:
                return getHostName();
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_LOCATION:
                return getKeystoreLocation();
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_PASSWORD:
                return getKeystorePassword();
            case BPMPackage.REMOTE_JMS_TYPE__MESSAGING_PORT:
                return getMessagingPort();
            case BPMPackage.REMOTE_JMS_TYPE__REMOTING_PORT:
                return getRemotingPort();
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION:
                return getTruststoreLocation();
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD:
                return getTruststorePassword();
            case BPMPackage.REMOTE_JMS_TYPE__USE_SSL:
                return getUseSsl();
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
            case BPMPackage.REMOTE_JMS_TYPE__HOST_NAME:
                setHostName((String)newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_LOCATION:
                setKeystoreLocation((String)newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_PASSWORD:
                setKeystorePassword((String)newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__MESSAGING_PORT:
                setMessagingPort(newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__REMOTING_PORT:
                setRemotingPort(newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION:
                setTruststoreLocation((String)newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD:
                setTruststorePassword((String)newValue);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__USE_SSL:
                setUseSsl(newValue);
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
            case BPMPackage.REMOTE_JMS_TYPE__HOST_NAME:
                setHostName(HOST_NAME_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_LOCATION:
                setKeystoreLocation(KEYSTORE_LOCATION_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_PASSWORD:
                setKeystorePassword(KEYSTORE_PASSWORD_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__MESSAGING_PORT:
                setMessagingPort(MESSAGING_PORT_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__REMOTING_PORT:
                setRemotingPort(REMOTING_PORT_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION:
                setTruststoreLocation(TRUSTSTORE_LOCATION_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD:
                setTruststorePassword(TRUSTSTORE_PASSWORD_EDEFAULT);
                return;
            case BPMPackage.REMOTE_JMS_TYPE__USE_SSL:
                setUseSsl(USE_SSL_EDEFAULT);
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
            case BPMPackage.REMOTE_JMS_TYPE__HOST_NAME:
                return HOST_NAME_EDEFAULT == null ? hostName != null : !HOST_NAME_EDEFAULT.equals(hostName);
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_LOCATION:
                return KEYSTORE_LOCATION_EDEFAULT == null ? keystoreLocation != null : !KEYSTORE_LOCATION_EDEFAULT.equals(keystoreLocation);
            case BPMPackage.REMOTE_JMS_TYPE__KEYSTORE_PASSWORD:
                return KEYSTORE_PASSWORD_EDEFAULT == null ? keystorePassword != null : !KEYSTORE_PASSWORD_EDEFAULT.equals(keystorePassword);
            case BPMPackage.REMOTE_JMS_TYPE__MESSAGING_PORT:
                return MESSAGING_PORT_EDEFAULT == null ? messagingPort != null : !MESSAGING_PORT_EDEFAULT.equals(messagingPort);
            case BPMPackage.REMOTE_JMS_TYPE__REMOTING_PORT:
                return REMOTING_PORT_EDEFAULT == null ? remotingPort != null : !REMOTING_PORT_EDEFAULT.equals(remotingPort);
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION:
                return TRUSTSTORE_LOCATION_EDEFAULT == null ? truststoreLocation != null : !TRUSTSTORE_LOCATION_EDEFAULT.equals(truststoreLocation);
            case BPMPackage.REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD:
                return TRUSTSTORE_PASSWORD_EDEFAULT == null ? truststorePassword != null : !TRUSTSTORE_PASSWORD_EDEFAULT.equals(truststorePassword);
            case BPMPackage.REMOTE_JMS_TYPE__USE_SSL:
                return USE_SSL_EDEFAULT == null ? useSsl != null : !USE_SSL_EDEFAULT.equals(useSsl);
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
        result.append(" (hostName: ");
        result.append(hostName);
        result.append(", keystoreLocation: ");
        result.append(keystoreLocation);
        result.append(", keystorePassword: ");
        result.append(keystorePassword);
        result.append(", messagingPort: ");
        result.append(messagingPort);
        result.append(", remotingPort: ");
        result.append(remotingPort);
        result.append(", truststoreLocation: ");
        result.append(truststoreLocation);
        result.append(", truststorePassword: ");
        result.append(truststorePassword);
        result.append(", useSsl: ");
        result.append(useSsl);
        result.append(')');
        return result.toString();
    }

} //RemoteJmsTypeImpl
