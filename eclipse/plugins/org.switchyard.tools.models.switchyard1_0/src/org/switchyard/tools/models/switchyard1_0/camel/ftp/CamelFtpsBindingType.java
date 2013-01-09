/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Ftps Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getSecurityProtocol <em>Security Protocol</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isIsImplicit <em>Is Implicit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecProt <em>Exec Prot</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType()
 * @model extendedMetaData="name='CamelFtpsBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelFtpsBindingType extends CamelFtpBindingType {
    /**
     * Returns the value of the '<em><b>Security Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Protocol</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Security Protocol</em>' attribute.
     * @see #setSecurityProtocol(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_SecurityProtocol()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='securityProtocol' namespace='##targetNamespace'"
     * @generated
     */
    String getSecurityProtocol();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getSecurityProtocol <em>Security Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security Protocol</em>' attribute.
     * @see #getSecurityProtocol()
     * @generated
     */
    void setSecurityProtocol(String value);

    /**
     * Returns the value of the '<em><b>Is Implicit</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Implicit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Implicit</em>' attribute.
     * @see #isSetIsImplicit()
     * @see #unsetIsImplicit()
     * @see #setIsImplicit(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_IsImplicit()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='isImplicit' namespace='##targetNamespace'"
     * @generated
     */
    boolean isIsImplicit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isIsImplicit <em>Is Implicit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Implicit</em>' attribute.
     * @see #isSetIsImplicit()
     * @see #unsetIsImplicit()
     * @see #isIsImplicit()
     * @generated
     */
    void setIsImplicit(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isIsImplicit <em>Is Implicit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsImplicit()
     * @see #isIsImplicit()
     * @see #setIsImplicit(boolean)
     * @generated
     */
    void unsetIsImplicit();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isIsImplicit <em>Is Implicit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Implicit</em>' attribute is set.
     * @see #unsetIsImplicit()
     * @see #isIsImplicit()
     * @see #setIsImplicit(boolean)
     * @generated
     */
    boolean isSetIsImplicit();

    /**
     * Returns the value of the '<em><b>Exec Pbsz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exec Pbsz</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exec Pbsz</em>' attribute.
     * @see #isSetExecPbsz()
     * @see #unsetExecPbsz()
     * @see #setExecPbsz(long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_ExecPbsz()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='element' name='execPbsz' namespace='##targetNamespace'"
     * @generated
     */
    long getExecPbsz();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exec Pbsz</em>' attribute.
     * @see #isSetExecPbsz()
     * @see #unsetExecPbsz()
     * @see #getExecPbsz()
     * @generated
     */
    void setExecPbsz(long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExecPbsz()
     * @see #getExecPbsz()
     * @see #setExecPbsz(long)
     * @generated
     */
    void unsetExecPbsz();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exec Pbsz</em>' attribute is set.
     * @see #unsetExecPbsz()
     * @see #getExecPbsz()
     * @see #setExecPbsz(long)
     * @generated
     */
    boolean isSetExecPbsz();

    /**
     * Returns the value of the '<em><b>Exec Prot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exec Prot</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exec Prot</em>' attribute.
     * @see #setExecProt(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_ExecProt()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='execProt' namespace='##targetNamespace'"
     * @generated
     */
    String getExecProt();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecProt <em>Exec Prot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exec Prot</em>' attribute.
     * @see #getExecProt()
     * @generated
     */
    void setExecProt(String value);

    /**
     * Returns the value of the '<em><b>Disable Secure Data Channel Defaults</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disable Secure Data Channel Defaults</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disable Secure Data Channel Defaults</em>' attribute.
     * @see #isSetDisableSecureDataChannelDefaults()
     * @see #unsetDisableSecureDataChannelDefaults()
     * @see #setDisableSecureDataChannelDefaults(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_DisableSecureDataChannelDefaults()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disableSecureDataChannelDefaults' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisableSecureDataChannelDefaults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disable Secure Data Channel Defaults</em>' attribute.
     * @see #isSetDisableSecureDataChannelDefaults()
     * @see #unsetDisableSecureDataChannelDefaults()
     * @see #isDisableSecureDataChannelDefaults()
     * @generated
     */
    void setDisableSecureDataChannelDefaults(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisableSecureDataChannelDefaults()
     * @see #isDisableSecureDataChannelDefaults()
     * @see #setDisableSecureDataChannelDefaults(boolean)
     * @generated
     */
    void unsetDisableSecureDataChannelDefaults();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#isDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disable Secure Data Channel Defaults</em>' attribute is set.
     * @see #unsetDisableSecureDataChannelDefaults()
     * @see #isDisableSecureDataChannelDefaults()
     * @see #setDisableSecureDataChannelDefaults(boolean)
     * @generated
     */
    boolean isSetDisableSecureDataChannelDefaults();

} // CamelFtpsBindingType
