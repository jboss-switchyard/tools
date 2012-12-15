/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getStepwise <em>Stepwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType()
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getHost <em>Host</em>}' attribute.
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
     * @see #setPort(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Port()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    Integer getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #isSetPort()
     * @see #unsetPort()
     * @see #getPort()
     * @generated
     */
    void setPort(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPort()
     * @see #getPort()
     * @see #setPort(Integer)
     * @generated
     */
    void unsetPort();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPort <em>Port</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Port</em>' attribute is set.
     * @see #unsetPort()
     * @see #getPort()
     * @see #setPort(Integer)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getUsername <em>Username</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPassword <em>Password</em>}' attribute.
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
     * @see #setBinary(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Binary()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='binary' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getBinary();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getBinary <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binary</em>' attribute.
     * @see #isSetBinary()
     * @see #unsetBinary()
     * @see #getBinary()
     * @generated
     */
    void setBinary(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getBinary <em>Binary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinary()
     * @see #getBinary()
     * @see #setBinary(Boolean)
     * @generated
     */
    void unsetBinary();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getBinary <em>Binary</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Binary</em>' attribute is set.
     * @see #unsetBinary()
     * @see #getBinary()
     * @see #setBinary(Boolean)
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
     * @see #setConnectTimeout(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_ConnectTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='connectTimeout' namespace='##targetNamespace'"
     * @generated
     */
    Integer getConnectTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connect Timeout</em>' attribute.
     * @see #isSetConnectTimeout()
     * @see #unsetConnectTimeout()
     * @see #getConnectTimeout()
     * @generated
     */
    void setConnectTimeout(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectTimeout()
     * @see #getConnectTimeout()
     * @see #setConnectTimeout(Integer)
     * @generated
     */
    void unsetConnectTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connect Timeout</em>' attribute is set.
     * @see #unsetConnectTimeout()
     * @see #getConnectTimeout()
     * @see #setConnectTimeout(Integer)
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
     * @see #setDisconnect(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Disconnect()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getDisconnect <em>Disconnect</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getDisconnect <em>Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disconnect</em>' attribute is set.
     * @see #unsetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
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
     * @see #setMaximumReconnectAttempts(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_MaximumReconnectAttempts()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='maximumReconnectAttempts' namespace='##targetNamespace'"
     * @generated
     */
    Integer getMaximumReconnectAttempts();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Reconnect Attempts</em>' attribute.
     * @see #isSetMaximumReconnectAttempts()
     * @see #unsetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @generated
     */
    void setMaximumReconnectAttempts(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @see #setMaximumReconnectAttempts(Integer)
     * @generated
     */
    void unsetMaximumReconnectAttempts();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Reconnect Attempts</em>' attribute is set.
     * @see #unsetMaximumReconnectAttempts()
     * @see #getMaximumReconnectAttempts()
     * @see #setMaximumReconnectAttempts(Integer)
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
     * @see #setReconnectDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_ReconnectDelay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='reconnectDelay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getReconnectDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Delay</em>' attribute.
     * @see #isSetReconnectDelay()
     * @see #unsetReconnectDelay()
     * @see #getReconnectDelay()
     * @generated
     */
    void setReconnectDelay(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReconnectDelay()
     * @see #getReconnectDelay()
     * @see #setReconnectDelay(Integer)
     * @generated
     */
    void unsetReconnectDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reconnect Delay</em>' attribute is set.
     * @see #unsetReconnectDelay()
     * @see #getReconnectDelay()
     * @see #setReconnectDelay(Integer)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Separator()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='separator' namespace='##targetNamespace'"
     * @generated
     */
    String getSeparator();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getSeparator <em>Separator</em>}' attribute.
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
     * @see #setStepwise(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_Stepwise()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='stepwise' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getStepwise();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getStepwise <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stepwise</em>' attribute.
     * @see #isSetStepwise()
     * @see #unsetStepwise()
     * @see #getStepwise()
     * @generated
     */
    void setStepwise(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getStepwise <em>Stepwise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepwise()
     * @see #getStepwise()
     * @see #setStepwise(Boolean)
     * @generated
     */
    void unsetStepwise();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getStepwise <em>Stepwise</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stepwise</em>' attribute is set.
     * @see #unsetStepwise()
     * @see #getStepwise()
     * @see #setStepwise(Boolean)
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
     * @see #setThrowExceptionOnConnectFailed(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelRemoteBindingType_ThrowExceptionOnConnectFailed()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='throwExceptionOnConnectFailed' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getThrowExceptionOnConnectFailed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throw Exception On Connect Failed</em>' attribute.
     * @see #isSetThrowExceptionOnConnectFailed()
     * @see #unsetThrowExceptionOnConnectFailed()
     * @see #getThrowExceptionOnConnectFailed()
     * @generated
     */
    void setThrowExceptionOnConnectFailed(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThrowExceptionOnConnectFailed()
     * @see #getThrowExceptionOnConnectFailed()
     * @see #setThrowExceptionOnConnectFailed(Boolean)
     * @generated
     */
    void unsetThrowExceptionOnConnectFailed();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Throw Exception On Connect Failed</em>' attribute is set.
     * @see #unsetThrowExceptionOnConnectFailed()
     * @see #getThrowExceptionOnConnectFailed()
     * @see #setThrowExceptionOnConnectFailed(Boolean)
     * @generated
     */
    boolean isSetThrowExceptionOnConnectFailed();

} // CamelRemoteBindingType
