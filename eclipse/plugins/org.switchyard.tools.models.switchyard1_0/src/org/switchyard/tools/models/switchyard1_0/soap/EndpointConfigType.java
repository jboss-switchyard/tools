/**
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigName <em>Config Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getEndpointConfigType()
 * @model extendedMetaData="name='EndpointConfigType' kind='elementOnly'"
 * @generated
 */
public interface EndpointConfigType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Config File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config File</em>' attribute.
     * @see #setConfigFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getEndpointConfigType_ConfigFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='configFile'"
     * @generated
     */
    String getConfigFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigFile <em>Config File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config File</em>' attribute.
     * @see #getConfigFile()
     * @generated
     */
    void setConfigFile(String value);

    /**
     * Returns the value of the '<em><b>Config Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config Name</em>' attribute.
     * @see #setConfigName(String)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getEndpointConfigType_ConfigName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='configName'"
     * @generated
     */
    String getConfigName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigName <em>Config Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config Name</em>' attribute.
     * @see #getConfigName()
     * @generated
     */
    void setConfigName(String value);

} // EndpointConfigType
