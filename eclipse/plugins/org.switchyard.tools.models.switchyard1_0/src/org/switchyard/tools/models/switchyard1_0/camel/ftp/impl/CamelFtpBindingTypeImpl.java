/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import java.math.BigInteger;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getPassiveMode <em>Passive Mode</em>}</li>
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
     * The default value of the '{@link #getAutoCreate() <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutoCreate()
     * @generated
     * @ordered
     */
    protected static final Boolean AUTO_CREATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAutoCreate() <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutoCreate()
     * @generated
     * @ordered
     */
    protected Boolean autoCreate = AUTO_CREATE_EDEFAULT;

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
    protected static final Integer BUFFER_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufferSize()
     * @generated
     * @ordered
     */
    protected Integer bufferSize = BUFFER_SIZE_EDEFAULT;

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
     * The default value of the '{@link #getFlatten() <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlatten()
     * @generated
     * @ordered
     */
    protected static final Boolean FLATTEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlatten() <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlatten()
     * @generated
     * @ordered
     */
    protected Boolean flatten = FLATTEN_EDEFAULT;

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
    public Boolean getAutoCreate() {
        return autoCreate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutoCreate(Boolean newAutoCreate) {
        Boolean oldAutoCreate = autoCreate;
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
        Boolean oldAutoCreate = autoCreate;
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
    public Integer getBufferSize() {
        return bufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufferSize(Integer newBufferSize) {
        Integer oldBufferSize = bufferSize;
        bufferSize = newBufferSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE, oldBufferSize, bufferSize));
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
    public Boolean getFlatten() {
        return flatten;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlatten(Boolean newFlatten) {
        Boolean oldFlatten = flatten;
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
        Boolean oldFlatten = flatten;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PORT, oldPort, port, !oldPortESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__BINARY, oldBinary, binary, !oldBinaryESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout, !oldConnectTimeoutESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS, oldMaximumReconnectAttempts, maximumReconnectAttempts, !oldMaximumReconnectAttemptsESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, reconnectDelay, !oldReconnectDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE, oldStepwise, stepwise, !oldStepwiseESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED, oldThrowExceptionOnConnectFailed, throwExceptionOnConnectFailed, !oldThrowExceptionOnConnectFailedESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, passiveMode, !oldPassiveModeESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, soTimeout, !oldSoTimeoutESet));
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
                return getAutoCreate();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE:
                return getBufferSize();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FILE_NAME:
                return getFileName();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__FLATTEN:
                return getFlatten();
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
                return getBinary();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT:
                return getConnectTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
                return getDisconnect();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                return getMaximumReconnectAttempts();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
                return getReconnectDelay();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SEPARATOR:
                return getSeparator();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__STEPWISE:
                return getStepwise();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED:
                return getThrowExceptionOnConnectFailed();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return getPassiveMode();
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
                setBufferSize((Integer)newValue);
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
                setPort((Integer)newValue);
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
                setConnectTimeout((Integer)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS:
                setMaximumReconnectAttempts((Integer)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay((Integer)newValue);
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
                setTimeout((Integer)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                setSoTimeout((Integer)newValue);
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
                setBufferSize(BUFFER_SIZE_EDEFAULT);
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
                return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
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
