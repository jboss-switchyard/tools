/**
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mail Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getUnseen <em>Unseen</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getCopyTo <em>Copy To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getAccountType <em>Account Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType()
 * @model extendedMetaData="name='CamelMailConsumerType' kind='elementOnly'"
 * @generated
 */
public interface CamelMailConsumerType extends ScheduledBatchPollConsumerType {
    /**
     * Returns the value of the '<em><b>Folder Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Folder Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Folder Name</em>' attribute.
     * @see #setFolderName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_FolderName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='folderName' namespace='##targetNamespace'"
     * @generated
     */
    String getFolderName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getFolderName <em>Folder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Folder Name</em>' attribute.
     * @see #getFolderName()
     * @generated
     */
    void setFolderName(String value);

    /**
     * Returns the value of the '<em><b>Fetch Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fetch Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fetch Size</em>' attribute.
     * @see #isSetFetchSize()
     * @see #unsetFetchSize()
     * @see #setFetchSize(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_FetchSize()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='fetchSize' namespace='##targetNamespace'"
     * @generated
     */
    Integer getFetchSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fetch Size</em>' attribute.
     * @see #isSetFetchSize()
     * @see #unsetFetchSize()
     * @see #getFetchSize()
     * @generated
     */
    void setFetchSize(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFetchSize()
     * @see #getFetchSize()
     * @see #setFetchSize(Integer)
     * @generated
     */
    void unsetFetchSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fetch Size</em>' attribute is set.
     * @see #unsetFetchSize()
     * @see #getFetchSize()
     * @see #setFetchSize(Integer)
     * @generated
     */
    boolean isSetFetchSize();

    /**
     * Returns the value of the '<em><b>Unseen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unseen</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unseen</em>' attribute.
     * @see #isSetUnseen()
     * @see #unsetUnseen()
     * @see #setUnseen(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_Unseen()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='unseen' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getUnseen();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getUnseen <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unseen</em>' attribute.
     * @see #isSetUnseen()
     * @see #unsetUnseen()
     * @see #getUnseen()
     * @generated
     */
    void setUnseen(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getUnseen <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnseen()
     * @see #getUnseen()
     * @see #setUnseen(Boolean)
     * @generated
     */
    void unsetUnseen();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getUnseen <em>Unseen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unseen</em>' attribute is set.
     * @see #unsetUnseen()
     * @see #getUnseen()
     * @see #setUnseen(Boolean)
     * @generated
     */
    boolean isSetUnseen();

    /**
     * Returns the value of the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #setDelete(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_Delete()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #getDelete()
     * @generated
     */
    void setDelete(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelete()
     * @see #getDelete()
     * @see #setDelete(Boolean)
     * @generated
     */
    void unsetDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDelete <em>Delete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delete</em>' attribute is set.
     * @see #unsetDelete()
     * @see #getDelete()
     * @see #setDelete(Boolean)
     * @generated
     */
    boolean isSetDelete();

    /**
     * Returns the value of the '<em><b>Copy To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copy To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copy To</em>' attribute.
     * @see #setCopyTo(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_CopyTo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='copyTo' namespace='##targetNamespace'"
     * @generated
     */
    String getCopyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getCopyTo <em>Copy To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copy To</em>' attribute.
     * @see #getCopyTo()
     * @generated
     */
    void setCopyTo(String value);

    /**
     * Returns the value of the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disconnect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #setDisconnect(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_Disconnect()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #getDisconnect()
     * @generated
     */
    void setDisconnect(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disconnect</em>' attribute is set.
     * @see #unsetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
     * @generated
     */
    boolean isSetDisconnect();

    /**
     * Returns the value of the '<em><b>Account Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.MailConsumerAccountType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Account Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Account Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.MailConsumerAccountType
     * @see #setAccountType(MailConsumerAccountType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelMailConsumerType_AccountType()
     * @model default=""
     *        extendedMetaData="kind='attribute' name='accountType'"
     * @generated
     */
    MailConsumerAccountType getAccountType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMailConsumerType#getAccountType <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Account Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.MailConsumerAccountType
     * @see #getAccountType()
     * @generated
     */
    void setAccountType(MailConsumerAccountType value);

} // CamelMailConsumerType
