/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getSoTimeout <em>So Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getSiteCommand <em>Site Command</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelFtpBindingTypeImpl extends BaseCamelBindingImpl implements CamelFtpBindingType {
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
    protected static final boolean AUTO_CREATE_EDEFAULT = true;

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
    protected static final Object BUFFER_SIZE_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "131072");

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
     * This is true if the Buffer Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufferSizeESet;

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
    protected static final String HOST_EDEFAULT = "";

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
    protected static final Object CONNECT_TIMEOUT_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "10000");

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
     * This is true if the Connect Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectTimeoutESet;

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
    protected static final Object MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "3");

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
    protected static final Object RECONNECT_DELAY_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "1000");

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
     * The default value of the '{@link #isStepwise() <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStepwise()
     * @generated
     * @ordered
     */
    protected static final boolean STEPWISE_EDEFAULT = true;

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
     * The default value of the '{@link #isPassiveMode() <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPassiveMode()
     * @generated
     * @ordered
     */
    protected static final boolean PASSIVE_MODE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPassiveMode() <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPassiveMode()
     * @generated
     * @ordered
     */
    protected boolean passiveMode = PASSIVE_MODE_EDEFAULT;

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
    protected static final Object TIMEOUT_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "30000");

    /**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected Object timeout = TIMEOUT_EDEFAULT;

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
    protected static final Object SO_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSoTimeout() <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoTimeout()
     * @generated
     * @ordered
     */
    protected Object soTimeout = SO_TIMEOUT_EDEFAULT;

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
        return FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__DIRECTORY, oldDirectory, directory));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, autoCreate, !oldAutoCreateESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE, oldAutoCreate, AUTO_CREATE_EDEFAULT, oldAutoCreateESet));
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
        boolean oldBufferSizeESet = bufferSizeESet;
        bufferSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE, oldBufferSize, bufferSize, !oldBufferSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBufferSize() {
        Object oldBufferSize = bufferSize;
        boolean oldBufferSizeESet = bufferSizeESet;
        bufferSize = BUFFER_SIZE_EDEFAULT;
        bufferSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE, oldBufferSize, BUFFER_SIZE_EDEFAULT, oldBufferSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBufferSize() {
        return bufferSizeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME, oldFileName, fileName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN, oldFlatten, flatten, !oldFlattenESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN, oldFlatten, FLATTEN_EDEFAULT, oldFlattenESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CHARSET, oldCharset, charset));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__HOST, oldHost, host));
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
        boolean oldPortESet = portESet;
        portESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT, oldPort, port, !oldPortESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPort() {
        Object oldPort = port;
        boolean oldPortESet = portESet;
        port = PORT_EDEFAULT;
        portESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__USERNAME, oldUsername, username));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSWORD, oldPassword, password));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY, oldBinary, binary, !oldBinaryESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY, oldBinary, BINARY_EDEFAULT, oldBinaryESet));
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
        boolean oldConnectTimeoutESet = connectTimeoutESet;
        connectTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout, !oldConnectTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConnectTimeout() {
        Object oldConnectTimeout = connectTimeout;
        boolean oldConnectTimeoutESet = connectTimeoutESet;
        connectTimeout = CONNECT_TIMEOUT_EDEFAULT;
        connectTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT, oldConnectTimeout, CONNECT_TIMEOUT_EDEFAULT, oldConnectTimeoutESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
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
        boolean oldMaximumReconnectAttemptsESet = maximumReconnectAttemptsESet;
        maximumReconnectAttemptsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS, oldMaximumReconnectAttempts, maximumReconnectAttempts, !oldMaximumReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaximumReconnectAttempts() {
        Object oldMaximumReconnectAttempts = maximumReconnectAttempts;
        boolean oldMaximumReconnectAttemptsESet = maximumReconnectAttemptsESet;
        maximumReconnectAttempts = MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT;
        maximumReconnectAttemptsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS, oldMaximumReconnectAttempts, MAXIMUM_RECONNECT_ATTEMPTS_EDEFAULT, oldMaximumReconnectAttemptsESet));
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
        boolean oldReconnectDelayESet = reconnectDelayESet;
        reconnectDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, reconnectDelay, !oldReconnectDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReconnectDelay() {
        Object oldReconnectDelay = reconnectDelay;
        boolean oldReconnectDelayESet = reconnectDelayESet;
        reconnectDelay = RECONNECT_DELAY_EDEFAULT;
        reconnectDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, RECONNECT_DELAY_EDEFAULT, oldReconnectDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR, oldSeparator, separator));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE, oldStepwise, stepwise, !oldStepwiseESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE, oldStepwise, STEPWISE_EDEFAULT, oldStepwiseESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, throwExceptionOnConnectFailed, !oldThrowExceptionOnConnectFailedESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, THROW_EXCEPTION_ON_CONNECT_FAILED_EDEFAULT, oldThrowExceptionOnConnectFailedESet));
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
    public boolean isPassiveMode() {
        return passiveMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassiveMode(boolean newPassiveMode) {
        boolean oldPassiveMode = passiveMode;
        passiveMode = newPassiveMode;
        boolean oldPassiveModeESet = passiveModeESet;
        passiveModeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, passiveMode, !oldPassiveModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPassiveMode() {
        boolean oldPassiveMode = passiveMode;
        boolean oldPassiveModeESet = passiveModeESet;
        passiveMode = PASSIVE_MODE_EDEFAULT;
        passiveModeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, PASSIVE_MODE_EDEFAULT, oldPassiveModeESet));
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
    public Object getTimeout() {
        return timeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeout(Object newTimeout) {
        Object oldTimeout = timeout;
        timeout = newTimeout;
        boolean oldTimeoutESet = timeoutESet;
        timeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimeout() {
        Object oldTimeout = timeout;
        boolean oldTimeoutESet = timeoutESet;
        timeout = TIMEOUT_EDEFAULT;
        timeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
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
    public Object getSoTimeout() {
        return soTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSoTimeout(Object newSoTimeout) {
        Object oldSoTimeout = soTimeout;
        soTimeout = newSoTimeout;
        boolean oldSoTimeoutESet = soTimeoutESet;
        soTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, soTimeout, !oldSoTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSoTimeout() {
        Object oldSoTimeout = soTimeout;
        boolean oldSoTimeoutESet = soTimeoutESet;
        soTimeout = SO_TIMEOUT_EDEFAULT;
        soTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, SO_TIMEOUT_EDEFAULT, oldSoTimeoutESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND, oldSiteCommand, siteCommand));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, oldConsume, newConsume);
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
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, newConsume, newConsume));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
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
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DIRECTORY:
                return getDirectory();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE:
                return isAutoCreate();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE:
                return getBufferSize();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME:
                return getFileName();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN:
                return isFlatten();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CHARSET:
                return getCharset();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__HOST:
                return getHost();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT:
                return getPort();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__USERNAME:
                return getUsername();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSWORD:
                return getPassword();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY:
                return isBinary();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                return getConnectTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
                return isDisconnect();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return getMaximumReconnectAttempts();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
                return getReconnectDelay();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR:
                return getSeparator();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE:
                return isStepwise();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                return isThrowExceptionOnConnectFailed();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return isPassiveMode();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                return getTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                return getSoTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                return getSiteCommand();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                return getConsume();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DIRECTORY:
                setDirectory((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE:
                setAutoCreate((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE:
                setBufferSize(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME:
                setFileName((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN:
                setFlatten((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CHARSET:
                setCharset((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT:
                setPort(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__USERNAME:
                setUsername((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY:
                setBinary((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                setConnectTimeout(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                setMaximumReconnectAttempts(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR:
                setSeparator((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE:
                setStepwise((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                setThrowExceptionOnConnectFailed((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                setPassiveMode((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                setTimeout(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                setSoTimeout(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                setSiteCommand((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                setConsume((RemoteFileConsumerType)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DIRECTORY:
                setDirectory(DIRECTORY_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE:
                unsetAutoCreate();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE:
                unsetBufferSize();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME:
                setFileName(FILE_NAME_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN:
                unsetFlatten();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CHARSET:
                setCharset(CHARSET_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT:
                unsetPort();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY:
                unsetBinary();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                unsetConnectTimeout();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
                unsetDisconnect();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                unsetMaximumReconnectAttempts();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
                unsetReconnectDelay();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR:
                setSeparator(SEPARATOR_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE:
                unsetStepwise();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                unsetThrowExceptionOnConnectFailed();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                unsetPassiveMode();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                unsetTimeout();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                unsetSoTimeout();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                setSiteCommand(SITE_COMMAND_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                setConsume((RemoteFileConsumerType)null);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DIRECTORY:
                return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__AUTO_CREATE:
                return isSetAutoCreate();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE:
                return isSetBufferSize();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME:
                return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN:
                return isSetFlatten();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT:
                return isSetPort();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY:
                return isSetBinary();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                return isSetConnectTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
                return isSetDisconnect();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return isSetMaximumReconnectAttempts();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
                return isSetReconnectDelay();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR:
                return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE:
                return isSetStepwise();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                return isSetThrowExceptionOnConnectFailed();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return isSetPassiveMode();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                return isSetTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                return isSetSoTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                return SITE_COMMAND_EDEFAULT == null ? siteCommand != null : !SITE_COMMAND_EDEFAULT.equals(siteCommand);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                return consume != null;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
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
        result.append(" (directory: ");
        result.append(directory);
        result.append(", autoCreate: ");
        if (autoCreateESet) result.append(autoCreate); else result.append("<unset>");
        result.append(", bufferSize: ");
        if (bufferSizeESet) result.append(bufferSize); else result.append("<unset>");
        result.append(", fileName: ");
        result.append(fileName);
        result.append(", flatten: ");
        if (flattenESet) result.append(flatten); else result.append("<unset>");
        result.append(", charset: ");
        result.append(charset);
        result.append(", host: ");
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
        result.append(", passiveMode: ");
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
