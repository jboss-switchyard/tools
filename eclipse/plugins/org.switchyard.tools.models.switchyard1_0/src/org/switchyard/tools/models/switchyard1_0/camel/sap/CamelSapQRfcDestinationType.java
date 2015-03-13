/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sap QRfc Destination Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getRfcName <em>Rfc Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getTransacted <em>Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapQRfcDestinationType()
 * @model extendedMetaData="name='CamelSapQRfcDestinationType' kind='elementOnly'"
 * @generated
 */
public interface CamelSapQRfcDestinationType extends EObject {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapQRfcDestinationType_DestinationName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='destinationName' namespace='##targetNamespace'"
     * @generated
     */
    String getDestinationName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getDestinationName <em>Destination Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination Name</em>' attribute.
     * @see #getDestinationName()
     * @generated
     */
    void setDestinationName(String value);

    /**
     * Returns the value of the '<em><b>Queue Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Queue Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Queue Name</em>' attribute.
     * @see #setQueueName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapQRfcDestinationType_QueueName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='queueName' namespace='##targetNamespace'"
     * @generated
     */
    String getQueueName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getQueueName <em>Queue Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Queue Name</em>' attribute.
     * @see #getQueueName()
     * @generated
     */
    void setQueueName(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapQRfcDestinationType_RfcName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='rfcName' namespace='##targetNamespace'"
     * @generated
     */
    String getRfcName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getRfcName <em>Rfc Name</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapQRfcDestinationType_Transacted()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
    Object getTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' attribute.
     * @see #getTransacted()
     * @generated
     */
    void setTransacted(Object value);

} // CamelSapQRfcDestinationType
