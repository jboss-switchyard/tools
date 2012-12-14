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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getIsImplicit <em>Is Implicit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecProt <em>Exec Prot</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}</li>
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
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Implicit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Implicit</em>' attribute.
     * @see #isSetIsImplicit()
     * @see #unsetIsImplicit()
     * @see #setIsImplicit(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_IsImplicit()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='isImplicit' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getIsImplicit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getIsImplicit <em>Is Implicit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Implicit</em>' attribute.
     * @see #isSetIsImplicit()
     * @see #unsetIsImplicit()
     * @see #getIsImplicit()
     * @generated
     */
    void setIsImplicit(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getIsImplicit <em>Is Implicit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsImplicit()
     * @see #getIsImplicit()
     * @see #setIsImplicit(Boolean)
     * @generated
     */
    void unsetIsImplicit();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getIsImplicit <em>Is Implicit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Implicit</em>' attribute is set.
     * @see #unsetIsImplicit()
     * @see #getIsImplicit()
     * @see #setIsImplicit(Boolean)
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
     * @see #setExecPbsz(Long)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_ExecPbsz()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.LongObject"
     *        extendedMetaData="kind='element' name='execPbsz' namespace='##targetNamespace'"
     * @generated
     */
    Long getExecPbsz();

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
    void setExecPbsz(Long value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExecPbsz()
     * @see #getExecPbsz()
     * @see #setExecPbsz(Long)
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
     * @see #setExecPbsz(Long)
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
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disable Secure Data Channel Defaults</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disable Secure Data Channel Defaults</em>' attribute.
     * @see #isSetDisableSecureDataChannelDefaults()
     * @see #unsetDisableSecureDataChannelDefaults()
     * @see #setDisableSecureDataChannelDefaults(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelFtpsBindingType_DisableSecureDataChannelDefaults()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='disableSecureDataChannelDefaults' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDisableSecureDataChannelDefaults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disable Secure Data Channel Defaults</em>' attribute.
     * @see #isSetDisableSecureDataChannelDefaults()
     * @see #unsetDisableSecureDataChannelDefaults()
     * @see #getDisableSecureDataChannelDefaults()
     * @generated
     */
    void setDisableSecureDataChannelDefaults(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisableSecureDataChannelDefaults()
     * @see #getDisableSecureDataChannelDefaults()
     * @see #setDisableSecureDataChannelDefaults(Boolean)
     * @generated
     */
    void unsetDisableSecureDataChannelDefaults();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disable Secure Data Channel Defaults</em>' attribute is set.
     * @see #unsetDisableSecureDataChannelDefaults()
     * @see #getDisableSecureDataChannelDefaults()
     * @see #setDisableSecureDataChannelDefaults(Boolean)
     * @generated
     */
    boolean isSetDisableSecureDataChannelDefaults();

} // CamelFtpsBindingType
