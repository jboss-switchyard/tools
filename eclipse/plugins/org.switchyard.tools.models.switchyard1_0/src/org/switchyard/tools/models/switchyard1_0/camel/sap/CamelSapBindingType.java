/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sap Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 SAP Binding configuration. *-server is for service binding, and *-destination is for reference binding.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistServer <em>Idoclist Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcServer <em>Srfc Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcServer <em>Trfc Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdocDestination <em>Idoc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistDestination <em>Idoclist Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidocDestination <em>Qidoc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidoclistDestination <em>Qidoclist Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQrfcDestination <em>Qrfc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcDestination <em>Srfc Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcDestination <em>Trfc Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType()
 * @model extendedMetaData="name='CamelSapBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelSapBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Idoclist Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idoclist Server</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idoclist Server</em>' containment reference.
     * @see #setIdoclistServer(CamelSapIDocListServerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_IdoclistServer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='idoclist-server' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapIDocListServerType getIdoclistServer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistServer <em>Idoclist Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idoclist Server</em>' containment reference.
     * @see #getIdoclistServer()
     * @generated
     */
    void setIdoclistServer(CamelSapIDocListServerType value);

    /**
     * Returns the value of the '<em><b>Srfc Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Srfc Server</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Srfc Server</em>' containment reference.
     * @see #setSrfcServer(CamelSapSRfcServerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_SrfcServer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='srfc-server' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapSRfcServerType getSrfcServer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcServer <em>Srfc Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Srfc Server</em>' containment reference.
     * @see #getSrfcServer()
     * @generated
     */
    void setSrfcServer(CamelSapSRfcServerType value);

    /**
     * Returns the value of the '<em><b>Trfc Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trfc Server</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trfc Server</em>' containment reference.
     * @see #setTrfcServer(CamelSapTRfcServerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_TrfcServer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='trfc-server' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapTRfcServerType getTrfcServer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcServer <em>Trfc Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trfc Server</em>' containment reference.
     * @see #getTrfcServer()
     * @generated
     */
    void setTrfcServer(CamelSapTRfcServerType value);

    /**
     * Returns the value of the '<em><b>Idoc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idoc Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idoc Destination</em>' containment reference.
     * @see #setIdocDestination(CamelSapIDocDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_IdocDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='idoc-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapIDocDestinationType getIdocDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdocDestination <em>Idoc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idoc Destination</em>' containment reference.
     * @see #getIdocDestination()
     * @generated
     */
    void setIdocDestination(CamelSapIDocDestinationType value);

    /**
     * Returns the value of the '<em><b>Idoclist Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idoclist Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idoclist Destination</em>' containment reference.
     * @see #setIdoclistDestination(CamelSapIDocListDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_IdoclistDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='idoclist-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapIDocListDestinationType getIdoclistDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistDestination <em>Idoclist Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idoclist Destination</em>' containment reference.
     * @see #getIdoclistDestination()
     * @generated
     */
    void setIdoclistDestination(CamelSapIDocListDestinationType value);

    /**
     * Returns the value of the '<em><b>Qidoc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qidoc Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qidoc Destination</em>' containment reference.
     * @see #setQidocDestination(CamelSapQIDocDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_QidocDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='qidoc-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapQIDocDestinationType getQidocDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidocDestination <em>Qidoc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qidoc Destination</em>' containment reference.
     * @see #getQidocDestination()
     * @generated
     */
    void setQidocDestination(CamelSapQIDocDestinationType value);

    /**
     * Returns the value of the '<em><b>Qidoclist Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qidoclist Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qidoclist Destination</em>' containment reference.
     * @see #setQidoclistDestination(CamelSapQIDocListDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_QidoclistDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='qidoclist-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapQIDocListDestinationType getQidoclistDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidoclistDestination <em>Qidoclist Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qidoclist Destination</em>' containment reference.
     * @see #getQidoclistDestination()
     * @generated
     */
    void setQidoclistDestination(CamelSapQIDocListDestinationType value);

    /**
     * Returns the value of the '<em><b>Qrfc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qrfc Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qrfc Destination</em>' containment reference.
     * @see #setQrfcDestination(CamelSapQRfcDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_QrfcDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='qrfc-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapQRfcDestinationType getQrfcDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQrfcDestination <em>Qrfc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qrfc Destination</em>' containment reference.
     * @see #getQrfcDestination()
     * @generated
     */
    void setQrfcDestination(CamelSapQRfcDestinationType value);

    /**
     * Returns the value of the '<em><b>Srfc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Srfc Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Srfc Destination</em>' containment reference.
     * @see #setSrfcDestination(CamelSapSRfcDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_SrfcDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='srfc-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapSRfcDestinationType getSrfcDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcDestination <em>Srfc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Srfc Destination</em>' containment reference.
     * @see #getSrfcDestination()
     * @generated
     */
    void setSrfcDestination(CamelSapSRfcDestinationType value);

    /**
     * Returns the value of the '<em><b>Trfc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trfc Destination</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trfc Destination</em>' containment reference.
     * @see #setTrfcDestination(CamelSapTRfcDestinationType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#getCamelSapBindingType_TrfcDestination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='trfc-destination' namespace='##targetNamespace'"
     * @generated
     */
    CamelSapTRfcDestinationType getTrfcDestination();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcDestination <em>Trfc Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trfc Destination</em>' containment reference.
     * @see #getTrfcDestination()
     * @generated
     */
    void setTrfcDestination(CamelSapTRfcDestinationType value);

} // CamelSapBindingType
