/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Netty Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync <em>Sync</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType()
 * @model abstract="true"
 *        extendedMetaData="name='CamelNettyBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelNettyBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #isSetPort()
     * @see #unsetPort()
     * @see #setPort(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Port()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #isSetPort()
     * @see #unsetPort()
     * @see #getPort()
     * @generated
     */
    void setPort(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPort()
     * @see #getPort()
     * @see #setPort(int)
     * @generated
     */
    void unsetPort();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Port</em>' attribute is set.
     * @see #unsetPort()
     * @see #getPort()
     * @see #setPort(int)
     * @generated
     */
    boolean isSetPort();

    /**
     * Returns the value of the '<em><b>Receive Buffer Size</b></em>' attribute.
     * The default value is <code>"65536"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receive Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receive Buffer Size</em>' attribute.
     * @see #isSetReceiveBufferSize()
     * @see #unsetReceiveBufferSize()
     * @see #setReceiveBufferSize(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_ReceiveBufferSize()
     * @model default="65536" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='receiveBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    long getReceiveBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receive Buffer Size</em>' attribute.
     * @see #isSetReceiveBufferSize()
     * @see #unsetReceiveBufferSize()
     * @see #getReceiveBufferSize()
     * @generated
     */
    void setReceiveBufferSize(long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceiveBufferSize()
     * @see #getReceiveBufferSize()
     * @see #setReceiveBufferSize(long)
     * @generated
     */
    void unsetReceiveBufferSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receive Buffer Size</em>' attribute is set.
     * @see #unsetReceiveBufferSize()
     * @see #getReceiveBufferSize()
     * @see #setReceiveBufferSize(long)
     * @generated
     */
    boolean isSetReceiveBufferSize();

    /**
     * Returns the value of the '<em><b>Send Buffer Size</b></em>' attribute.
     * The default value is <code>"65536"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Buffer Size</em>' attribute.
     * @see #isSetSendBufferSize()
     * @see #unsetSendBufferSize()
     * @see #setSendBufferSize(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_SendBufferSize()
     * @model default="65536" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='sendBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    long getSendBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Buffer Size</em>' attribute.
     * @see #isSetSendBufferSize()
     * @see #unsetSendBufferSize()
     * @see #getSendBufferSize()
     * @generated
     */
    void setSendBufferSize(long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendBufferSize()
     * @see #getSendBufferSize()
     * @see #setSendBufferSize(long)
     * @generated
     */
    void unsetSendBufferSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Buffer Size</em>' attribute is set.
     * @see #unsetSendBufferSize()
     * @see #getSendBufferSize()
     * @see #setSendBufferSize(long)
     * @generated
     */
    boolean isSetSendBufferSize();

    /**
     * Returns the value of the '<em><b>Reuse Address</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reuse Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reuse Address</em>' attribute.
     * @see #isSetReuseAddress()
     * @see #unsetReuseAddress()
     * @see #setReuseAddress(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_ReuseAddress()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='reuseAddress' namespace='##targetNamespace'"
     * @generated
     */
    boolean isReuseAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reuse Address</em>' attribute.
     * @see #isSetReuseAddress()
     * @see #unsetReuseAddress()
     * @see #isReuseAddress()
     * @generated
     */
    void setReuseAddress(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReuseAddress()
     * @see #isReuseAddress()
     * @see #setReuseAddress(boolean)
     * @generated
     */
    void unsetReuseAddress();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reuse Address</em>' attribute is set.
     * @see #unsetReuseAddress()
     * @see #isReuseAddress()
     * @see #setReuseAddress(boolean)
     * @generated
     */
    boolean isSetReuseAddress();

    /**
     * Returns the value of the '<em><b>Encoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Encoders</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Encoders</em>' attribute.
     * @see #setEncoders(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Encoders()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='encoders' namespace='##targetNamespace'"
     * @generated
     */
    String getEncoders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encoders</em>' attribute.
     * @see #getEncoders()
     * @generated
     */
    void setEncoders(String value);

    /**
     * Returns the value of the '<em><b>Decoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decoders</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Decoders</em>' attribute.
     * @see #setDecoders(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Decoders()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='decoders' namespace='##targetNamespace'"
     * @generated
     */
    String getDecoders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decoders</em>' attribute.
     * @see #getDecoders()
     * @generated
     */
    void setDecoders(String value);

    /**
     * Returns the value of the '<em><b>Allow Default Codec</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allow Default Codec</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allow Default Codec</em>' attribute.
     * @see #isSetAllowDefaultCodec()
     * @see #unsetAllowDefaultCodec()
     * @see #setAllowDefaultCodec(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_AllowDefaultCodec()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='allowDefaultCodec' namespace='##targetNamespace'"
     * @generated
     */
    boolean isAllowDefaultCodec();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allow Default Codec</em>' attribute.
     * @see #isSetAllowDefaultCodec()
     * @see #unsetAllowDefaultCodec()
     * @see #isAllowDefaultCodec()
     * @generated
     */
    void setAllowDefaultCodec(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAllowDefaultCodec()
     * @see #isAllowDefaultCodec()
     * @see #setAllowDefaultCodec(boolean)
     * @generated
     */
    void unsetAllowDefaultCodec();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Allow Default Codec</em>' attribute is set.
     * @see #unsetAllowDefaultCodec()
     * @see #isAllowDefaultCodec()
     * @see #setAllowDefaultCodec(boolean)
     * @generated
     */
    boolean isSetAllowDefaultCodec();

    /**
     * Returns the value of the '<em><b>Worker Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Worker Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Worker Count</em>' attribute.
     * @see #isSetWorkerCount()
     * @see #unsetWorkerCount()
     * @see #setWorkerCount(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_WorkerCount()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='workerCount' namespace='##targetNamespace'"
     * @generated
     */
    int getWorkerCount();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Worker Count</em>' attribute.
     * @see #isSetWorkerCount()
     * @see #unsetWorkerCount()
     * @see #getWorkerCount()
     * @generated
     */
    void setWorkerCount(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkerCount()
     * @see #getWorkerCount()
     * @see #setWorkerCount(int)
     * @generated
     */
    void unsetWorkerCount();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Worker Count</em>' attribute is set.
     * @see #unsetWorkerCount()
     * @see #getWorkerCount()
     * @see #setWorkerCount(int)
     * @generated
     */
    boolean isSetWorkerCount();

    /**
     * Returns the value of the '<em><b>Sync</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sync</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sync</em>' attribute.
     * @see #isSetSync()
     * @see #unsetSync()
     * @see #setSync(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Sync()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='sync' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSync();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sync</em>' attribute.
     * @see #isSetSync()
     * @see #unsetSync()
     * @see #isSync()
     * @generated
     */
    void setSync(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSync()
     * @see #isSync()
     * @see #setSync(boolean)
     * @generated
     */
    void unsetSync();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync <em>Sync</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sync</em>' attribute is set.
     * @see #unsetSync()
     * @see #isSync()
     * @see #setSync(boolean)
     * @generated
     */
    boolean isSetSync();

    /**
     * Returns the value of the '<em><b>Disconnect</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disconnect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #setDisconnect(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Disconnect()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #isDisconnect()
     * @generated
     */
    void setDisconnect(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disconnect</em>' attribute is set.
     * @see #unsetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    boolean isSetDisconnect();

} // CamelNettyBindingType
