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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSsl <em>Ssl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslHandler <em>Ssl Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPassphrase <em>Passphrase</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSecurityProvider <em>Security Provider</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFormat <em>Key Store Format</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFile <em>Key Store File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getTrustStoreFile <em>Trust Store File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslContextParametersRef <em>Ssl Context Parameters Ref</em>}</li>
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
     * @see #setPort(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Port()
     * @model unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger" required="true"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    Object getPort();

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
    void setPort(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPort()
     * @see #getPort()
     * @see #setPort(Object)
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
     * @see #setPort(Object)
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
     * @see #setReceiveBufferSize(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_ReceiveBufferSize()
     * @model default="65536" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropLong"
     *        extendedMetaData="kind='element' name='receiveBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    Object getReceiveBufferSize();

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
    void setReceiveBufferSize(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceiveBufferSize()
     * @see #getReceiveBufferSize()
     * @see #setReceiveBufferSize(Object)
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
     * @see #setReceiveBufferSize(Object)
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
     * @see #setSendBufferSize(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_SendBufferSize()
     * @model default="65536" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropLong"
     *        extendedMetaData="kind='element' name='sendBufferSize' namespace='##targetNamespace'"
     * @generated
     */
    Object getSendBufferSize();

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
    void setSendBufferSize(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendBufferSize()
     * @see #getSendBufferSize()
     * @see #setSendBufferSize(Object)
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
     * @see #setSendBufferSize(Object)
     * @generated
     */
    boolean isSetSendBufferSize();

    /**
     * Returns the value of the '<em><b>Ssl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ssl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ssl</em>' attribute.
     * @see #isSetSsl()
     * @see #unsetSsl()
     * @see #setSsl(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Ssl()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='ssl' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSsl();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSsl <em>Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ssl</em>' attribute.
     * @see #isSetSsl()
     * @see #unsetSsl()
     * @see #isSsl()
     * @generated
     */
    void setSsl(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSsl <em>Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSsl()
     * @see #isSsl()
     * @see #setSsl(boolean)
     * @generated
     */
    void unsetSsl();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSsl <em>Ssl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ssl</em>' attribute is set.
     * @see #unsetSsl()
     * @see #isSsl()
     * @see #setSsl(boolean)
     * @generated
     */
    boolean isSetSsl();

    /**
     * Returns the value of the '<em><b>Ssl Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ssl Handler</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ssl Handler</em>' attribute.
     * @see #setSslHandler(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_SslHandler()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sslHandler' namespace='##targetNamespace'"
     * @generated
     */
    String getSslHandler();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslHandler <em>Ssl Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ssl Handler</em>' attribute.
     * @see #getSslHandler()
     * @generated
     */
    void setSslHandler(String value);

    /**
     * Returns the value of the '<em><b>Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passphrase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passphrase</em>' attribute.
     * @see #setPassphrase(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_Passphrase()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='passphrase' namespace='##targetNamespace'"
     * @generated
     */
    String getPassphrase();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPassphrase <em>Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passphrase</em>' attribute.
     * @see #getPassphrase()
     * @generated
     */
    void setPassphrase(String value);

    /**
     * Returns the value of the '<em><b>Security Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Provider</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Security Provider</em>' attribute.
     * @see #setSecurityProvider(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_SecurityProvider()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='securityProvider' namespace='##targetNamespace'"
     * @generated
     */
    String getSecurityProvider();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSecurityProvider <em>Security Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security Provider</em>' attribute.
     * @see #getSecurityProvider()
     * @generated
     */
    void setSecurityProvider(String value);

    /**
     * Returns the value of the '<em><b>Key Store Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Store Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Store Format</em>' attribute.
     * @see #setKeyStoreFormat(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_KeyStoreFormat()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='keyStoreFormat' namespace='##targetNamespace'"
     * @generated
     */
    String getKeyStoreFormat();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFormat <em>Key Store Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Store Format</em>' attribute.
     * @see #getKeyStoreFormat()
     * @generated
     */
    void setKeyStoreFormat(String value);

    /**
     * Returns the value of the '<em><b>Key Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Store File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Store File</em>' attribute.
     * @see #setKeyStoreFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_KeyStoreFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='keyStoreFile' namespace='##targetNamespace'"
     * @generated
     */
    String getKeyStoreFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFile <em>Key Store File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Store File</em>' attribute.
     * @see #getKeyStoreFile()
     * @generated
     */
    void setKeyStoreFile(String value);

    /**
     * Returns the value of the '<em><b>Trust Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trust Store File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trust Store File</em>' attribute.
     * @see #setTrustStoreFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_TrustStoreFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='trustStoreFile' namespace='##targetNamespace'"
     * @generated
     */
    String getTrustStoreFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getTrustStoreFile <em>Trust Store File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trust Store File</em>' attribute.
     * @see #getTrustStoreFile()
     * @generated
     */
    void setTrustStoreFile(String value);

    /**
     * Returns the value of the '<em><b>Ssl Context Parameters Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ssl Context Parameters Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ssl Context Parameters Ref</em>' attribute.
     * @see #setSslContextParametersRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_SslContextParametersRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='sslContextParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    String getSslContextParametersRef();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslContextParametersRef <em>Ssl Context Parameters Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ssl Context Parameters Ref</em>' attribute.
     * @see #getSslContextParametersRef()
     * @generated
     */
    void setSslContextParametersRef(String value);

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
     * @see #setWorkerCount(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#getCamelNettyBindingType_WorkerCount()
     * @model unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='workerCount' namespace='##targetNamespace'"
     * @generated
     */
    Object getWorkerCount();

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
    void setWorkerCount(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkerCount()
     * @see #getWorkerCount()
     * @see #setWorkerCount(Object)
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
     * @see #setWorkerCount(Object)
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
