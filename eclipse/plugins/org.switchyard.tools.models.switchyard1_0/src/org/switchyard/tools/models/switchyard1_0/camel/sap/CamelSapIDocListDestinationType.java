/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sap IDoc List Destination Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocType <em>Idoc Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocTypeExtension <em>Idoc Type Extension</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getSystemRelease <em>System Release</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getApplicationRelease <em>Application Release</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapIDocListDestinationType()
 * @model extendedMetaData="name='CamelSapIDocListDestinationType' kind='elementOnly'"
 * @generated
 */
public interface CamelSapIDocListDestinationType extends EObject {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapIDocListDestinationType_DestinationName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='destinationName' namespace='##targetNamespace'"
     * @generated
     */
    String getDestinationName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getDestinationName <em>Destination Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination Name</em>' attribute.
     * @see #getDestinationName()
     * @generated
     */
    void setDestinationName(String value);

    /**
     * Returns the value of the '<em><b>Idoc Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idoc Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idoc Type</em>' attribute.
     * @see #setIdocType(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapIDocListDestinationType_IdocType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='idocType' namespace='##targetNamespace'"
     * @generated
     */
    String getIdocType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocType <em>Idoc Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idoc Type</em>' attribute.
     * @see #getIdocType()
     * @generated
     */
    void setIdocType(String value);

    /**
     * Returns the value of the '<em><b>Idoc Type Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idoc Type Extension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idoc Type Extension</em>' attribute.
     * @see #setIdocTypeExtension(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapIDocListDestinationType_IdocTypeExtension()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='idocTypeExtension' namespace='##targetNamespace'"
     * @generated
     */
    String getIdocTypeExtension();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocTypeExtension <em>Idoc Type Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idoc Type Extension</em>' attribute.
     * @see #getIdocTypeExtension()
     * @generated
     */
    void setIdocTypeExtension(String value);

    /**
     * Returns the value of the '<em><b>System Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System Release</em>' attribute.
     * @see #setSystemRelease(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapIDocListDestinationType_SystemRelease()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='systemRelease' namespace='##targetNamespace'"
     * @generated
     */
    String getSystemRelease();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getSystemRelease <em>System Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System Release</em>' attribute.
     * @see #getSystemRelease()
     * @generated
     */
    void setSystemRelease(String value);

    /**
     * Returns the value of the '<em><b>Application Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application Release</em>' attribute.
     * @see #setApplicationRelease(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapIDocListDestinationType_ApplicationRelease()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='applicationRelease' namespace='##targetNamespace'"
     * @generated
     */
    String getApplicationRelease();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getApplicationRelease <em>Application Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Release</em>' attribute.
     * @see #getApplicationRelease()
     * @generated
     */
    void setApplicationRelease(String value);

} // CamelSapIDocListDestinationType
