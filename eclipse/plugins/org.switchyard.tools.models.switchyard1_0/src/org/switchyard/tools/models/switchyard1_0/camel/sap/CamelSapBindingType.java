/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sap Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getServer <em>Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getRfcName <em>Rfc Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#isTransacted <em>Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType()
 * @model extendedMetaData="name='CamelSapBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelSapBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server</em>' attribute.
     * @see #setServer(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_Server()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='server' namespace='##targetNamespace'"
     * @generated
     */
    String getServer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getServer <em>Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server</em>' attribute.
     * @see #getServer()
     * @generated
     */
    void setServer(String value);

    /**
     * Returns the value of the '<em><b>Destination</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Destination</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Destination</em>' attribute.
     * @see #setDestination(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_Destination()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
     * @generated
     */
    String getDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getDestination <em>Destination</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination</em>' attribute.
     * @see #getDestination()
     * @generated
     */
    void setDestination(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_RfcName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='rfcName' namespace='##targetNamespace'"
     * @generated
     */
    String getRfcName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getRfcName <em>Rfc Name</em>}' attribute.
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
     * @see #isSetTransacted()
     * @see #unsetTransacted()
     * @see #setTransacted(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_Transacted()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
    boolean isTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#isTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' attribute.
     * @see #isSetTransacted()
     * @see #unsetTransacted()
     * @see #isTransacted()
     * @generated
     */
    void setTransacted(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#isTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransacted()
     * @see #isTransacted()
     * @see #setTransacted(boolean)
     * @generated
     */
    void unsetTransacted();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#isTransacted <em>Transacted</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transacted</em>' attribute is set.
     * @see #unsetTransacted()
     * @see #isTransacted()
     * @see #setTransacted(boolean)
     * @generated
     */
    boolean isSetTransacted();

} // CamelSapBindingType
