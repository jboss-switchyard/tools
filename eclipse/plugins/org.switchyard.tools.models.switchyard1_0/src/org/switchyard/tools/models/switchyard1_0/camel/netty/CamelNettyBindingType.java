/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty;

import org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReuseAddress <em>Reuse Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getAllowDefaultCodec <em>Allow Default Codec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync <em>Sync</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDisconnect <em>Disconnect</em>}</li>
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
     * @see #setPort(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Port()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(int value);

    /**
     * Returns the value of the '<em><b>Receive Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receive Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receive Buffer Size</em>' attribute.
     * @see #setReceiveBufferSize(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_ReceiveBufferSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='receiveBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    Long getReceiveBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receive Buffer Size</em>' attribute.
     * @see #getReceiveBufferSize()
     * @generated
     */
    void setReceiveBufferSize(Long value);

    /**
     * Returns the value of the '<em><b>Send Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Buffer Size</em>' attribute.
     * @see #setSendBufferSize(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_SendBufferSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='sendBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    Long getSendBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Buffer Size</em>' attribute.
     * @see #getSendBufferSize()
     * @generated
     */
    void setSendBufferSize(Long value);

    /**
     * Returns the value of the '<em><b>Reuse Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reuse Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reuse Address</em>' attribute.
     * @see #isSetReuseAddress()
     * @see #unsetReuseAddress()
     * @see #setReuseAddress(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_ReuseAddress()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='reuseAddress' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getReuseAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReuseAddress <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reuse Address</em>' attribute.
     * @see #isSetReuseAddress()
     * @see #unsetReuseAddress()
     * @see #getReuseAddress()
     * @generated
     */
    void setReuseAddress(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReuseAddress <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReuseAddress()
     * @see #getReuseAddress()
     * @see #setReuseAddress(Boolean)
     * @generated
     */
    void unsetReuseAddress();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReuseAddress <em>Reuse Address</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reuse Address</em>' attribute is set.
     * @see #unsetReuseAddress()
     * @see #getReuseAddress()
     * @see #setReuseAddress(Boolean)
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
     * @see #isSetEncoders()
     * @see #unsetEncoders()
     * @see #setEncoders(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Encoders()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='encoders' namespace='##targetNamespace'"
     * @generated
     */
    String getEncoders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encoders</em>' attribute.
     * @see #isSetEncoders()
     * @see #unsetEncoders()
     * @see #getEncoders()
     * @generated
     */
    void setEncoders(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEncoders()
     * @see #getEncoders()
     * @see #setEncoders(String)
     * @generated
     */
    void unsetEncoders();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Encoders</em>' attribute is set.
     * @see #unsetEncoders()
     * @see #getEncoders()
     * @see #setEncoders(String)
     * @generated
     */
    boolean isSetEncoders();

    /**
     * Returns the value of the '<em><b>Decoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decoders</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Decoders</em>' attribute.
     * @see #isSetDecoders()
     * @see #unsetDecoders()
     * @see #setDecoders(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Decoders()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='decoders' namespace='##targetNamespace'"
     * @generated
     */
    String getDecoders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decoders</em>' attribute.
     * @see #isSetDecoders()
     * @see #unsetDecoders()
     * @see #getDecoders()
     * @generated
     */
    void setDecoders(String value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDecoders()
     * @see #getDecoders()
     * @see #setDecoders(String)
     * @generated
     */
    void unsetDecoders();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Decoders</em>' attribute is set.
     * @see #unsetDecoders()
     * @see #getDecoders()
     * @see #setDecoders(String)
     * @generated
     */
    boolean isSetDecoders();

    /**
     * Returns the value of the '<em><b>Allow Default Codec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allow Default Codec</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allow Default Codec</em>' attribute.
     * @see #isSetAllowDefaultCodec()
     * @see #unsetAllowDefaultCodec()
     * @see #setAllowDefaultCodec(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_AllowDefaultCodec()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='allowDefaultCodec' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getAllowDefaultCodec();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getAllowDefaultCodec <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allow Default Codec</em>' attribute.
     * @see #isSetAllowDefaultCodec()
     * @see #unsetAllowDefaultCodec()
     * @see #getAllowDefaultCodec()
     * @generated
     */
    void setAllowDefaultCodec(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getAllowDefaultCodec <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAllowDefaultCodec()
     * @see #getAllowDefaultCodec()
     * @see #setAllowDefaultCodec(Boolean)
     * @generated
     */
    void unsetAllowDefaultCodec();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getAllowDefaultCodec <em>Allow Default Codec</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Allow Default Codec</em>' attribute is set.
     * @see #unsetAllowDefaultCodec()
     * @see #getAllowDefaultCodec()
     * @see #setAllowDefaultCodec(Boolean)
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
     * @see #setWorkerCount(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_WorkerCount()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='workerCount' namespace='##targetNamespace'"
     * @generated
     */
    Integer getWorkerCount();

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
    void setWorkerCount(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkerCount()
     * @see #getWorkerCount()
     * @see #setWorkerCount(Integer)
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
     * @see #setWorkerCount(Integer)
     * @generated
     */
    boolean isSetWorkerCount();

    /**
     * Returns the value of the '<em><b>Sync</b></em>' attribute.
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
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
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
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disconnect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #setDisconnect(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Disconnect()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #getDisconnect()
     * @generated
     */
    void setDisconnect(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDisconnect <em>Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disconnect</em>' attribute is set.
     * @see #unsetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
     * @generated
     */
    boolean isSetDisconnect();

} // CamelNettyBindingType
