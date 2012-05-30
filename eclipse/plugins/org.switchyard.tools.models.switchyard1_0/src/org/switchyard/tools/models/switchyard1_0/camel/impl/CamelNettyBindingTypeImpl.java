/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netty Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getReceiveBufferSize <em>Receive Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getSendBufferSize <em>Send Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#isReuseAddress <em>Reuse Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#isAllowDefaultCodec <em>Allow Default Codec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#getWorkerCount <em>Worker Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#isSync <em>Sync</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyBindingTypeImpl#isDisconnect <em>Disconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelNettyBindingTypeImpl extends BaseCamelBindingImpl implements CamelNettyBindingType {
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
     * The default value of the '{@link #getReceiveBufferSize() <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveBufferSize()
     * @generated
     * @ordered
     */
    protected static final long RECEIVE_BUFFER_SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getReceiveBufferSize() <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveBufferSize()
     * @generated
     * @ordered
     */
    protected long receiveBufferSize = RECEIVE_BUFFER_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getSendBufferSize() <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendBufferSize()
     * @generated
     * @ordered
     */
    protected static final long SEND_BUFFER_SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSendBufferSize() <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendBufferSize()
     * @generated
     * @ordered
     */
    protected long sendBufferSize = SEND_BUFFER_SIZE_EDEFAULT;

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
     * This is true if the Decoders attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean decodersESet;

    /**
     * The default value of the '{@link #isAllowDefaultCodec() <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowDefaultCodec()
     * @generated
     * @ordered
     */
    protected static final boolean ALLOW_DEFAULT_CODEC_EDEFAULT = false;

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
    protected static final int WORKER_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getWorkerCount() <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkerCount()
     * @generated
     * @ordered
     */
    protected int workerCount = WORKER_COUNT_EDEFAULT;

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
    protected static final boolean SYNC_EDEFAULT = false;

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
        return CamelPackage.Literals.CAMEL_NETTY_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__HOST, oldHost, host));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getReceiveBufferSize() {
        return receiveBufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReceiveBufferSize(long newReceiveBufferSize) {
        long oldReceiveBufferSize = receiveBufferSize;
        receiveBufferSize = newReceiveBufferSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE, oldReceiveBufferSize, receiveBufferSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getSendBufferSize() {
        return sendBufferSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendBufferSize(long newSendBufferSize) {
        long oldSendBufferSize = sendBufferSize;
        sendBufferSize = newSendBufferSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE, oldSendBufferSize, sendBufferSize));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS, oldReuseAddress, reuseAddress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS, oldEncoders, encoders));
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
        boolean oldDecodersESet = decodersESet;
        decodersESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS, oldDecoders, decoders, !oldDecodersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDecoders() {
        String oldDecoders = decoders;
        boolean oldDecodersESet = decodersESet;
        decoders = DECODERS_EDEFAULT;
        decodersESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS, oldDecoders, DECODERS_EDEFAULT, oldDecodersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDecoders() {
        return decodersESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC, oldAllowDefaultCodec, allowDefaultCodec, !oldAllowDefaultCodecESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC, oldAllowDefaultCodec, ALLOW_DEFAULT_CODEC_EDEFAULT, oldAllowDefaultCodecESet));
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
    public int getWorkerCount() {
        return workerCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorkerCount(int newWorkerCount) {
        int oldWorkerCount = workerCount;
        workerCount = newWorkerCount;
        boolean oldWorkerCountESet = workerCountESet;
        workerCountESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT, oldWorkerCount, workerCount, !oldWorkerCountESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetWorkerCount() {
        int oldWorkerCount = workerCount;
        boolean oldWorkerCountESet = workerCountESet;
        workerCount = WORKER_COUNT_EDEFAULT;
        workerCountESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT, oldWorkerCount, WORKER_COUNT_EDEFAULT, oldWorkerCountESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__SYNC, oldSync, sync, !oldSyncESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__SYNC, oldSync, SYNC_EDEFAULT, oldSyncESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
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
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                return getHost();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                return getPort();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                return getReceiveBufferSize();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                return getSendBufferSize();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                return isReuseAddress();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                return getEncoders();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                return getDecoders();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                return isAllowDefaultCodec();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                return getWorkerCount();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                return isSync();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
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
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                setPort((Integer)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                setReceiveBufferSize((Long)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                setSendBufferSize((Long)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                setReuseAddress((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                setEncoders((String)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                setDecoders((String)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                setAllowDefaultCodec((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                setWorkerCount((Integer)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                setSync((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
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
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                setReceiveBufferSize(RECEIVE_BUFFER_SIZE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                setSendBufferSize(SEND_BUFFER_SIZE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                setReuseAddress(REUSE_ADDRESS_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                setEncoders(ENCODERS_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                unsetDecoders();
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                unsetAllowDefaultCodec();
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                unsetWorkerCount();
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                unsetSync();
                return;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
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
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__PORT:
                return port != PORT_EDEFAULT;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE:
                return receiveBufferSize != RECEIVE_BUFFER_SIZE_EDEFAULT;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE:
                return sendBufferSize != SEND_BUFFER_SIZE_EDEFAULT;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS:
                return reuseAddress != REUSE_ADDRESS_EDEFAULT;
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ENCODERS:
                return ENCODERS_EDEFAULT == null ? encoders != null : !ENCODERS_EDEFAULT.equals(encoders);
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DECODERS:
                return isSetDecoders();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC:
                return isSetAllowDefaultCodec();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT:
                return isSetWorkerCount();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__SYNC:
                return isSetSync();
            case CamelPackage.CAMEL_NETTY_BINDING_TYPE__DISCONNECT:
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
        result.append(port);
        result.append(", receiveBufferSize: ");
        result.append(receiveBufferSize);
        result.append(", sendBufferSize: ");
        result.append(sendBufferSize);
        result.append(", reuseAddress: ");
        result.append(reuseAddress);
        result.append(", encoders: ");
        result.append(encoders);
        result.append(", decoders: ");
        if (decodersESet) result.append(decoders); else result.append("<unset>");
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
