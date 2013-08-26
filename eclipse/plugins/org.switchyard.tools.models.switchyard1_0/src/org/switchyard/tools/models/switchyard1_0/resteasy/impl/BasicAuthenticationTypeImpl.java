/**
 */
package org.switchyard.tools.models.switchyard1_0.resteasy.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.resteasy.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Authentication Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.BasicAuthenticationTypeImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.BasicAuthenticationTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.BasicAuthenticationTypeImpl#getRealm <em>Realm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.BasicAuthenticationTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.BasicAuthenticationTypeImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicAuthenticationTypeImpl extends CommonExtensionBaseImpl implements BasicAuthenticationType {
    /**
     * The default value of the '{@link #getUser() <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected static final String USER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected String user = USER_EDEFAULT;

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
     * The default value of the '{@link #getRealm() <em>Realm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealm()
     * @generated
     * @ordered
     */
    protected static final String REALM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRealm() <em>Realm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealm()
     * @generated
     * @ordered
     */
    protected String realm = REALM_EDEFAULT;

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
    protected static final Object PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected Object port = PORT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicAuthenticationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResteasyPackage.Literals.BASIC_AUTHENTICATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUser() {
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUser(String newUser) {
        String oldUser = user;
        user = newUser;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.BASIC_AUTHENTICATION_TYPE__USER, oldUser, user));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRealm() {
        return realm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealm(String newRealm) {
        String oldRealm = realm;
        realm = newRealm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.BASIC_AUTHENTICATION_TYPE__REALM, oldRealm, realm));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.BASIC_AUTHENTICATION_TYPE__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(Object newPort) {
        Object oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__USER:
                return getUser();
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PASSWORD:
                return getPassword();
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__REALM:
                return getRealm();
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__HOST:
                return getHost();
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PORT:
                return getPort();
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
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__USER:
                setUser((String)newValue);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__REALM:
                setRealm((String)newValue);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__HOST:
                setHost((String)newValue);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PORT:
                setPort(newValue);
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
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__USER:
                setUser(USER_EDEFAULT);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__REALM:
                setRealm(REALM_EDEFAULT);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PORT:
                setPort(PORT_EDEFAULT);
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
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__USER:
                return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__REALM:
                return REALM_EDEFAULT == null ? realm != null : !REALM_EDEFAULT.equals(realm);
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE__PORT:
                return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
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
        result.append(" (user: ");
        result.append(user);
        result.append(", password: ");
        result.append(password);
        result.append(", realm: ");
        result.append(realm);
        result.append(", host: ");
        result.append(host);
        result.append(", port: ");
        result.append(port);
        result.append(')');
        return result.toString();
    }

} //BasicAuthenticationTypeImpl
