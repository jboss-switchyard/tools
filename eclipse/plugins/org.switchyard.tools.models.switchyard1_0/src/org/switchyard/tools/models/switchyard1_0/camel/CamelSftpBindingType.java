/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getKnownHostsFile <em>Known Hosts File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFile <em>Private Key File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSftpBindingType()
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSftpBindingType_KnownHostsFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='knownHostsFile' namespace='##targetNamespace'"
     * @generated
     */
    String getKnownHostsFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getKnownHostsFile <em>Known Hosts File</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSftpBindingType_PrivateKeyFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='privateKeyFile' namespace='##targetNamespace'"
     * @generated
     */
    String getPrivateKeyFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFile <em>Private Key File</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelSftpBindingType_PrivateKeyFilePassphrase()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='privateKeyFilePassphrase' namespace='##targetNamespace'"
     * @generated
     */
    String getPrivateKeyFilePassphrase();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Private Key File Passphrase</em>' attribute.
     * @see #getPrivateKeyFilePassphrase()
     * @generated
     */
    void setPrivateKeyFilePassphrase(String value);

} // CamelSftpBindingType
