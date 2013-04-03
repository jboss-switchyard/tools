/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType#getSoapHeadersType <em>Soap Headers Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getContextMapperType()
 * @model extendedMetaData="name='ContextMapperType' kind='empty' namespace='##targetNamespace'"
 * @generated
 */
public interface ContextMapperType extends org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType {
    /**
     * Returns the value of the '<em><b>Soap Headers Type</b></em>' attribute.
     * The default value is <code>"VALUE"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Soap Headers Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Soap Headers Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @see #setSoapHeadersType(SoapHeadersType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getContextMapperType_SoapHeadersType()
     * @model default="VALUE"
     *        extendedMetaData="kind='attribute' name='soapHeadersType'"
     * @generated
     */
    SoapHeadersType getSoapHeadersType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType#getSoapHeadersType <em>Soap Headers Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Soap Headers Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @see #getSoapHeadersType()
     * @generated
     */
    void setSoapHeadersType(SoapHeadersType value);

} // ContextMapperType
