/**
 */
package org.switchyard.tools.models.switchyard1_0.http;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getNtlm <em>Ntlm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType()
 * @model extendedMetaData="name='HTTPBindingType' kind='elementOnly'"
 * @generated
 */
public interface HTTPBindingType extends SwitchYardBindingType {
    /**
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specify the ContextMapper to be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_ContextMapper()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(ContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specify the MessageComposer to be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_MessageComposer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(MessageComposerType value);

    /**
     * Returns the value of the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A context path where the HTTP endpoint will be exposed for Service bindings.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Path</em>' attribute.
     * @see #setContextPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_ContextPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='contextPath' namespace='##targetNamespace'"
     * @generated
     */
    String getContextPath();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getContextPath <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Path</em>' attribute.
     * @see #getContextPath()
     * @generated
     */
    void setContextPath(String value);

    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A URL that points to the HTTP endpoint in case of Reference bindings.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_Address()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(String value);

    /**
     * Returns the value of the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The HTTP method.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Method</em>' attribute.
     * @see #setMethod(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_Method()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
     * @generated
     */
    String getMethod();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getMethod <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' attribute.
     * @see #getMethod()
     * @generated
     */
    void setMethod(String value);

    /**
     * Returns the value of the '<em><b>Content Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The HTTP request's content-type header that need to be set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Content Type</em>' attribute.
     * @see #setContentType(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_ContentType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
     * @generated
     */
    String getContentType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getContentType <em>Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content Type</em>' attribute.
     * @see #getContentType()
     * @generated
     */
    void setContentType(String value);

    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The HTTP request's time-out value in milliseconds.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #setTimeout(Object)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_Timeout()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
     * @generated
     */
    Object getTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(Object value);

    /**
     * Returns the value of the '<em><b>Basic</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic</em>' containment reference.
     * @see #setBasic(BasicAuthenticationType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_Basic()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='basic' namespace='##targetNamespace'"
     * @generated
     */
    BasicAuthenticationType getBasic();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getBasic <em>Basic</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic</em>' containment reference.
     * @see #getBasic()
     * @generated
     */
    void setBasic(BasicAuthenticationType value);

    /**
     * Returns the value of the '<em><b>Ntlm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ntlm</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ntlm</em>' containment reference.
     * @see #setNtlm(NTLMAuthenticationType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_Ntlm()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ntlm' namespace='##targetNamespace'"
     * @generated
     */
    NTLMAuthenticationType getNtlm();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getNtlm <em>Ntlm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ntlm</em>' containment reference.
     * @see #getNtlm()
     * @generated
     */
    void setNtlm(NTLMAuthenticationType value);

    /**
     * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Http proxy settings.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Proxy</em>' containment reference.
     * @see #setProxy(ProxyType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHTTPBindingType_Proxy()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='proxy' namespace='##targetNamespace'"
     * @generated
     */
    ProxyType getProxy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType#getProxy <em>Proxy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proxy</em>' containment reference.
     * @see #getProxy()
     * @generated
     */
    void setProxy(ProxyType value);

} // HTTPBindingType
