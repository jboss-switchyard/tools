/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#isReuseAddress <em>Reuse Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getAllowDefaultCodec <em>Allow Default Codec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getWorkerCount <em>Worker Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getSync <em>Sync</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl#getDisconnect <em>Disconnect</em>}</li>
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
     * The default value of the '{@link #getReceiveBufferSize() <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveBufferSize()
     * @generated
     * @ordered
     */
    protected static final Long RECEIVE_BUFFER_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReceiveBufferSize() <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveBufferSize()
     * @generated
     * @ordered
     */
    protected Long receiveBufferSize = RECEIVE_BUFFER_SIZE_EDEFAULT;

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
    protected static final Long SEND_BUFFER_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSendBufferSize() <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendBufferSize()
     * @generated
     * @ordered
     */
    protected Long sendBufferSize = SEND_BUFFER_SIZE_EDEFAULT;

    /**
     * This is true if the Send Buffer Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sendBufferSizeESet;

    /**
     * The default value of the '{@link #isReuseAddress() <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReuseAddress()
     * @generated
     * @ordered
     */
    protected static final boolean REUSE_ADDRESS_EDEFAULT = false;

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
     * The default value of the '{@link #getAllowDefaultCodec() <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllowDefaultCodec()
     * @generated
     * @ordered
     */
    protected static final Boolean ALLOW_DEFAULT_CODEC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAllowDefaultCodec() <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllowDefaultCodec()
     * @generated
     * @ordered
     */
    protected Boolean allowDefaultCodec = ALLOW_DEFAULT_CODEC_EDEFAULT;

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
    protected static final Integer WORKER_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWorkerCount() <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkerCount()
     * @generated
     * @ordered
     */
    protected Integer workerCount = WORKER_COUNT_EDEFAULT;

    /**
     * This is true if the Worker Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workerCountESet;

    /**
     * The default value of the '{@link #getSync() <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSync()
     * @generated
     * @ordered
     */
    protected static final Boolean SYNC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSync() <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSync()
     * @generated
     * @ordered
     */
    protected Boolean sync = SYNC_EDEFAULT;

    /**
     * This is true if the Sync attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean syncESet;

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
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__PORT, oldPort, port, !oldPortESet));
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
    public Long getReceiveBufferSize() {
        return receiveBufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReceiveBufferSize(Long newReceiveBufferSize) {
        Long oldReceiveBufferSize = receiveBufferSize;
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
        Long oldReceiveBufferSize = receiveBufferSize;
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
    public Long getSendBufferSize() {
        return sendBufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendBufferSize(Long newSendBufferSize) {
        Long oldSendBufferSize = sendBufferSize;
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
        Long oldSendBufferSize = sendBufferSize;
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
    public Boolean getAllowDefaultCodec() {
        return allowDefaultCodec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAllowDefaultCodec(Boolean newAllowDefaultCodec) {
        Boolean oldAllowDefaultCodec = allowDefaultCodec;
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
        Boolean oldAllowDefaultCodec = allowDefaultCodec;
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
    public Integer getWorkerCount() {
        return workerCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorkerCount(Integer newWorkerCount) {
        Integer oldWorkerCount = workerCount;
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
        Integer oldWorkerCount = workerCount;
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
    public Boolean getSync() {
        return sync;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSync(Boolean newSync) {
        Boolean oldSync = sync;
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
        Boolean oldSync = sync;
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
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
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
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                return isReuseAddress();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                return getEncoders();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                return getDecoders();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                return getAllowDefaultCodec();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                return getWorkerCount();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                return getSync();
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
                return getDisconnect();
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
                setPort((Integer)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                setReceiveBufferSize((Long)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                setSendBufferSize((Long)newValue);
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
                setWorkerCount((Integer)newValue);
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
