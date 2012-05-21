/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType()
 * @model abstract="true"
 *        extendedMetaData="name='CamelRemoteBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelRemoteBindingType extends GenericFileBindingType {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getHost <em>Host</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Port()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPort <em>Port</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPort()
     * @see #getPort()
     * @see #setPort(int)
     * @generated
     */
    void unsetPort();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPort <em>Port</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getUsername <em>Username</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Binary</b></em>' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Binary()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='binary' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBinary();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isBinary <em>Binary</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isBinary <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinary()
     * @see #isBinary()
     * @see #setBinary(boolean)
     * @generated
     */
    void unsetBinary();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isBinary <em>Binary</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_ConnectTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='connectTimeout' namespace='##targetNamespace'"
     * @generated
     */
    int getConnectTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectTimeout()
     * @see #getConnectTimeout()
     * @see #setConnectTimeout(int)
     * @generated
     */
    void unsetConnectTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Disconnect()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isDisconnect <em>Disconnect</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isDisconnect <em>Disconnect</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_MaximumReconnectAttempts()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='maximumReconnectAttempts' namespace='##targetNamespace'"
     * @generated
     */
    int getMaximumReconnectAttempts();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @see #setMaximumReconnectAttempts(int)
     * @generated
     */
    void unsetMaximumReconnectAttempts();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_ReconnectDelay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='reconnectDelay' namespace='##targetNamespace'"
     * @generated
     */
    int getReconnectDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReconnectDelay()
     * @see #getReconnectDelay()
     * @see #setReconnectDelay(int)
     * @generated
     */
    void unsetReconnectDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Separator()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='separator' namespace='##targetNamespace'"
     * @generated
     */
    String getSeparator();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getSeparator <em>Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Separator</em>' attribute.
     * @see #getSeparator()
     * @generated
     */
    void setSeparator(String value);

    /**
     * Returns the value of the '<em><b>Stepwise</b></em>' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Stepwise()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='stepwise' namespace='##targetNamespace'"
     * @generated
     */
    boolean isStepwise();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isStepwise <em>Stepwise</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isStepwise <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepwise()
     * @see #isStepwise()
     * @see #setStepwise(boolean)
     * @generated
     */
    void unsetStepwise();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isStepwise <em>Stepwise</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_ThrowExceptionOnConnectFailed()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='throwExceptionOnConnectFailed' namespace='##targetNamespace'"
     * @generated
     */
    boolean isThrowExceptionOnConnectFailed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThrowExceptionOnConnectFailed()
     * @see #isThrowExceptionOnConnectFailed()
     * @see #setThrowExceptionOnConnectFailed(boolean)
     * @generated
     */
    void unsetThrowExceptionOnConnectFailed();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' containment reference.
     * @see #setConsume(RemoteFileConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Consume()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConsume <em>Consume</em>}' containment reference.
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
     * If the meaning of the '<em>Produce</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Produce</em>' containment reference.
     * @see #setProduce(RemoteFileProducerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelRemoteBindingType_Produce()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getProduce <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' containment reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(RemoteFileProducerType value);

} // CamelRemoteBindingType
