/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getFileExist <em>File Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempPrefix <em>Temp Prefix</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempFileName <em>Temp File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isKeepLastModified <em>Keep Last Modified</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isEagerDeleteTargetFile <em>Eager Delete Target File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getDoneFileName <em>Done File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType()
 * @model extendedMetaData="name='FileProducerType' kind='elementOnly'"
 * @generated
 */
public interface FileProducerType extends EObject {

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType_FileExist()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='fileExist' namespace='##targetNamespace'"
     * @generated
     */
    String getFileExist();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getFileExist <em>File Exist</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType_TempPrefix()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='tempPrefix' namespace='##targetNamespace'"
     * @generated
     */
    String getTempPrefix();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempPrefix <em>Temp Prefix</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType_TempFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='tempFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getTempFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempFileName <em>Temp File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Temp File Name</em>' attribute.
     * @see #getTempFileName()
     * @generated
     */
    void setTempFileName(String value);

    /**
     * Returns the value of the '<em><b>Keep Last Modified</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keep Last Modified</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keep Last Modified</em>' attribute.
     * @see #isSetKeepLastModified()
     * @see #unsetKeepLastModified()
     * @see #setKeepLastModified(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType_KeepLastModified()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='keepLastModified' namespace='##targetNamespace'"
     * @generated
     */
    boolean isKeepLastModified();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isKeepLastModified <em>Keep Last Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Last Modified</em>' attribute.
     * @see #isSetKeepLastModified()
     * @see #unsetKeepLastModified()
     * @see #isKeepLastModified()
     * @generated
     */
    void setKeepLastModified(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isKeepLastModified <em>Keep Last Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeepLastModified()
     * @see #isKeepLastModified()
     * @see #setKeepLastModified(boolean)
     * @generated
     */
    void unsetKeepLastModified();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isKeepLastModified <em>Keep Last Modified</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Keep Last Modified</em>' attribute is set.
     * @see #unsetKeepLastModified()
     * @see #isKeepLastModified()
     * @see #setKeepLastModified(boolean)
     * @generated
     */
    boolean isSetKeepLastModified();

    /**
     * Returns the value of the '<em><b>Eager Delete Target File</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eager Delete Target File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eager Delete Target File</em>' attribute.
     * @see #isSetEagerDeleteTargetFile()
     * @see #unsetEagerDeleteTargetFile()
     * @see #setEagerDeleteTargetFile(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType_EagerDeleteTargetFile()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='eagerDeleteTargetFile' namespace='##targetNamespace'"
     * @generated
     */
    boolean isEagerDeleteTargetFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isEagerDeleteTargetFile <em>Eager Delete Target File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eager Delete Target File</em>' attribute.
     * @see #isSetEagerDeleteTargetFile()
     * @see #unsetEagerDeleteTargetFile()
     * @see #isEagerDeleteTargetFile()
     * @generated
     */
    void setEagerDeleteTargetFile(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isEagerDeleteTargetFile <em>Eager Delete Target File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEagerDeleteTargetFile()
     * @see #isEagerDeleteTargetFile()
     * @see #setEagerDeleteTargetFile(boolean)
     * @generated
     */
    void unsetEagerDeleteTargetFile();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#isEagerDeleteTargetFile <em>Eager Delete Target File</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eager Delete Target File</em>' attribute is set.
     * @see #unsetEagerDeleteTargetFile()
     * @see #isEagerDeleteTargetFile()
     * @see #setEagerDeleteTargetFile(boolean)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getFileProducerType_DoneFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doneFileName' namespace='##targetNamespace'"
     * @generated
     */
    String getDoneFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getDoneFileName <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Done File Name</em>' attribute.
     * @see #getDoneFileName()
     * @generated
     */
    void setDoneFileName(String value);
} // FileProducerType
