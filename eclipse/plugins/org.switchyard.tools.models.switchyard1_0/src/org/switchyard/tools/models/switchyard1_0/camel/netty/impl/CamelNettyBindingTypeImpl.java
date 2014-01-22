/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Netty Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getReceiveBufferSize <em>Receive Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getSendBufferSize <em>Send Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isSsl <em>Ssl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getSslHandler <em>Ssl Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isNeedClientAuth <em>Need Client Auth</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getPassphrase <em>Passphrase</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getSecurityProvider <em>Security Provider</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getKeyStoreFormat <em>Key Store Format</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getKeyStoreFile <em>Key Store File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getTrustStoreFile <em>Trust Store File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getSslContextParametersRef <em>Ssl Context Parameters Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isReuseAddress <em>Reuse Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isAllowDefaultCodec <em>Allow Default Codec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getWorkerCount <em>Worker Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isSync <em>Sync</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isDisconnect <em>Disconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CamelNettyBindingTypeImpl extends BaseCamelBindingImpl implements CamelNettyBindingType {
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
     * This is true if the Port attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean portESet;

    /**
     * The default value of the '{@link #getReceiveBufferSize() <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveBufferSize()
     * @generated
     * @ordered
     */
    protected static final Object RECEIVE_BUFFER_SIZE_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropLong(), "65536");

    /**
     * The cached value of the '{@link #getReceiveBufferSize() <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveBufferSize()
     * @generated
     * @ordered
     */
    protected Object receiveBufferSize = RECEIVE_BUFFER_SIZE_EDEFAULT;

    /**
     * This is true if the Receive Buffer Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiveBufferSizeESet;

    /**
     * The default value of the '{@link #getSendBufferSize() <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendBufferSize()
     * @generated
     * @ordered
     */
    protected static final Object SEND_BUFFER_SIZE_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropLong(), "65536");

    /**
     * The cached value of the '{@link #getSendBufferSize() <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendBufferSize()
     * @generated
     * @ordered
     */
    protected Object sendBufferSize = SEND_BUFFER_SIZE_EDEFAULT;

    /**
     * This is true if the Send Buffer Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sendBufferSizeESet;

    /**
     * The default value of the '{@link #isSsl() <em>Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSsl()
     * @generated
     * @ordered
     */
    protected static final boolean SSL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSsl() <em>Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSsl()
     * @generated
     * @ordered
     */
    protected boolean ssl = SSL_EDEFAULT;

    /**
     * This is true if the Ssl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sslESet;

    /**
     * The default value of the '{@link #getSslHandler() <em>Ssl Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSslHandler()
     * @generated
     * @ordered
     */
    protected static final String SSL_HANDLER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSslHandler() <em>Ssl Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSslHandler()
     * @generated
     * @ordered
     */
    protected String sslHandler = SSL_HANDLER_EDEFAULT;

    /**
     * The default value of the '{@link #isNeedClientAuth() <em>Need Client Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNeedClientAuth()
     * @generated
     * @ordered
     */
    protected static final boolean NEED_CLIENT_AUTH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNeedClientAuth() <em>Need Client Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNeedClientAuth()
     * @generated
     * @ordered
     */
    protected boolean needClientAuth = NEED_CLIENT_AUTH_EDEFAULT;

    /**
     * This is true if the Need Client Auth attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean needClientAuthESet;

    /**
     * The default value of the '{@link #getPassphrase() <em>Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassphrase()
     * @generated
     * @ordered
     */
    protected static final String PASSPHRASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassphrase() <em>Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassphrase()
     * @generated
     * @ordered
     */
    protected String passphrase = PASSPHRASE_EDEFAULT;

    /**
     * The default value of the '{@link #getSecurityProvider() <em>Security Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityProvider()
     * @generated
     * @ordered
     */
    protected static final String SECURITY_PROVIDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurityProvider() <em>Security Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityProvider()
     * @generated
     * @ordered
     */
    protected String securityProvider = SECURITY_PROVIDER_EDEFAULT;

    /**
     * The default value of the '{@link #getKeyStoreFormat() <em>Key Store Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyStoreFormat()
     * @generated
     * @ordered
     */
    protected static final String KEY_STORE_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeyStoreFormat() <em>Key Store Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyStoreFormat()
     * @generated
     * @ordered
     */
    protected String keyStoreFormat = KEY_STORE_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getKeyStoreFile() <em>Key Store File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyStoreFile()
     * @generated
     * @ordered
     */
    protected static final String KEY_STORE_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeyStoreFile() <em>Key Store File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyStoreFile()
     * @generated
     * @ordered
     */
    protected String keyStoreFile = KEY_STORE_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getTrustStoreFile() <em>Trust Store File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrustStoreFile()
     * @generated
     * @ordered
     */
    protected static final String TRUST_STORE_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrustStoreFile() <em>Trust Store File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrustStoreFile()
     * @generated
     * @ordered
     */
    protected String trustStoreFile = TRUST_STORE_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getSslContextParametersRef() <em>Ssl Context Parameters Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSslContextParametersRef()
     * @generated
     * @ordered
     */
    protected static final String SSL_CONTEXT_PARAMETERS_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSslContextParametersRef() <em>Ssl Context Parameters Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSslContextParametersRef()
     * @generated
     * @ordered
     */
    protected String sslContextParametersRef = SSL_CONTEXT_PARAMETERS_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isReuseAddress() <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReuseAddress()
     * @generated
     * @ordered
     */
    protected static final boolean REUSE_ADDRESS_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isReuseAddress() <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReuseAddress()
     * @generated
     * @ordered
     */
    protected boolean reuseAddress = REUSE_ADDRESS_EDEFAULT;

    /**
     * This is true if the Reuse Address attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reuseAddressESet;

    /**
     * The default value of the '{@link #getEncoders() <em>Encoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEncoders()
     * @generated
     * @ordered
     */
    protected static final String ENCODERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEncoders() <em>Encoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEncoders()
     * @generated
     * @ordered
     */
    protected String encoders = ENCODERS_EDEFAULT;

    /**
     * The default value of the '{@link #getDecoders() <em>Decoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDecoders()
     * @generated
     * @ordered
     */
    protected static final String DECODERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDecoders() <em>Decoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDecoders()
     * @generated
     * @ordered
     */
    protected String decoders = DECODERS_EDEFAULT;

    /**
     * The default value of the '{@link #isAllowDefaultCodec() <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowDefaultCodec()
     * @generated
     * @ordered
     */
    protected static final boolean ALLOW_DEFAULT_CODEC_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isAllowDefaultCodec() <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowDefaultCodec()
     * @generated
     * @ordered
     */
    protected boolean allowDefaultCodec = ALLOW_DEFAULT_CODEC_EDEFAULT;

    /**
     * This is true if the Allow Default Codec attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean allowDefaultCodecESet;

    /**
     * The default value of the '{@link #getWorkerCount() <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkerCount()
     * @generated
     * @ordered
     */
    protected static final Object WORKER_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWorkerCount() <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkerCount()
     * @generated
     * @ordered
     */
    protected Object workerCount = WORKER_COUNT_EDEFAULT;

    /**
     * This is true if the Worker Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workerCountESet;

    /**
     * The default value of the '{@link #isSync() <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSync()
     * @generated
     * @ordered
     */
    protected static final boolean SYNC_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isSync() <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSync()
     * @generated
     * @ordered
     */
    protected boolean sync = SYNC_EDEFAULT;

    /**
     * This is true if the Sync attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean syncESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelNettyBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NettyPackage.Literals.CAMEL_NETTY_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__HOST, oldHost, host));
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
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT, oldPort, port, !oldPortESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
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
    public Object getReceiveBufferSize() {
        return receiveBufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReceiveBufferSize(Object newReceiveBufferSize) {
        Object oldReceiveBufferSize = receiveBufferSize;
        receiveBufferSize = newReceiveBufferSize;
        boolean oldReceiveBufferSizeESet = receiveBufferSizeESet;
        receiveBufferSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE, oldReceiveBufferSize, receiveBufferSize, !oldReceiveBufferSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReceiveBufferSize() {
        Object oldReceiveBufferSize = receiveBufferSize;
        boolean oldReceiveBufferSizeESet = receiveBufferSizeESet;
        receiveBufferSize = RECEIVE_BUFFER_SIZE_EDEFAULT;
        receiveBufferSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE, oldReceiveBufferSize, RECEIVE_BUFFER_SIZE_EDEFAULT, oldReceiveBufferSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReceiveBufferSize() {
        return receiveBufferSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSendBufferSize() {
        return sendBufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendBufferSize(Object newSendBufferSize) {
        Object oldSendBufferSize = sendBufferSize;
        sendBufferSize = newSendBufferSize;
        boolean oldSendBufferSizeESet = sendBufferSizeESet;
        sendBufferSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE, oldSendBufferSize, sendBufferSize, !oldSendBufferSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSendBufferSize() {
        Object oldSendBufferSize = sendBufferSize;
        boolean oldSendBufferSizeESet = sendBufferSizeESet;
        sendBufferSize = SEND_BUFFER_SIZE_EDEFAULT;
        sendBufferSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE, oldSendBufferSize, SEND_BUFFER_SIZE_EDEFAULT, oldSendBufferSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSendBufferSize() {
        return sendBufferSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSsl() {
        return ssl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSsl(boolean newSsl) {
        boolean oldSsl = ssl;
        ssl = newSsl;
        boolean oldSslESet = sslESet;
        sslESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL, oldSsl, ssl, !oldSslESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSsl() {
        boolean oldSsl = ssl;
        boolean oldSslESet = sslESet;
        ssl = SSL_EDEFAULT;
        sslESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL, oldSsl, SSL_EDEFAULT, oldSslESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSsl() {
        return sslESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSslHandler() {
        return sslHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSslHandler(String newSslHandler) {
        String oldSslHandler = sslHandler;
        sslHandler = newSslHandler;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER, oldSslHandler, sslHandler));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNeedClientAuth() {
        return needClientAuth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNeedClientAuth(boolean newNeedClientAuth) {
        boolean oldNeedClientAuth = needClientAuth;
        needClientAuth = newNeedClientAuth;
        boolean oldNeedClientAuthESet = needClientAuthESet;
        needClientAuthESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH, oldNeedClientAuth, needClientAuth, !oldNeedClientAuthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNeedClientAuth() {
        boolean oldNeedClientAuth = needClientAuth;
        boolean oldNeedClientAuthESet = needClientAuthESet;
        needClientAuth = NEED_CLIENT_AUTH_EDEFAULT;
        needClientAuthESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH, oldNeedClientAuth, NEED_CLIENT_AUTH_EDEFAULT, oldNeedClientAuthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNeedClientAuth() {
        return needClientAuthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassphrase(String newPassphrase) {
        String oldPassphrase = passphrase;
        passphrase = newPassphrase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__PASSPHRASE, oldPassphrase, passphrase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSecurityProvider() {
        return securityProvider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurityProvider(String newSecurityProvider) {
        String oldSecurityProvider = securityProvider;
        securityProvider = newSecurityProvider;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER, oldSecurityProvider, securityProvider));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeyStoreFormat() {
        return keyStoreFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyStoreFormat(String newKeyStoreFormat) {
        String oldKeyStoreFormat = keyStoreFormat;
        keyStoreFormat = newKeyStoreFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT, oldKeyStoreFormat, keyStoreFormat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeyStoreFile() {
        return keyStoreFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyStoreFile(String newKeyStoreFile) {
        String oldKeyStoreFile = keyStoreFile;
        keyStoreFile = newKeyStoreFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE, oldKeyStoreFile, keyStoreFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTrustStoreFile() {
        return trustStoreFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrustStoreFile(String newTrustStoreFile) {
        String oldTrustStoreFile = trustStoreFile;
        trustStoreFile = newTrustStoreFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE, oldTrustStoreFile, trustStoreFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSslContextParametersRef() {
        return sslContextParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSslContextParametersRef(String newSslContextParametersRef) {
        String oldSslContextParametersRef = sslContextParametersRef;
        sslContextParametersRef = newSslContextParametersRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF, oldSslContextParametersRef, sslContextParametersRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isReuseAddress() {
        return reuseAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReuseAddress(boolean newReuseAddress) {
        boolean oldReuseAddress = reuseAddress;
        reuseAddress = newReuseAddress;
        boolean oldReuseAddressESet = reuseAddressESet;
        reuseAddressESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS, oldReuseAddress, reuseAddress, !oldReuseAddressESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReuseAddress() {
        boolean oldReuseAddress = reuseAddress;
        boolean oldReuseAddressESet = reuseAddressESet;
        reuseAddress = REUSE_ADDRESS_EDEFAULT;
        reuseAddressESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS, oldReuseAddress, REUSE_ADDRESS_EDEFAULT, oldReuseAddressESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReuseAddress() {
        return reuseAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEncoders() {
        return encoders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEncoders(String newEncoders) {
        String oldEncoders = encoders;
        encoders = newEncoders;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS, oldEncoders, encoders));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDecoders() {
        return decoders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDecoders(String newDecoders) {
        String oldDecoders = decoders;
        decoders = newDecoders;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS, oldDecoders, decoders));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAllowDefaultCodec() {
        return allowDefaultCodec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAllowDefaultCodec(boolean newAllowDefaultCodec) {
        boolean oldAllowDefaultCodec = allowDefaultCodec;
        allowDefaultCodec = newAllowDefaultCodec;
        boolean oldAllowDefaultCodecESet = allowDefaultCodecESet;
        allowDefaultCodecESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC, oldAllowDefaultCodec, allowDefaultCodec, !oldAllowDefaultCodecESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAllowDefaultCodec() {
        boolean oldAllowDefaultCodec = allowDefaultCodec;
        boolean oldAllowDefaultCodecESet = allowDefaultCodecESet;
        allowDefaultCodec = ALLOW_DEFAULT_CODEC_EDEFAULT;
        allowDefaultCodecESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC, oldAllowDefaultCodec, ALLOW_DEFAULT_CODEC_EDEFAULT, oldAllowDefaultCodecESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAllowDefaultCodec() {
        return allowDefaultCodecESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getWorkerCount() {
        return workerCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorkerCount(Object newWorkerCount) {
        Object oldWorkerCount = workerCount;
        workerCount = newWorkerCount;
        boolean oldWorkerCountESet = workerCountESet;
        workerCountESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT, oldWorkerCount, workerCount, !oldWorkerCountESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetWorkerCount() {
        Object oldWorkerCount = workerCount;
        boolean oldWorkerCountESet = workerCountESet;
        workerCount = WORKER_COUNT_EDEFAULT;
        workerCountESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT, oldWorkerCount, WORKER_COUNT_EDEFAULT, oldWorkerCountESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetWorkerCount() {
        return workerCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSync() {
        return sync;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSync(boolean newSync) {
        boolean oldSync = sync;
        sync = newSync;
        boolean oldSyncESet = syncESet;
        syncESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC, oldSync, sync, !oldSyncESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSync() {
        boolean oldSync = sync;
        boolean oldSyncESet = syncESet;
        sync = SYNC_EDEFAULT;
        syncESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC, oldSync, SYNC_EDEFAULT, oldSyncESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSync() {
        return syncESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                return getHost();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                return getPort();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                return getReceiveBufferSize();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                return getSendBufferSize();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL:
                return isSsl();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER:
                return getSslHandler();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH:
                return isNeedClientAuth();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PASSPHRASE:
                return getPassphrase();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER:
                return getSecurityProvider();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT:
                return getKeyStoreFormat();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE:
                return getKeyStoreFile();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE:
                return getTrustStoreFile();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF:
                return getSslContextParametersRef();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                return isReuseAddress();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                return getEncoders();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                return getDecoders();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                return isAllowDefaultCodec();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                return getWorkerCount();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                return isSync();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
                return isDisconnect();
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
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                setPort(newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                setReceiveBufferSize(newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                setSendBufferSize(newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL:
                setSsl((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER:
                setSslHandler((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH:
                setNeedClientAuth((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PASSPHRASE:
                setPassphrase((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER:
                setSecurityProvider((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT:
                setKeyStoreFormat((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE:
                setKeyStoreFile((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE:
                setTrustStoreFile((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF:
                setSslContextParametersRef((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                setReuseAddress((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                setEncoders((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                setDecoders((String)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                setAllowDefaultCodec((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                setWorkerCount(newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                setSync((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
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
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                unsetPort();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                unsetReceiveBufferSize();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                unsetSendBufferSize();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL:
                unsetSsl();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER:
                setSslHandler(SSL_HANDLER_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH:
                unsetNeedClientAuth();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PASSPHRASE:
                setPassphrase(PASSPHRASE_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER:
                setSecurityProvider(SECURITY_PROVIDER_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT:
                setKeyStoreFormat(KEY_STORE_FORMAT_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE:
                setKeyStoreFile(KEY_STORE_FILE_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE:
                setTrustStoreFile(TRUST_STORE_FILE_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF:
                setSslContextParametersRef(SSL_CONTEXT_PARAMETERS_REF_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                unsetReuseAddress();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                setEncoders(ENCODERS_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                setDecoders(DECODERS_EDEFAULT);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                unsetAllowDefaultCodec();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                unsetWorkerCount();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                unsetSync();
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
                unsetDisconnect();
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
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                return isSetPort();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                return isSetReceiveBufferSize();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                return isSetSendBufferSize();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL:
                return isSetSsl();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER:
                return SSL_HANDLER_EDEFAULT == null ? sslHandler != null : !SSL_HANDLER_EDEFAULT.equals(sslHandler);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH:
                return isSetNeedClientAuth();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__PASSPHRASE:
                return PASSPHRASE_EDEFAULT == null ? passphrase != null : !PASSPHRASE_EDEFAULT.equals(passphrase);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER:
                return SECURITY_PROVIDER_EDEFAULT == null ? securityProvider != null : !SECURITY_PROVIDER_EDEFAULT.equals(securityProvider);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT:
                return KEY_STORE_FORMAT_EDEFAULT == null ? keyStoreFormat != null : !KEY_STORE_FORMAT_EDEFAULT.equals(keyStoreFormat);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE:
                return KEY_STORE_FILE_EDEFAULT == null ? keyStoreFile != null : !KEY_STORE_FILE_EDEFAULT.equals(keyStoreFile);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE:
                return TRUST_STORE_FILE_EDEFAULT == null ? trustStoreFile != null : !TRUST_STORE_FILE_EDEFAULT.equals(trustStoreFile);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF:
                return SSL_CONTEXT_PARAMETERS_REF_EDEFAULT == null ? sslContextParametersRef != null : !SSL_CONTEXT_PARAMETERS_REF_EDEFAULT.equals(sslContextParametersRef);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                return isSetReuseAddress();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                return ENCODERS_EDEFAULT == null ? encoders != null : !ENCODERS_EDEFAULT.equals(encoders);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                return DECODERS_EDEFAULT == null ? decoders != null : !DECODERS_EDEFAULT.equals(decoders);
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                return isSetAllowDefaultCodec();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                return isSetWorkerCount();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                return isSetSync();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
                return isSetDisconnect();
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
        result.append(", receiveBufferSize: ");
        if (receiveBufferSizeESet) result.append(receiveBufferSize); else result.append("<unset>");
        result.append(", sendBufferSize: ");
        if (sendBufferSizeESet) result.append(sendBufferSize); else result.append("<unset>");
        result.append(", ssl: ");
        if (sslESet) result.append(ssl); else result.append("<unset>");
        result.append(", sslHandler: ");
        result.append(sslHandler);
        result.append(", needClientAuth: ");
        if (needClientAuthESet) result.append(needClientAuth); else result.append("<unset>");
        result.append(", passphrase: ");
        result.append(passphrase);
        result.append(", securityProvider: ");
        result.append(securityProvider);
        result.append(", keyStoreFormat: ");
        result.append(keyStoreFormat);
        result.append(", keyStoreFile: ");
        result.append(keyStoreFile);
        result.append(", trustStoreFile: ");
        result.append(trustStoreFile);
        result.append(", sslContextParametersRef: ");
        result.append(sslContextParametersRef);
        result.append(", reuseAddress: ");
        if (reuseAddressESet) result.append(reuseAddress); else result.append("<unset>");
        result.append(", encoders: ");
        result.append(encoders);
        result.append(", decoders: ");
        result.append(decoders);
        result.append(", allowDefaultCodec: ");
        if (allowDefaultCodecESet) result.append(allowDefaultCodec); else result.append("<unset>");
        result.append(", workerCount: ");
        if (workerCountESet) result.append(workerCount); else result.append("<unset>");
        result.append(", sync: ");
        if (syncESet) result.append(sync); else result.append("<unset>");
        result.append(", disconnect: ");
        if (disconnectESet) result.append(disconnect); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelNettyBindingTypeImpl
