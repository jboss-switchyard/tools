/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Rest Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType#getUrl <em>Url</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType#getUseFormBasedAuth <em>Use Form Based Auth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getRemoteRestType()
 * @model extendedMetaData="name='RemoteRestType' kind='elementOnly'"
 * @generated
 */
public interface RemoteRestType extends RemoteType {
    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getRemoteRestType_Url()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='url'"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

    /**
     * Returns the value of the '<em><b>Use Form Based Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Form Based Auth</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Form Based Auth</em>' attribute.
     * @see #setUseFormBasedAuth(Object)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getRemoteRestType_UseFormBasedAuth()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='attribute' name='useFormBasedAuth'"
     * @generated
     */
    Object getUseFormBasedAuth();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType#getUseFormBasedAuth <em>Use Form Based Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Form Based Auth</em>' attribute.
     * @see #getUseFormBasedAuth()
     * @generated
     */
    void setUseFormBasedAuth(Object value);

} // RemoteRestType
