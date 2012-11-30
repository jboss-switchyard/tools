/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdl <em>Wsdl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getSocketAddr <em>Socket Addr</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getEndpointAddress <em>Endpoint Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPBindingType()
 * @model extendedMetaData="name='SOAPBindingType' kind='elementOnly'"
 * @generated
 */
public interface SOAPBindingType extends SwitchYardBindingType {
    /**
     * Returns the value of the '<em><b>Wsdl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 A WSDL file name that can be found in classpath else can be a file://, http:// or https:// URL location.
     *                             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wsdl</em>' attribute.
     * @see #setWsdl(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPBindingType_Wsdl()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='element' name='wsdl' namespace='##targetNamespace'"
     * @generated
     */
    String getWsdl();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdl <em>Wsdl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl</em>' attribute.
     * @see #getWsdl()
     * @generated
     */
    void setWsdl(String value);

    /**
     * Returns the value of the '<em><b>Wsdl Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 Specify the WSDL port to be used. The string can be in the form {namespaceURI}serviceName:portName", with the "{namespaceURI}" and "serviceName:" part being optional.
     *                             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wsdl Port</em>' attribute.
     * @see #setWsdlPort(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPBindingType_WsdlPort()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.soap.WsdlPortType"
     *        extendedMetaData="kind='element' name='wsdlPort' namespace='##targetNamespace'"
     * @generated
     */
    String getWsdlPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdlPort <em>Wsdl Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl Port</em>' attribute.
     * @see #getWsdlPort()
     * @generated
     */
    void setWsdlPort(String value);

    /**
     * Returns the value of the '<em><b>Socket Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 Specify the IP Socket Address to be used. The string can be in the form "hostName/ipAddress:portNumber", with the "hostName/ipAddress:" or ":portNumber" part being optional.
     *                             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Socket Addr</em>' attribute.
     * @see #setSocketAddr(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPBindingType_SocketAddr()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='socketAddr' namespace='##targetNamespace'"
     * @generated
     */
    String getSocketAddr();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getSocketAddr <em>Socket Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Socket Addr</em>' attribute.
     * @see #getSocketAddr()
     * @generated
     */
    void setSocketAddr(String value);

    /**
     * Returns the value of the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 The context path used in the HTTP URL
     *                             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Path</em>' attribute.
     * @see #setContextPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPBindingType_ContextPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='contextPath' namespace='##targetNamespace'"
     * @generated
     */
    String getContextPath();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getContextPath <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Path</em>' attribute.
     * @see #getContextPath()
     * @generated
     */
    void setContextPath(String value);

    /**
     * Returns the value of the '<em><b>Endpoint Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 The context path used in the HTTP URL
     *                             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Endpoint Address</em>' attribute.
     * @see #setEndpointAddress(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getSOAPBindingType_EndpointAddress()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='endpointAddress' namespace='##targetNamespace'"
     * @generated
     */
    String getEndpointAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getEndpointAddress <em>Endpoint Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Endpoint Address</em>' attribute.
     * @see #getEndpointAddress()
     * @generated
     */
    void setEndpointAddress(String value);

} // SOAPBindingType
