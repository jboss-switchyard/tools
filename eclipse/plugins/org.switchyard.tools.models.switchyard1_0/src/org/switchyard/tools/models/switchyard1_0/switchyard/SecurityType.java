/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getCallbackHandler <em>Callback Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRolesAllowed <em>Roles Allowed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getSecurityDomain <em>Security Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType()
 * @model extendedMetaData="name='SecurityType' kind='elementOnly'"
 * @generated
 */
public interface SecurityType extends EObject {
    /**
     * Returns the value of the '<em><b>Callback Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Callback Handler</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Callback Handler</em>' attribute.
     * @see #setCallbackHandler(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType_CallbackHandler()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='callbackHandler'"
     * @generated
     */
    String getCallbackHandler();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getCallbackHandler <em>Callback Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callback Handler</em>' attribute.
     * @see #getCallbackHandler()
     * @generated
     */
    void setCallbackHandler(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType_Properties()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(PropertiesType value);

    /**
     * Returns the value of the '<em><b>Roles Allowed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles Allowed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roles Allowed</em>' attribute.
     * @see #setRolesAllowed(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType_RolesAllowed()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='rolesAllowed'"
     * @generated
     */
    String getRolesAllowed();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRolesAllowed <em>Roles Allowed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Roles Allowed</em>' attribute.
     * @see #getRolesAllowed()
     * @generated
     */
    void setRolesAllowed(String value);

    /**
     * Returns the value of the '<em><b>Run As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run As</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Run As</em>' attribute.
     * @see #setRunAs(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType_RunAs()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='runAs'"
     * @generated
     */
    String getRunAs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRunAs <em>Run As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Run As</em>' attribute.
     * @see #getRunAs()
     * @generated
     */
    void setRunAs(String value);

    /**
     * Returns the value of the '<em><b>Security Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Domain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Security Domain</em>' attribute.
     * @see #setSecurityDomain(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecurityType_SecurityDomain()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='securityDomain'"
     * @generated
     */
    String getSecurityDomain();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getSecurityDomain <em>Security Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security Domain</em>' attribute.
     * @see #getSecurityDomain()
     * @generated
     */
    void setSecurityDomain(String value);

} // SecurityType
