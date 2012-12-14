/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Sftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getKnownHostsFile <em>Known Hosts File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFile <em>Private Key File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelSftpBindingType()
 * @model extendedMetaData="name='CamelSftpBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelSftpBindingType extends CamelRemoteBindingType {
    /**
     * Returns the value of the '<em><b>Known Hosts File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Known Hosts File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Known Hosts File</em>' attribute.
     * @see #setKnownHostsFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelSftpBindingType_KnownHostsFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='knownHostsFile' namespace='##targetNamespace'"
     * @generated
     */
    String getKnownHostsFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getKnownHostsFile <em>Known Hosts File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Known Hosts File</em>' attribute.
     * @see #getKnownHostsFile()
     * @generated
     */
    void setKnownHostsFile(String value);

    /**
     * Returns the value of the '<em><b>Private Key File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Private Key File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Private Key File</em>' attribute.
     * @see #setPrivateKeyFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelSftpBindingType_PrivateKeyFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='privateKeyFile' namespace='##targetNamespace'"
     * @generated
     */
    String getPrivateKeyFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFile <em>Private Key File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Private Key File</em>' attribute.
     * @see #getPrivateKeyFile()
     * @generated
     */
    void setPrivateKeyFile(String value);

    /**
     * Returns the value of the '<em><b>Private Key File Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Private Key File Passphrase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Private Key File Passphrase</em>' attribute.
     * @see #setPrivateKeyFilePassphrase(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelSftpBindingType_PrivateKeyFilePassphrase()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='privateKeyFilePassphrase' namespace='##targetNamespace'"
     * @generated
     */
    String getPrivateKeyFilePassphrase();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Private Key File Passphrase</em>' attribute.
     * @see #getPrivateKeyFilePassphrase()
     * @generated
     */
    void setPrivateKeyFilePassphrase(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelSftpBindingType_Consume()
     * @model extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConsume <em>Consume</em>}' reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getCamelSftpBindingType_Produce()
     * @model extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    RemoteFileProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getProduce <em>Produce</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(RemoteFileProducerType value);

} // CamelSftpBindingType
