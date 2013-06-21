/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.http;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getNtlm <em>Ntlm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType()
 * @model extendedMetaData="name='HttpBindingType' kind='elementOnly'"
 * @generated
 */
public interface HttpBindingType extends SwitchYardBindingType {
    /**
     * Returns the value of the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Path</em>' attribute.
     * @see #setContextPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType_ContextPath()
     * @model extendedMetaData="kind='element' name='contextPath' namespace='##targetNamespace'"
     * @generated
     */
    String getContextPath();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContextPath <em>Context Path</em>}' attribute.
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
     * <p>
     * If the meaning of the '<em>Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType_Address()
     * @model extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getAddress <em>Address</em>}' attribute.
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
     * <p>
     * If the meaning of the '<em>Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' attribute.
     * @see #setMethod(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType_Method()
     * @model extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
     * @generated
     */
    String getMethod();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getMethod <em>Method</em>}' attribute.
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
     * <p>
     * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Content Type</em>' attribute.
     * @see #setContentType(String)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType_ContentType()
     * @model extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
     * @generated
     */
    String getContentType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContentType <em>Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content Type</em>' attribute.
     * @see #getContentType()
     * @generated
     */
    void setContentType(String value);

    /**
     * Returns the value of the '<em><b>Basic</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic</em>' containment reference.
     * @see #setBasic(BasicAuthenticationType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType_Basic()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='basic' namespace='##targetNamespace'"
     * @generated
     */
    BasicAuthenticationType getBasic();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getBasic <em>Basic</em>}' containment reference.
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
     * If the meaning of the '<em>Ntlm</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ntlm</em>' containment reference.
     * @see #setNtlm(NTLMAuthenticationType)
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage#getHttpBindingType_Ntlm()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ntlm' namespace='##targetNamespace'"
     * @generated
     */
    NTLMAuthenticationType getNtlm();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getNtlm <em>Ntlm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ntlm</em>' containment reference.
     * @see #getNtlm()
     * @generated
     */
    void setNtlm(NTLMAuthenticationType value);

} // HttpBindingType
