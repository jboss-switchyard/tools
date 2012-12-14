/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CamelRemoteBindingTypeImpl extends GenericFileBindingTypeImpl implements CamelRemoteBindingType {
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
    protected static final Integer PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected Integer port = PORT_EDEFAULT;

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
     * The default value of the '{@link #getBinary() <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinary()
     * @generated
     * @ordered
     */
    protected static final Boolean BINARY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBinary() <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinary()
     * @generated
     * @ordered
     */
    protected Boolean binary = BINARY_EDEFAULT;

    /**
     * This is true if the Binary attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean binaryESet;

    /**
     * The default value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer CONNECT_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectTimeout()
     * @generated
     * @ordered
     */
    protected Integer connectTimeout = CONNECT_TIMEOUT_EDEFAULT;

    /**
     * This is true if the Connect Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectTimeoutESet;

    /**
     * The default value of the '{@link #getDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnect()
     * @generated
     * @ordered
     */
    protected static final Boolean DISCONNECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnect()
     * @generated
     * @ordered
     */
    protected Boolean disconnect = DISCONNECT_EDEFAULT;

    /**
     * This is true if the Disconnect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disconnectESet;

    /**
     * The default value of the '{@link #getMaximumReconnectAttempts() <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumReconnectAttempts()
     * @generated
     * @ordered
     */
    protected static final Integer MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumReconnectAttempts() <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumReconnectAttempts()
     * @generated
     * @ordered
     */
    protected Integer maximumReconnectAttempts = MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT;

    /**
     * This is true if the Maximum Reconnect Attempts attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumReconnectAttemptsESet;

    /**
     * The default value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected static final Integer RECONNECT_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected Integer reconnectDelay = RECONNECT_DELAY_EDEFAULT;

    /**
     * This is true if the Reconnect Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reconnectDelayESet;

    /**
     * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeparator()
     * @generated
     * @ordered
     */
    protected static final String SEPARATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeparator()
     * @generated
     * @ordered
     */
    protected String separator = SEPARATOR_EDEFAULT;

    /**
     * The default value of the '{@link #getStepwise() <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepwise()
     * @generated
     * @ordered
     */
    protected static final Boolean STEPWISE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStepwise() <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepwise()
     * @generated
     * @ordered
     */
    protected Boolean stepwise = STEPWISE_EDEFAULT;

    /**
     * This is true if the Stepwise attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepwiseESet;

    /**
     * The default value of the '{@link #getThrowExceptionOnConnectFailed() <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrowExceptionOnConnectFailed()
     * @generated
     * @ordered
     */
    protected static final Boolean THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThrowExceptionOnConnectFailed() <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrowExceptionOnConnectFailed()
     * @generated
     * @ordered
     */
    protected Boolean throwExceptionOnConnectFailed = THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT;

    /**
     * This is true if the Throw Exception On Connect Failed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean throwExceptionOnConnectFailedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelRemoteBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_REMOTE_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(Integer newPort) {
        Integer oldPort = port;
        port = newPort;
        boolean oldPortESet = portESet;
        portESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT, oldPort, port, !oldPortESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPort() {
        Integer oldPort = port;
        boolean oldPortESet = portESet;
        port = PORT_EDEFAULT;
        portESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME, oldUsername, username));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getBinary() {
        return binary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBinary(Boolean newBinary) {
        Boolean oldBinary = binary;
        binary = newBinary;
        boolean oldBinaryESet = binaryESet;
        binaryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY, oldBinary, binary, !oldBinaryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBinary() {
        Boolean oldBinary = binary;
        boolean oldBinaryESet = binaryESet;
        binary = BINARY_EDEFAULT;
        binaryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY, oldBinary, BINARY_EDEFAULT, oldBinaryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBinary() {
        return binaryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectTimeout(Integer newConnectTimeout) {
        Integer oldConnectTimeout = connectTimeout;
        connectTimeout = newConnectTimeout;
        boolean oldConnectTimeoutESet = connectTimeoutESet;
        connectTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout, !oldConnectTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConnectTimeout() {
        Integer oldConnectTimeout = connectTimeout;
        boolean oldConnectTimeoutESet = connectTimeoutESet;
        connectTimeout = CONNECT_TIMEOUT_EDEFAULT;
        connectTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT, oldConnectTimeout, CONNECT_TIMEOUT_EDEFAULT, oldConnectTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConnectTimeout() {
        return connectTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDisconnect() {
        return disconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisconnect(Boolean newDisconnect) {
        Boolean oldDisconnect = disconnect;
        disconnect = newDisconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnectESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisconnect() {
        Boolean oldDisconnect = disconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnect = DISCONNECT_EDEFAULT;
        disconnectESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisconnect() {
        return disconnectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaximumReconnectAttempts() {
        return maximumReconnectAttempts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumReconnectAttempts(Integer newMaximumReconnectAttempts) {
        Integer oldMaximumReconnectAttempts = maximumReconnectAttempts;
        maximumReconnectAttempts = newMaximumReconnectAttempts;
        boolean oldMaximumReconnectAttemptsESet = maximumReconnectAttemptsESet;
        maximumReconnectAttemptsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS, oldMaximumReconnectAttempts, maximumReconnectAttempts, !oldMaximumReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaximumReconnectAttempts() {
        Integer oldMaximumReconnectAttempts = maximumReconnectAttempts;
        boolean oldMaximumReconnectAttemptsESet = maximumReconnectAttemptsESet;
        maximumReconnectAttempts = MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT;
        maximumReconnectAttemptsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS, oldMaximumReconnectAttempts, MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT, oldMaximumReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaximumReconnectAttempts() {
        return maximumReconnectAttemptsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getReconnectDelay() {
        return reconnectDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectDelay(Integer newReconnectDelay) {
        Integer oldReconnectDelay = reconnectDelay;
        reconnectDelay = newReconnectDelay;
        boolean oldReconnectDelayESet = reconnectDelayESet;
        reconnectDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, reconnectDelay, !oldReconnectDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReconnectDelay() {
        Integer oldReconnectDelay = reconnectDelay;
        boolean oldReconnectDelayESet = reconnectDelayESet;
        reconnectDelay = RECONNECT_DELAY_EDEFAULT;
        reconnectDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, RECONNECT_DELAY_EDEFAULT, oldReconnectDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReconnectDelay() {
        return reconnectDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeparator(String newSeparator) {
        String oldSeparator = separator;
        separator = newSeparator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR, oldSeparator, separator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getStepwise() {
        return stepwise;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStepwise(Boolean newStepwise) {
        Boolean oldStepwise = stepwise;
        stepwise = newStepwise;
        boolean oldStepwiseESet = stepwiseESet;
        stepwiseESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE, oldStepwise, stepwise, !oldStepwiseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStepwise() {
        Boolean oldStepwise = stepwise;
        boolean oldStepwiseESet = stepwiseESet;
        stepwise = STEPWISE_EDEFAULT;
        stepwiseESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE, oldStepwise, STEPWISE_EDEFAULT, oldStepwiseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStepwise() {
        return stepwiseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getThrowExceptionOnConnectFailed() {
        return throwExceptionOnConnectFailed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThrowExceptionOnConnectFailed(Boolean newThrowExceptionOnConnectFailed) {
        Boolean oldThrowExceptionOnConnectFailed = throwExceptionOnConnectFailed;
        throwExceptionOnConnectFailed = newThrowExceptionOnConnectFailed;
        boolean oldThrowExceptionOnConnectFailedESet = throwExceptionOnConnectFailedESet;
        throwExceptionOnConnectFailedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, throwExceptionOnConnectFailed, !oldThrowExceptionOnConnectFailedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetThrowExceptionOnConnectFailed() {
        Boolean oldThrowExceptionOnConnectFailed = throwExceptionOnConnectFailed;
        boolean oldThrowExceptionOnConnectFailedESet = throwExceptionOnConnectFailedESet;
        throwExceptionOnConnectFailed = THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT;
        throwExceptionOnConnectFailedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT, oldThrowExceptionOnConnectFailedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetThrowExceptionOnConnectFailed() {
        return throwExceptionOnConnectFailedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST:
                return getHost();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT:
                return getPort();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME:
                return getUsername();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD:
                return getPassword();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY:
                return getBinary();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT:
                return getConnectTimeout();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT:
                return getDisconnect();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return getMaximumReconnectAttempts();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY:
                return getReconnectDelay();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR:
                return getSeparator();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE:
                return getStepwise();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                return getThrowExceptionOnConnectFailed();
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
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT:
                setPort((Integer)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME:
                setUsername((String)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY:
                setBinary((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT:
                setConnectTimeout((Integer)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                setMaximumReconnectAttempts((Integer)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay((Integer)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR:
                setSeparator((String)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE:
                setStepwise((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                setThrowExceptionOnConnectFailed((Boolean)newValue);
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
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT:
                unsetPort();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY:
                unsetBinary();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT:
                unsetConnectTimeout();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT:
                unsetDisconnect();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                unsetMaximumReconnectAttempts();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY:
                unsetReconnectDelay();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR:
                setSeparator(SEPARATOR_EDEFAULT);
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE:
                unsetStepwise();
                return;
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                unsetThrowExceptionOnConnectFailed();
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
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT:
                return isSetPort();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY:
                return isSetBinary();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT:
                return isSetConnectTimeout();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT:
                return isSetDisconnect();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return isSetMaximumReconnectAttempts();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY:
                return isSetReconnectDelay();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR:
                return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE:
                return isSetStepwise();
            case CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                return isSetThrowExceptionOnConnectFailed();
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
        result.append(", binary: ");
        if (binaryESet) result.append(binary); else result.append("<unset>");
        result.append(", connectTimeout: ");
        if (connectTimeoutESet) result.append(connectTimeout); else result.append("<unset>");
        result.append(", disconnect: ");
        if (disconnectESet) result.append(disconnect); else result.append("<unset>");
        result.append(", maximumReconnectAttempts: ");
        if (maximumReconnectAttemptsESet) result.append(maximumReconnectAttempts); else result.append("<unset>");
        result.append(", reconnectDelay: ");
        if (reconnectDelayESet) result.append(reconnectDelay); else result.append("<unset>");
        result.append(", separator: ");
        result.append(separator);
        result.append(", stepwise: ");
        if (stepwiseESet) result.append(stepwise); else result.append("<unset>");
        result.append(", throwExceptionOnConnectFailed: ");
        if (throwExceptionOnConnectFailedESet) result.append(throwExceptionOnConnectFailed); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelRemoteBindingTypeImpl
