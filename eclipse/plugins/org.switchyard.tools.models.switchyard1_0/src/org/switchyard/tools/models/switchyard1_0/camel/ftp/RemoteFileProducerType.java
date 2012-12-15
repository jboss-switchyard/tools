/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.eclipse.emf.ecore.EObject;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote File Producer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getFileExist <em>File Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempPrefix <em>Temp Prefix</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempFileName <em>Temp File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getKeepLastModified <em>Keep Last Modified</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getDoneFileName <em>Done File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType()
 * @model extendedMetaData="name='RemoteFileProducerType' kind='elementOnly'"
 * @generated
 */
public interface RemoteFileProducerType extends EObject {

    /**
     * Returns the value of the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Exist</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Exist</em>' attribute.
     * @see #setFileExist(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType_FileExist()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='fileExist' namespace='##targetNamespace'"
     * @generated
     */
    String getFileExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getFileExist <em>File Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Exist</em>' attribute.
     * @see #getFileExist()
     * @generated
     */
    void setFileExist(String value);

    /**
     * Returns the value of the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temp Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Temp Prefix</em>' attribute.
     * @see #setTempPrefix(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType_TempPrefix()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='tempPrefix' namespace='##targetNamespace'"
     * @generated
     */
    String getTempPrefix();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempPrefix <em>Temp Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Temp Prefix</em>' attribute.
     * @see #getTempPrefix()
     * @generated
     */
    void setTempPrefix(String value);

    /**
     * Returns the value of the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temp File Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Temp File Name</em>' attribute.
     * @see #setTempFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType_TempFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='tempFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getTempFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempFileName <em>Temp File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Temp File Name</em>' attribute.
     * @see #getTempFileName()
     * @generated
     */
    void setTempFileName(String value);

    /**
     * Returns the value of the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keep Last Modified</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keep Last Modified</em>' attribute.
     * @see #isSetKeepLastModified()
     * @see #unsetKeepLastModified()
     * @see #setKeepLastModified(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType_KeepLastModified()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='keepLastModified' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getKeepLastModified();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getKeepLastModified <em>Keep Last Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Last Modified</em>' attribute.
     * @see #isSetKeepLastModified()
     * @see #unsetKeepLastModified()
     * @see #getKeepLastModified()
     * @generated
     */
    void setKeepLastModified(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getKeepLastModified <em>Keep Last Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeepLastModified()
     * @see #getKeepLastModified()
     * @see #setKeepLastModified(Boolean)
     * @generated
     */
    void unsetKeepLastModified();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getKeepLastModified <em>Keep Last Modified</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Keep Last Modified</em>' attribute is set.
     * @see #unsetKeepLastModified()
     * @see #getKeepLastModified()
     * @see #setKeepLastModified(Boolean)
     * @generated
     */
    boolean isSetKeepLastModified();

    /**
     * Returns the value of the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eager Delete Target File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eager Delete Target File</em>' attribute.
     * @see #isSetEagerDeleteTargetFile()
     * @see #unsetEagerDeleteTargetFile()
     * @see #setEagerDeleteTargetFile(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType_EagerDeleteTargetFile()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='eagerDeleteTargetFile' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getEagerDeleteTargetFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eager Delete Target File</em>' attribute.
     * @see #isSetEagerDeleteTargetFile()
     * @see #unsetEagerDeleteTargetFile()
     * @see #getEagerDeleteTargetFile()
     * @generated
     */
    void setEagerDeleteTargetFile(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEagerDeleteTargetFile()
     * @see #getEagerDeleteTargetFile()
     * @see #setEagerDeleteTargetFile(Boolean)
     * @generated
     */
    void unsetEagerDeleteTargetFile();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eager Delete Target File</em>' attribute is set.
     * @see #unsetEagerDeleteTargetFile()
     * @see #getEagerDeleteTargetFile()
     * @see #setEagerDeleteTargetFile(Boolean)
     * @generated
     */
    boolean isSetEagerDeleteTargetFile();

    /**
     * Returns the value of the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Done File Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Done File Name</em>' attribute.
     * @see #setDoneFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#getRemoteFileProducerType_DoneFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doneFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getDoneFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getDoneFileName <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Done File Name</em>' attribute.
     * @see #getDoneFileName()
     * @generated
     */
    void setDoneFileName(String value);
} // RemoteFileProducerType
