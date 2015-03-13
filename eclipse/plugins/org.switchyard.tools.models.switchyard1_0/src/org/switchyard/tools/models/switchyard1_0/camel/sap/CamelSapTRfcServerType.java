/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sap TRfc Server Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getRfcName <em>Rfc Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapTRfcServerType()
 * @model extendedMetaData="name='CamelSapTRfcServerType' kind='elementOnly'"
 * @generated
 */
public interface CamelSapTRfcServerType extends EObject {
    /**
     * Returns the value of the '<em><b>Server Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server Name</em>' attribute.
     * @see #setServerName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapTRfcServerType_ServerName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='serverName' namespace='##targetNamespace'"
     * @generated
     */
    String getServerName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getServerName <em>Server Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server Name</em>' attribute.
     * @see #getServerName()
     * @generated
     */
    void setServerName(String value);

    /**
     * Returns the value of the '<em><b>Rfc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rfc Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rfc Name</em>' attribute.
     * @see #setRfcName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapTRfcServerType_RfcName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='rfcName' namespace='##targetNamespace'"
     * @generated
     */
    String getRfcName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getRfcName <em>Rfc Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rfc Name</em>' attribute.
     * @see #getRfcName()
     * @generated
     */
    void setRfcName(String value);

} // CamelSapTRfcServerType
