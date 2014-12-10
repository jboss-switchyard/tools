/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.GenericFtpBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#isBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#isDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#isStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.GenericFtpBindingTypeImpl#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericFtpBindingTypeImpl extends BaseCamelBindingImpl implements GenericFtpBindingType {
    /**
     * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectory()
     * @generated
     * @ordered
     */
    protected static final String DIRECTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectory()
     * @generated
     * @ordered
     */
    protected String directory = DIRECTORY_EDEFAULT;

    /**
     * The default value of the '{@link #isAutoCreate() <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutoCreate()
     * @generated
     * @ordered
     */
    protected static final boolean AUTO_CREATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAutoCreate() <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutoCreate()
     * @generated
     * @ordered
     */
    protected boolean autoCreate = AUTO_CREATE_EDEFAULT;

    /**
     * This is true if the Auto Create attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean autoCreateESet;

    /**
     * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufferSize()
     * @generated
     * @ordered
     */
    protected static final Object BUFFER_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufferSize()
     * @generated
     * @ordered
     */
    protected Object bufferSize = BUFFER_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected static final String FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected String fileName = FILE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isFlatten() <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFlatten()
     * @generated
     * @ordered
     */
    protected static final boolean FLATTEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFlatten() <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFlatten()
     * @generated
     * @ordered
     */
    protected boolean flatten = FLATTEN_EDEFAULT;

    /**
     * This is true if the Flatten attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flattenESet;

    /**
     * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
    protected static final String CHARSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
    protected String charset = CHARSET_EDEFAULT;

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
     * The default value of the '{@link #isBinary() <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBinary()
     * @generated
     * @ordered
     */
    protected static final boolean BINARY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBinary() <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBinary()
     * @generated
     * @ordered
     */
    protected boolean binary = BINARY_EDEFAULT;

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
    protected static final Object CONNECT_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectTimeout()
     * @generated
     * @ordered
     */
    protected Object connectTimeout = CONNECT_TIMEOUT_EDEFAULT;

    /**
     * The default value of the '{@link #isDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisconnect()
     * @generated
     * @ordered
     */
    protected static final boolean DISCONNECT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisconnect()
     * @generated
     * @ordered
     */
    protected boolean disconnect = DISCONNECT_EDEFAULT;

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
    protected static final Object MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumReconnectAttempts() <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumReconnectAttempts()
     * @generated
     * @ordered
     */
    protected Object maximumReconnectAttempts = MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected static final Object RECONNECT_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected Object reconnectDelay = RECONNECT_DELAY_EDEFAULT;

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
     * The default value of the '{@link #isStepwise() <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStepwise()
     * @generated
     * @ordered
     */
    protected static final boolean STEPWISE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStepwise() <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStepwise()
     * @generated
     * @ordered
     */
    protected boolean stepwise = STEPWISE_EDEFAULT;

    /**
     * This is true if the Stepwise attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepwiseESet;

    /**
     * The default value of the '{@link #isThrowExceptionOnConnectFailed() <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isThrowExceptionOnConnectFailed()
     * @generated
     * @ordered
     */
    protected static final boolean THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isThrowExceptionOnConnectFailed() <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isThrowExceptionOnConnectFailed()
     * @generated
     * @ordered
     */
    protected boolean throwExceptionOnConnectFailed = THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT;

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
    protected GenericFtpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FtpPackage.Literals.GENERIC_FTP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirectory(String newDirectory) {
        String oldDirectory = directory;
        directory = newDirectory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__DIRECTORY, oldDirectory, directory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAutoCreate() {
        return autoCreate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutoCreate(boolean newAutoCreate) {
        boolean oldAutoCreate = autoCreate;
        autoCreate = newAutoCreate;
        boolean oldAutoCreateESet = autoCreateESet;
        autoCreateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, autoCreate, !oldAutoCreateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAutoCreate() {
        boolean oldAutoCreate = autoCreate;
        boolean oldAutoCreateESet = autoCreateESet;
        autoCreate = AUTO_CREATE_EDEFAULT;
        autoCreateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.GENERIC_FTP_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, AUTO_CREATE_EDEFAULT, oldAutoCreateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAutoCreate() {
        return autoCreateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBufferSize() {
        return bufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufferSize(Object newBufferSize) {
        Object oldBufferSize = bufferSize;
        bufferSize = newBufferSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__BUFFER_SIZE, oldBufferSize, bufferSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileName(String newFileName) {
        String oldFileName = fileName;
        fileName = newFileName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__FILE_NAME, oldFileName, fileName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFlatten() {
        return flatten;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlatten(boolean newFlatten) {
        boolean oldFlatten = flatten;
        flatten = newFlatten;
        boolean oldFlattenESet = flattenESet;
        flattenESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__FLATTEN, oldFlatten, flatten, !oldFlattenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFlatten() {
        boolean oldFlatten = flatten;
        boolean oldFlattenESet = flattenESet;
        flatten = FLATTEN_EDEFAULT;
        flattenESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.GENERIC_FTP_BINDING_TYPE__FLATTEN, oldFlatten, FLATTEN_EDEFAULT, oldFlattenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFlatten() {
        return flattenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCharset() {
        return charset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharset(String newCharset) {
        String oldCharset = charset;
        charset = newCharset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__CHARSET, oldCharset, charset));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__HOST, oldHost, host));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__PORT, oldPort, port));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__USERNAME, oldUsername, username));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBinary() {
        return binary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBinary(boolean newBinary) {
        boolean oldBinary = binary;
        binary = newBinary;
        boolean oldBinaryESet = binaryESet;
        binaryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__BINARY, oldBinary, binary, !oldBinaryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBinary() {
        boolean oldBinary = binary;
        boolean oldBinaryESet = binaryESet;
        binary = BINARY_EDEFAULT;
        binaryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.GENERIC_FTP_BINDING_TYPE__BINARY, oldBinary, BINARY_EDEFAULT, oldBinaryESet));
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
    public Object getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectTimeout(Object newConnectTimeout) {
        Object oldConnectTimeout = connectTimeout;
        connectTimeout = newConnectTimeout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDisconnect() {
        return disconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisconnect(boolean newDisconnect) {
        boolean oldDisconnect = disconnect;
        disconnect = newDisconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnectESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisconnect() {
        boolean oldDisconnect = disconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnect = DISCONNECT_EDEFAULT;
        disconnectESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.GENERIC_FTP_BINDING_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
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
    public Object getMaximumReconnectAttempts() {
        return maximumReconnectAttempts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumReconnectAttempts(Object newMaximumReconnectAttempts) {
        Object oldMaximumReconnectAttempts = maximumReconnectAttempts;
        maximumReconnectAttempts = newMaximumReconnectAttempts;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS, oldMaximumReconnectAttempts, maximumReconnectAttempts));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getReconnectDelay() {
        return reconnectDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectDelay(Object newReconnectDelay) {
        Object oldReconnectDelay = reconnectDelay;
        reconnectDelay = newReconnectDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, reconnectDelay));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__SEPARATOR, oldSeparator, separator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStepwise() {
        return stepwise;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStepwise(boolean newStepwise) {
        boolean oldStepwise = stepwise;
        stepwise = newStepwise;
        boolean oldStepwiseESet = stepwiseESet;
        stepwiseESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__STEPWISE, oldStepwise, stepwise, !oldStepwiseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStepwise() {
        boolean oldStepwise = stepwise;
        boolean oldStepwiseESet = stepwiseESet;
        stepwise = STEPWISE_EDEFAULT;
        stepwiseESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.GENERIC_FTP_BINDING_TYPE__STEPWISE, oldStepwise, STEPWISE_EDEFAULT, oldStepwiseESet));
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
    public boolean isThrowExceptionOnConnectFailed() {
        return throwExceptionOnConnectFailed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThrowExceptionOnConnectFailed(boolean newThrowExceptionOnConnectFailed) {
        boolean oldThrowExceptionOnConnectFailed = throwExceptionOnConnectFailed;
        throwExceptionOnConnectFailed = newThrowExceptionOnConnectFailed;
        boolean oldThrowExceptionOnConnectFailedESet = throwExceptionOnConnectFailedESet;
        throwExceptionOnConnectFailedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.GENERIC_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, throwExceptionOnConnectFailed, !oldThrowExceptionOnConnectFailedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetThrowExceptionOnConnectFailed() {
        boolean oldThrowExceptionOnConnectFailed = throwExceptionOnConnectFailed;
        boolean oldThrowExceptionOnConnectFailedESet = throwExceptionOnConnectFailedESet;
        throwExceptionOnConnectFailed = THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT;
        throwExceptionOnConnectFailedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.GENERIC_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT, oldThrowExceptionOnConnectFailedESet));
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
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DIRECTORY:
                return getDirectory();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__AUTO_CREATE:
                return isAutoCreate();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BUFFER_SIZE:
                return getBufferSize();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FILE_NAME:
                return getFileName();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FLATTEN:
                return isFlatten();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CHARSET:
                return getCharset();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__HOST:
                return getHost();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PORT:
                return getPort();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__USERNAME:
                return getUsername();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PASSWORD:
                return getPassword();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BINARY:
                return isBinary();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                return getConnectTimeout();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DISCONNECT:
                return isDisconnect();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return getMaximumReconnectAttempts();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__RECONNECT_DELAY:
                return getReconnectDelay();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__SEPARATOR:
                return getSeparator();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__STEPWISE:
                return isStepwise();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                return isThrowExceptionOnConnectFailed();
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
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DIRECTORY:
                setDirectory((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__AUTO_CREATE:
                setAutoCreate((Boolean)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize(newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FILE_NAME:
                setFileName((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FLATTEN:
                setFlatten((Boolean)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CHARSET:
                setCharset((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PORT:
                setPort(newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__USERNAME:
                setUsername((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BINARY:
                setBinary((Boolean)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                setConnectTimeout(newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                setMaximumReconnectAttempts(newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay(newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__SEPARATOR:
                setSeparator((String)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__STEPWISE:
                setStepwise((Boolean)newValue);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
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
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DIRECTORY:
                setDirectory(DIRECTORY_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__AUTO_CREATE:
                unsetAutoCreate();
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize(BUFFER_SIZE_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FILE_NAME:
                setFileName(FILE_NAME_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FLATTEN:
                unsetFlatten();
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CHARSET:
                setCharset(CHARSET_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BINARY:
                unsetBinary();
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                setConnectTimeout(CONNECT_TIMEOUT_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DISCONNECT:
                unsetDisconnect();
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                setMaximumReconnectAttempts(MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay(RECONNECT_DELAY_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__SEPARATOR:
                setSeparator(SEPARATOR_EDEFAULT);
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__STEPWISE:
                unsetStepwise();
                return;
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
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
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DIRECTORY:
                return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__AUTO_CREATE:
                return isSetAutoCreate();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BUFFER_SIZE:
                return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FILE_NAME:
                return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__FLATTEN:
                return isSetFlatten();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PORT:
                return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__BINARY:
                return isSetBinary();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                return CONNECT_TIMEOUT_EDEFAULT == null ? connectTimeout != null : !CONNECT_TIMEOUT_EDEFAULT.equals(connectTimeout);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__DISCONNECT:
                return isSetDisconnect();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT == null ? maximumReconnectAttempts != null : !MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT.equals(maximumReconnectAttempts);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__RECONNECT_DELAY:
                return RECONNECT_DELAY_EDEFAULT == null ? reconnectDelay != null : !RECONNECT_DELAY_EDEFAULT.equals(reconnectDelay);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__SEPARATOR:
                return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__STEPWISE:
                return isSetStepwise();
            case FtpPackage.GENERIC_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
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
        result.append(" (directory: ");
        result.append(directory);
        result.append(", autoCreate: ");
        if (autoCreateESet) result.append(autoCreate); else result.append("<unset>");
        result.append(", bufferSize: ");
        result.append(bufferSize);
        result.append(", fileName: ");
        result.append(fileName);
        result.append(", flatten: ");
        if (flattenESet) result.append(flatten); else result.append("<unset>");
        result.append(", charset: ");
        result.append(charset);
        result.append(", host: ");
        result.append(host);
        result.append(", port: ");
        result.append(port);
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(", binary: ");
        if (binaryESet) result.append(binary); else result.append("<unset>");
        result.append(", connectTimeout: ");
        result.append(connectTimeout);
        result.append(", disconnect: ");
        if (disconnectESet) result.append(disconnect); else result.append("<unset>");
        result.append(", maximumReconnectAttempts: ");
        result.append(maximumReconnectAttempts);
        result.append(", reconnectDelay: ");
        result.append(reconnectDelay);
        result.append(", separator: ");
        result.append(separator);
        result.append(", stepwise: ");
        if (stepwiseESet) result.append(stepwise); else result.append("<unset>");
        result.append(", throwExceptionOnConnectFailed: ");
        if (throwExceptionOnConnectFailedESet) result.append(throwExceptionOnConnectFailed); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //GenericFtpBindingTypeImpl
