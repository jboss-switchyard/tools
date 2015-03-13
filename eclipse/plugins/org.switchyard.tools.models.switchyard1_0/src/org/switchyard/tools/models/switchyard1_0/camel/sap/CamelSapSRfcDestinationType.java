/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sap SRfc Destination Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getRfcName <em>Rfc Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getTransacted <em>Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapSRfcDestinationType()
 * @model extendedMetaData="name='CamelSapSRfcDestinationType' kind='elementOnly'"
 * @generated
 */
public interface CamelSapSRfcDestinationType extends EObject {
    /**
     * Returns the value of the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Destination Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Destination Name</em>' attribute.
     * @see #setDestinationName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapSRfcDestinationType_DestinationName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='destinationName' namespace='##targetNamespace'"
     * @generated
     */
    String getDestinationName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getDestinationName <em>Destination Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination Name</em>' attribute.
     * @see #getDestinationName()
     * @generated
     */
    void setDestinationName(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapSRfcDestinationType_RfcName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='rfcName' namespace='##targetNamespace'"
     * @generated
     */
    String getRfcName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getRfcName <em>Rfc Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rfc Name</em>' attribute.
     * @see #getRfcName()
     * @generated
     */
    void setRfcName(String value);

    /**
     * Returns the value of the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transacted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transacted</em>' attribute.
     * @see #setTransacted(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapSRfcDestinationType_Transacted()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
    Object getTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' attribute.
     * @see #getTransacted()
     * @generated
     */
    void setTransacted(Object value);

} // CamelSapSRfcDestinationType
