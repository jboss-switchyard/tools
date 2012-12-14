/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType()
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
     * @see #setPassiveMode(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_PassiveMode()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='passiveMode' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getPassiveMode();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassiveMode <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passive Mode</em>' attribute.
     * @see #isSetPassiveMode()
     * @see #unsetPassiveMode()
     * @see #getPassiveMode()
     * @generated
     */
    void setPassiveMode(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassiveMode <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPassiveMode()
     * @see #getPassiveMode()
     * @see #setPassiveMode(Boolean)
     * @generated
     */
    void unsetPassiveMode();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassiveMode <em>Passive Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Passive Mode</em>' attribute is set.
     * @see #unsetPassiveMode()
     * @see #getPassiveMode()
     * @see #setPassiveMode(Boolean)
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
     * @see #setTimeout(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Timeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='timeout' namespace='##targetNamespace'"
     * @generated
     */
    Integer getTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @generated
     */
    void setTimeout(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(Integer)
     * @generated
     */
    void unsetTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timeout</em>' attribute is set.
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(Integer)
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
     * @see #setSoTimeout(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_SoTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='soTimeout' namespace='##targetNamespace'"
     * @generated
     */
    Integer getSoTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>So Timeout</em>' attribute.
     * @see #isSetSoTimeout()
     * @see #unsetSoTimeout()
     * @see #getSoTimeout()
     * @generated
     */
    void setSoTimeout(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSoTimeout()
     * @see #getSoTimeout()
     * @see #setSoTimeout(Integer)
     * @generated
     */
    void unsetSoTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>So Timeout</em>' attribute is set.
     * @see #unsetSoTimeout()
     * @see #getSoTimeout()
     * @see #setSoTimeout(Integer)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_SiteCommand()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='siteCommand' namespace='##targetNamespace'"
     * @generated
     */
    String getSiteCommand();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Site Command</em>' attribute.
     * @see #getSiteCommand()
     * @generated
     */
    void setSiteCommand(String value);

    /**
     * Returns the value of the '<em><b>Consume</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' reference.
     * @see #setConsume(RemoteFileConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Consume()
     * @model extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume <em>Consume</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume</em>' reference.
     * @see #getConsume()
     * @generated
     */
    void setConsume(RemoteFileConsumerType value);

    /**
     * Returns the value of the '<em><b>Produce</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Produce</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Produce</em>' reference.
     * @see #setProduce(RemoteFileProducerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpBindingType_Produce()
     * @model extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce <em>Produce</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(RemoteFileProducerType value);

} // CamelFtpBindingType
