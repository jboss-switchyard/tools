/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Mail Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl#isSecure <em>Secure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMailBindingTypeImpl extends BaseCamelBindingImpl implements CamelMailBindingType {
    /**
     * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected static final String HOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected String host = HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final int PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected int port = PORT_EDEFAULT;

    /**
     * This is true if the Port attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean portESet;

    /**
     * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected static final String USERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected String username = USERNAME_EDEFAULT;

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
     * The default value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionTimeout()
     * @generated
     * @ordered
     */
    protected static final int CONNECTION_TIMEOUT_EDEFAULT = 30000;

    /**
     * The cached value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionTimeout()
     * @generated
     * @ordered
     */
    protected int connectionTimeout = CONNECTION_TIMEOUT_EDEFAULT;

    /**
     * This is true if the Connection Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectionTimeoutESet;

    /**
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
    protected CamelMailConsumerType consume;

    /**
     * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProduce()
     * @generated
     * @ordered
     */
    protected CamelMailProducerType produce;

    /**
     * The default value of the '{@link #isSecure() <em>Secure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSecure()
     * @generated
     * @ordered
     */
    protected static final boolean SECURE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSecure() <em>Secure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSecure()
     * @generated
     * @ordered
     */
    protected boolean secure = SECURE_EDEFAULT;

    /**
     * This is true if the Secure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean secureESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMailBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MailPackage.Literals.CAMEL_MAIL_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHost(String newHost) {
        String oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(int newPort) {
        int oldPort = port;
        port = newPort;
        boolean oldPortESet = portESet;
        portESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__PORT, oldPort, port, !oldPortESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPort() {
        int oldPort = port;
        boolean oldPortESet = portESet;
        port = PORT_EDEFAULT;
        portESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_BINDING_TYPE__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPort() {
        return portESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__USERNAME, oldUsername, username));
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
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionTimeout(int newConnectionTimeout) {
        int oldConnectionTimeout = connectionTimeout;
        connectionTimeout = newConnectionTimeout;
        boolean oldConnectionTimeoutESet = connectionTimeoutESet;
        connectionTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT, oldConnectionTimeout, connectionTimeout, !oldConnectionTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConnectionTimeout() {
        int oldConnectionTimeout = connectionTimeout;
        boolean oldConnectionTimeoutESet = connectionTimeoutESet;
        connectionTimeout = CONNECTION_TIMEOUT_EDEFAULT;
        connectionTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT, oldConnectionTimeout, CONNECTION_TIMEOUT_EDEFAULT, oldConnectionTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConnectionTimeout() {
        return connectionTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMailConsumerType getConsume() {
        return consume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsume(CamelMailConsumerType newConsume, NotificationChain msgs) {
        CamelMailConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsume(CamelMailConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMailProducerType getProduce() {
        return produce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProduce(CamelMailProducerType newProduce, NotificationChain msgs) {
        CamelMailProducerType oldProduce = produce;
        produce = newProduce;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProduce(CamelMailProducerType newProduce) {
        if (newProduce != produce) {
            NotificationChain msgs = null;
            if (produce != null)
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSecure() {
        return secure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecure(boolean newSecure) {
        boolean oldSecure = secure;
        secure = newSecure;
        boolean oldSecureESet = secureESet;
        secureESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_BINDING_TYPE__SECURE, oldSecure, secure, !oldSecureESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSecure() {
        boolean oldSecure = secure;
        boolean oldSecureESet = secureESet;
        secure = SECURE_EDEFAULT;
        secureESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_BINDING_TYPE__SECURE, oldSecure, SECURE_EDEFAULT, oldSecureESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSecure() {
        return secureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE:
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
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__HOST:
                return getHost();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PORT:
                return getPort();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__USERNAME:
                return getUsername();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PASSWORD:
                return getPassword();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT:
                return getConnectionTimeout();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME:
                return getConsume();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE:
                return getProduce();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__SECURE:
                return isSecure();
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
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PORT:
                setPort((Integer)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__USERNAME:
                setUsername((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT:
                setConnectionTimeout((Integer)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME:
                setConsume((CamelMailConsumerType)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE:
                setProduce((CamelMailProducerType)newValue);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__SECURE:
                setSecure((Boolean)newValue);
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
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PORT:
                unsetPort();
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT:
                unsetConnectionTimeout();
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME:
                setConsume((CamelMailConsumerType)null);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE:
                setProduce((CamelMailProducerType)null);
                return;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__SECURE:
                unsetSecure();
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
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PORT:
                return isSetPort();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT:
                return isSetConnectionTimeout();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__CONSUME:
                return consume != null;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__PRODUCE:
                return produce != null;
            case MailPackage.CAMEL_MAIL_BINDING_TYPE__SECURE:
                return isSetSecure();
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
        result.append(" (host: ");
        result.append(host);
        result.append(", port: ");
        if (portESet) result.append(port); else result.append("<unset>");
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(", connectionTimeout: ");
        if (connectionTimeoutESet) result.append(connectionTimeout); else result.append("<unset>");
        result.append(", secure: ");
        if (secureESet) result.append(secure); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelMailBindingTypeImpl
