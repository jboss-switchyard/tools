/**
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getUser <em>User</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getProxyType()
 * @model extendedMetaData="name='ProxyType' kind='elementOnly'"
 * @generated
 */
public interface ProxyType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proxy Type. Default is HTTP. Allowed values are HTTP and SOCKS
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getProxyType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proxy Host.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getProxyType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getHost <em>Host</em>}' attribute.
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
     * <!-- begin-model-doc -->
     * Proxy Port.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(Object)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getProxyType_Port()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    Object getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(Object value);

    /**
     * Returns the value of the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proxy user name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>User</em>' attribute.
     * @see #setUser(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getProxyType_User()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='user' namespace='##targetNamespace'"
     * @generated
     */
    String getUser();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getUser <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' attribute.
     * @see #getUser()
     * @generated
     */
    void setUser(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proxy password.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getProxyType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

} // ProxyType
