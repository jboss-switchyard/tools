/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netty Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isSync <em>Sync</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType()
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getHost <em>Host</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_Port()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getPort <em>Port</em>}' attribute.
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
     * @see #setReceiveBufferSize(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_ReceiveBufferSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='receiveBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    long getReceiveBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receive Buffer Size</em>' attribute.
     * @see #getReceiveBufferSize()
     * @generated
     */
    void setReceiveBufferSize(long value);

    /**
     * Returns the value of the '<em><b>Send Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Buffer Size</em>' attribute.
     * @see #setSendBufferSize(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_SendBufferSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='sendBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    long getSendBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Buffer Size</em>' attribute.
     * @see #getSendBufferSize()
     * @generated
     */
    void setSendBufferSize(long value);

    /**
     * Returns the value of the '<em><b>Reuse Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reuse Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reuse Address</em>' attribute.
     * @see #setReuseAddress(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_ReuseAddress()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='reuseAddress' namespace='##targetNamespace'"
     * @generated
     */
    boolean isReuseAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reuse Address</em>' attribute.
     * @see #isReuseAddress()
     * @generated
     */
    void setReuseAddress(boolean value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_Encoders()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='encoders' namespace='##targetNamespace'"
     * @generated
     */
    String getEncoders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getEncoders <em>Encoders</em>}' attribute.
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
     * @see #isSetDecoders()
     * @see #unsetDecoders()
     * @see #setDecoders(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_Decoders()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='decoders' namespace='##targetNamespace'"
     * @generated
     */
    String getDecoders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDecoders()
     * @see #getDecoders()
     * @see #setDecoders(String)
     * @generated
     */
    void unsetDecoders();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getDecoders <em>Decoders</em>}' attribute is set.
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
     * @see #setAllowDefaultCodec(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_AllowDefaultCodec()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='allowDefaultCodec' namespace='##targetNamespace'"
     * @generated
     */
    boolean isAllowDefaultCodec();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAllowDefaultCodec()
     * @see #isAllowDefaultCodec()
     * @see #setAllowDefaultCodec(boolean)
     * @generated
     */
    void unsetAllowDefaultCodec();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_WorkerCount()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='workerCount' namespace='##targetNamespace'"
     * @generated
     */
    int getWorkerCount();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkerCount()
     * @see #getWorkerCount()
     * @see #setWorkerCount(int)
     * @generated
     */
    void unsetWorkerCount();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_Sync()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='sync' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSync();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isSync <em>Sync</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isSync <em>Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSync()
     * @see #isSync()
     * @see #setSync(boolean)
     * @generated
     */
    void unsetSync();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isSync <em>Sync</em>}' attribute is set.
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
     * @see #setDisconnect(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyBindingType_Disconnect()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}' attribute is set.
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
