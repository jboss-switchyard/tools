/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getExtraJaxbClasses <em>Extra Jaxb Classes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getUserName <em>User Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteType()
 * @model abstract="true"
 *        extendedMetaData="name='RemoteType' kind='elementOnly'"
 * @generated
 */
public interface RemoteType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Deployment Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deployment Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deployment Id</em>' attribute.
     * @see #setDeploymentId(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteType_DeploymentId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='deploymentId'"
     * @generated
     */
    String getDeploymentId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getDeploymentId <em>Deployment Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deployment Id</em>' attribute.
     * @see #getDeploymentId()
     * @generated
     */
    void setDeploymentId(String value);

    /**
     * Returns the value of the '<em><b>Extra Jaxb Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extra Jaxb Classes</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extra Jaxb Classes</em>' containment reference.
     * @see #setExtraJaxbClasses(ExtraJaxbClassesType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteType_ExtraJaxbClasses()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='extraJaxbClasses' namespace='##targetNamespace'"
     * @generated
     */
    ExtraJaxbClassesType getExtraJaxbClasses();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getExtraJaxbClasses <em>Extra Jaxb Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extra Jaxb Classes</em>' containment reference.
     * @see #getExtraJaxbClasses()
     * @generated
     */
    void setExtraJaxbClasses(ExtraJaxbClassesType value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='password'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #setTimeout(Object)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteType_Timeout()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='attribute' name='timeout'"
     * @generated
     */
    Object getTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(Object value);

    /**
     * Returns the value of the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Name</em>' attribute.
     * @see #setUserName(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteType_UserName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='userName'"
     * @generated
     */
    String getUserName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getUserName <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Name</em>' attribute.
     * @see #getUserName()
     * @generated
     */
    void setUserName(String value);

} // RemoteType
