/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelFtpBindingType()
 * @model extendedMetaData="name='CamelFtpBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelFtpBindingType extends CamelRemoteBindingType {
    /**
     * Returns the value of the '<em><b>Passive Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passive Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passive Mode</em>' attribute.
     * @see #isSetPassiveMode()
     * @see #unsetPassiveMode()
     * @see #setPassiveMode(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelFtpBindingType_PassiveMode()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='passiveMode' namespace='##targetNamespace'"
     * @generated
     */
    boolean isPassiveMode();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passive Mode</em>' attribute.
     * @see #isSetPassiveMode()
     * @see #unsetPassiveMode()
     * @see #isPassiveMode()
     * @generated
     */
    void setPassiveMode(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPassiveMode()
     * @see #isPassiveMode()
     * @see #setPassiveMode(boolean)
     * @generated
     */
    void unsetPassiveMode();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Passive Mode</em>' attribute is set.
     * @see #unsetPassiveMode()
     * @see #isPassiveMode()
     * @see #setPassiveMode(boolean)
     * @generated
     */
    boolean isSetPassiveMode();

    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #setTimeout(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelFtpBindingType_Timeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
     * @generated
     */
    int getTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(int)
     * @generated
     */
    void unsetTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timeout</em>' attribute is set.
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(int)
     * @generated
     */
    boolean isSetTimeout();

    /**
     * Returns the value of the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>So Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>So Timeout</em>' attribute.
     * @see #isSetSoTimeout()
     * @see #unsetSoTimeout()
     * @see #setSoTimeout(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelFtpBindingType_SoTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='soTimeout' namespace='##targetNamespace'"
     * @generated
     */
    int getSoTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>So Timeout</em>' attribute.
     * @see #isSetSoTimeout()
     * @see #unsetSoTimeout()
     * @see #getSoTimeout()
     * @generated
     */
    void setSoTimeout(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSoTimeout()
     * @see #getSoTimeout()
     * @see #setSoTimeout(int)
     * @generated
     */
    void unsetSoTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>So Timeout</em>' attribute is set.
     * @see #unsetSoTimeout()
     * @see #getSoTimeout()
     * @see #setSoTimeout(int)
     * @generated
     */
    boolean isSetSoTimeout();

    /**
     * Returns the value of the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Site Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Site Command</em>' attribute.
     * @see #setSiteCommand(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelFtpBindingType_SiteCommand()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='siteCommand' namespace='##targetNamespace'"
     * @generated
     */
    String getSiteCommand();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Site Command</em>' attribute.
     * @see #getSiteCommand()
     * @generated
     */
    void setSiteCommand(String value);

} // CamelFtpBindingType
