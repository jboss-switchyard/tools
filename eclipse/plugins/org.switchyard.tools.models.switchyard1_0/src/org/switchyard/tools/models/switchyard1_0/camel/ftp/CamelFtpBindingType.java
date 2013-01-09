/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType()
 * @model extendedMetaData="name='CamelFtpBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelFtpBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Directory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Directory</em>' attribute.
     * @see #setDirectory(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Directory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='directory' namespace='##targetNamespace'"
     * @generated
     */
    String getDirectory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getDirectory <em>Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Directory</em>' attribute.
     * @see #getDirectory()
     * @generated
     */
    void setDirectory(String value);

    /**
     * Returns the value of the '<em><b>Auto Create</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auto Create</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auto Create</em>' attribute.
     * @see #isSetAutoCreate()
     * @see #unsetAutoCreate()
     * @see #setAutoCreate(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_AutoCreate()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='autoCreate' namespace='##targetNamespace'"
     * @generated
     */
    boolean isAutoCreate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto Create</em>' attribute.
     * @see #isSetAutoCreate()
     * @see #unsetAutoCreate()
     * @see #isAutoCreate()
     * @generated
     */
    void setAutoCreate(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutoCreate()
     * @see #isAutoCreate()
     * @see #setAutoCreate(boolean)
     * @generated
     */
    void unsetAutoCreate();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isAutoCreate <em>Auto Create</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auto Create</em>' attribute is set.
     * @see #unsetAutoCreate()
     * @see #isAutoCreate()
     * @see #setAutoCreate(boolean)
     * @generated
     */
    boolean isSetAutoCreate();

    /**
     * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
     * The default value is <code>"131072"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Buffer Size</em>' attribute.
     * @see #isSetBufferSize()
     * @see #unsetBufferSize()
     * @see #setBufferSize(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_BufferSize()
     * @model default="131072" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='bufferSize' namespace='##targetNamespace'"
     * @generated
     */
    int getBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buffer Size</em>' attribute.
     * @see #isSetBufferSize()
     * @see #unsetBufferSize()
     * @see #getBufferSize()
     * @generated
     */
    void setBufferSize(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBufferSize()
     * @see #getBufferSize()
     * @see #setBufferSize(int)
     * @generated
     */
    void unsetBufferSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBufferSize <em>Buffer Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buffer Size</em>' attribute is set.
     * @see #unsetBufferSize()
     * @see #getBufferSize()
     * @see #setBufferSize(int)
     * @generated
     */
    boolean isSetBufferSize();

    /**
     * Returns the value of the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Name</em>' attribute.
     * @see #setFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_FileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
     * @generated
     */
    String getFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getFileName <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Name</em>' attribute.
     * @see #getFileName()
     * @generated
     */
    void setFileName(String value);

    /**
     * Returns the value of the '<em><b>Flatten</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flatten</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flatten</em>' attribute.
     * @see #isSetFlatten()
     * @see #unsetFlatten()
     * @see #setFlatten(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Flatten()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='flatten' namespace='##targetNamespace'"
     * @generated
     */
    boolean isFlatten();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flatten</em>' attribute.
     * @see #isSetFlatten()
     * @see #unsetFlatten()
     * @see #isFlatten()
     * @generated
     */
    void setFlatten(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlatten()
     * @see #isFlatten()
     * @see #setFlatten(boolean)
     * @generated
     */
    void unsetFlatten();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isFlatten <em>Flatten</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flatten</em>' attribute is set.
     * @see #unsetFlatten()
     * @see #isFlatten()
     * @see #setFlatten(boolean)
     * @generated
     */
    boolean isSetFlatten();

    /**
     * Returns the value of the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Charset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Charset</em>' attribute.
     * @see #setCharset(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Charset()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='charset' namespace='##targetNamespace'"
     * @generated
     */
    String getCharset();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getCharset <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charset</em>' attribute.
     * @see #getCharset()
     * @generated
     */
    void setCharset(String value);

    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Host()
     * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getHost <em>Host</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Port()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPort <em>Port</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPort()
     * @see #getPort()
     * @see #setPort(int)
     * @generated
     */
    void unsetPort();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPort <em>Port</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Username</em>' attribute.
     * @see #setUsername(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Username</em>' attribute.
     * @see #getUsername()
     * @generated
     */
    void setUsername(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Binary</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binary</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binary</em>' attribute.
     * @see #isSetBinary()
     * @see #unsetBinary()
     * @see #setBinary(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Binary()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='binary' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBinary();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isBinary <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binary</em>' attribute.
     * @see #isSetBinary()
     * @see #unsetBinary()
     * @see #isBinary()
     * @generated
     */
    void setBinary(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isBinary <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinary()
     * @see #isBinary()
     * @see #setBinary(boolean)
     * @generated
     */
    void unsetBinary();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isBinary <em>Binary</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Binary</em>' attribute is set.
     * @see #unsetBinary()
     * @see #isBinary()
     * @see #setBinary(boolean)
     * @generated
     */
    boolean isSetBinary();

    /**
     * Returns the value of the '<em><b>Connect Timeout</b></em>' attribute.
     * The default value is <code>"10000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connect Timeout</em>' attribute.
     * @see #isSetConnectTimeout()
     * @see #unsetConnectTimeout()
     * @see #setConnectTimeout(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_ConnectTimeout()
     * @model default="10000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='connectTimeout' namespace='##targetNamespace'"
     * @generated
     */
    int getConnectTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connect Timeout</em>' attribute.
     * @see #isSetConnectTimeout()
     * @see #unsetConnectTimeout()
     * @see #getConnectTimeout()
     * @generated
     */
    void setConnectTimeout(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectTimeout()
     * @see #getConnectTimeout()
     * @see #setConnectTimeout(int)
     * @generated
     */
    void unsetConnectTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connect Timeout</em>' attribute is set.
     * @see #unsetConnectTimeout()
     * @see #getConnectTimeout()
     * @see #setConnectTimeout(int)
     * @generated
     */
    boolean isSetConnectTimeout();

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Disconnect()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isDisconnect <em>Disconnect</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isDisconnect <em>Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disconnect</em>' attribute is set.
     * @see #unsetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    boolean isSetDisconnect();

    /**
     * Returns the value of the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * The default value is <code>"3"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Reconnect Attempts</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Reconnect Attempts</em>' attribute.
     * @see #isSetMaximumReconnectAttempts()
     * @see #unsetMaximumReconnectAttempts()
     * @see #setMaximumReconnectAttempts(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_MaximumReconnectAttempts()
     * @model default="3" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='maximumReconnectAttempts' namespace='##targetNamespace'"
     * @generated
     */
    int getMaximumReconnectAttempts();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Reconnect Attempts</em>' attribute.
     * @see #isSetMaximumReconnectAttempts()
     * @see #unsetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @generated
     */
    void setMaximumReconnectAttempts(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @see #setMaximumReconnectAttempts(int)
     * @generated
     */
    void unsetMaximumReconnectAttempts();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Reconnect Attempts</em>' attribute is set.
     * @see #unsetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @see #setMaximumReconnectAttempts(int)
     * @generated
     */
    boolean isSetMaximumReconnectAttempts();

    /**
     * Returns the value of the '<em><b>Reconnect Delay</b></em>' attribute.
     * The default value is <code>"1000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconnect Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reconnect Delay</em>' attribute.
     * @see #isSetReconnectDelay()
     * @see #unsetReconnectDelay()
     * @see #setReconnectDelay(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_ReconnectDelay()
     * @model default="1000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='reconnectDelay' namespace='##targetNamespace'"
     * @generated
     */
    int getReconnectDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Delay</em>' attribute.
     * @see #isSetReconnectDelay()
     * @see #unsetReconnectDelay()
     * @see #getReconnectDelay()
     * @generated
     */
    void setReconnectDelay(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReconnectDelay()
     * @see #getReconnectDelay()
     * @see #setReconnectDelay(int)
     * @generated
     */
    void unsetReconnectDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reconnect Delay</em>' attribute is set.
     * @see #unsetReconnectDelay()
     * @see #getReconnectDelay()
     * @see #setReconnectDelay(int)
     * @generated
     */
    boolean isSetReconnectDelay();

    /**
     * Returns the value of the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Separator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Separator</em>' attribute.
     * @see #setSeparator(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Separator()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='separator' namespace='##targetNamespace'"
     * @generated
     */
    String getSeparator();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSeparator <em>Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Separator</em>' attribute.
     * @see #getSeparator()
     * @generated
     */
    void setSeparator(String value);

    /**
     * Returns the value of the '<em><b>Stepwise</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stepwise</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stepwise</em>' attribute.
     * @see #isSetStepwise()
     * @see #unsetStepwise()
     * @see #setStepwise(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Stepwise()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='stepwise' namespace='##targetNamespace'"
     * @generated
     */
    boolean isStepwise();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isStepwise <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stepwise</em>' attribute.
     * @see #isSetStepwise()
     * @see #unsetStepwise()
     * @see #isStepwise()
     * @generated
     */
    void setStepwise(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isStepwise <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepwise()
     * @see #isStepwise()
     * @see #setStepwise(boolean)
     * @generated
     */
    void unsetStepwise();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isStepwise <em>Stepwise</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stepwise</em>' attribute is set.
     * @see #unsetStepwise()
     * @see #isStepwise()
     * @see #setStepwise(boolean)
     * @generated
     */
    boolean isSetStepwise();

    /**
     * Returns the value of the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throw Exception On Connect Failed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Throw Exception On Connect Failed</em>' attribute.
     * @see #isSetThrowExceptionOnConnectFailed()
     * @see #unsetThrowExceptionOnConnectFailed()
     * @see #setThrowExceptionOnConnectFailed(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_ThrowExceptionOnConnectFailed()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='throwExceptionOnConnectFailed' namespace='##targetNamespace'"
     * @generated
     */
    boolean isThrowExceptionOnConnectFailed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throw Exception On Connect Failed</em>' attribute.
     * @see #isSetThrowExceptionOnConnectFailed()
     * @see #unsetThrowExceptionOnConnectFailed()
     * @see #isThrowExceptionOnConnectFailed()
     * @generated
     */
    void setThrowExceptionOnConnectFailed(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThrowExceptionOnConnectFailed()
     * @see #isThrowExceptionOnConnectFailed()
     * @see #setThrowExceptionOnConnectFailed(boolean)
     * @generated
     */
    void unsetThrowExceptionOnConnectFailed();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Throw Exception On Connect Failed</em>' attribute is set.
     * @see #unsetThrowExceptionOnConnectFailed()
     * @see #isThrowExceptionOnConnectFailed()
     * @see #setThrowExceptionOnConnectFailed(boolean)
     * @generated
     */
    boolean isSetThrowExceptionOnConnectFailed();

    /**
     * Returns the value of the '<em><b>Passive Mode</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passive Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passive Mode</em>' attribute.
     * @see #isSetPassiveMode()
     * @see #unsetPassiveMode()
     * @see #setPassiveMode(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_PassiveMode()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='passiveMode' namespace='##targetNamespace'"
     * @generated
     */
    boolean isPassiveMode();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passive Mode</em>' attribute.
     * @see #isSetPassiveMode()
     * @see #unsetPassiveMode()
     * @see #isPassiveMode()
     * @generated
     */
    void setPassiveMode(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPassiveMode()
     * @see #isPassiveMode()
     * @see #setPassiveMode(boolean)
     * @generated
     */
    void unsetPassiveMode();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Passive Mode</em>' attribute is set.
     * @see #unsetPassiveMode()
     * @see #isPassiveMode()
     * @see #setPassiveMode(boolean)
     * @generated
     */
    boolean isSetPassiveMode();

    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * The default value is <code>"30000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #setTimeout(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Timeout()
     * @model default="30000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
     * @generated
     */
    int getTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(int)
     * @generated
     */
    void unsetTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timeout</em>' attribute is set.
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(int)
     * @generated
     */
    boolean isSetTimeout();

    /**
     * Returns the value of the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>So Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>So Timeout</em>' attribute.
     * @see #isSetSoTimeout()
     * @see #unsetSoTimeout()
     * @see #setSoTimeout(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_SoTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='soTimeout' namespace='##targetNamespace'"
     * @generated
     */
    int getSoTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>So Timeout</em>' attribute.
     * @see #isSetSoTimeout()
     * @see #unsetSoTimeout()
     * @see #getSoTimeout()
     * @generated
     */
    void setSoTimeout(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSoTimeout()
     * @see #getSoTimeout()
     * @see #setSoTimeout(int)
     * @generated
     */
    void unsetSoTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>So Timeout</em>' attribute is set.
     * @see #unsetSoTimeout()
     * @see #getSoTimeout()
     * @see #setSoTimeout(int)
     * @generated
     */
    boolean isSetSoTimeout();

    /**
     * Returns the value of the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Site Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Site Command</em>' attribute.
     * @see #setSiteCommand(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_SiteCommand()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='siteCommand' namespace='##targetNamespace'"
     * @generated
     */
    String getSiteCommand();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Site Command</em>' attribute.
     * @see #getSiteCommand()
     * @generated
     */
    void setSiteCommand(String value);

    /**
     * Returns the value of the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' containment reference.
     * @see #setConsume(RemoteFileConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Consume()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume</em>' containment reference.
     * @see #getConsume()
     * @generated
     */
    void setConsume(RemoteFileConsumerType value);

    /**
     * Returns the value of the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Produce</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Produce</em>' containment reference.
     * @see #setProduce(RemoteFileProducerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Produce()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' containment reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(RemoteFileProducerType value);

} // CamelFtpBindingType
