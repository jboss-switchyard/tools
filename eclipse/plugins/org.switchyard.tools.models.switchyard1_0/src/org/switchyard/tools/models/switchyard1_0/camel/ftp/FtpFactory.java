/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage
 * @generated
 */
public interface FtpFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FtpFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Camel Ftp Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Ftp Binding Type</em>'.
     * @generated
     */
    CamelFtpBindingType createCamelFtpBindingType();

    /**
     * Returns a new object of class '<em>Camel Ftps Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Ftps Binding Type</em>'.
     * @generated
     */
    CamelFtpsBindingType createCamelFtpsBindingType();

    /**
     * Returns a new object of class '<em>Camel Sftp Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Sftp Binding Type</em>'.
     * @generated
     */
    CamelSftpBindingType createCamelSftpBindingType();

    /**
     * Returns a new object of class '<em>Remote File Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote File Consumer Type</em>'.
     * @generated
     */
    RemoteFileConsumerType createRemoteFileConsumerType();

    /**
     * Returns a new object of class '<em>Remote File Producer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote File Producer Type</em>'.
     * @generated
     */
    RemoteFileProducerType createRemoteFileProducerType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    FtpPackage getFtpPackage();

} //FtpFactory
