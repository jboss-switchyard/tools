/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Mail Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUnseen <em>Unseen</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getCopyTo <em>Copy To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getAccountType <em>Account Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType()
 * @model extendedMetaData="name='CamelMailConsumerType' kind='elementOnly'"
 * @generated
 */
public interface CamelMailConsumerType extends EObject {
    /**
     * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute.
     * @see #setInitialDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_InitialDelay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='initialDelay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getInitialDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Delay</em>' attribute.
     * @see #getInitialDelay()
     * @generated
     */
    void setInitialDelay(Integer value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Delay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
    Integer getDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(Integer value);

    /**
     * Returns the value of the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Fixed Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_UseFixedDelay()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='useFixedDelay' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getUseFixedDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @generated
     */
    void setUseFixedDelay(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @generated
     */
    void unsetUseFixedDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Fixed Delay</em>' attribute is set.
     * @see #unsetUseFixedDelay()
     * @see #getUseFixedDelay()
     * @see #setUseFixedDelay(Boolean)
     * @generated
     */
    boolean isSetUseFixedDelay();

    /**
     * Returns the value of the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Empty Message When Idle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_SendEmptyMessageWhenIdle()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='sendEmptyMessageWhenIdle' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getSendEmptyMessageWhenIdle();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     */
    void setSendEmptyMessageWhenIdle(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @generated
     */
    void unsetSendEmptyMessageWhenIdle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Empty Message When Idle</em>' attribute is set.
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #getSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(Boolean)
     * @generated
     */
    boolean isSetSendEmptyMessageWhenIdle();

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_TimeUnit()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='timeUnit' namespace='##targetNamespace'"
     * @generated
     */
    TimeUnitType getTimeUnit();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Unit</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
     * @see #isSetTimeUnit()
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @generated
     */
    void setTimeUnit(TimeUnitType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @generated
     */
    void unsetTimeUnit();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit <em>Time Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Unit</em>' attribute is set.
     * @see #unsetTimeUnit()
     * @see #getTimeUnit()
     * @see #setTimeUnit(TimeUnitType)
     * @generated
     */
    boolean isSetTimeUnit();

    /**
     * Returns the value of the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Messages Per Poll</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #setMaxMessagesPerPoll(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_MaxMessagesPerPoll()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='maxMessagesPerPoll' namespace='##targetNamespace'"
     * @generated
     */
    Integer getMaxMessagesPerPoll();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #getMaxMessagesPerPoll()
     * @generated
     */
    void setMaxMessagesPerPoll(Integer value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_FolderName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='folderName' namespace='##targetNamespace'"
     * @generated
     */
    String getFolderName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFolderName <em>Folder Name</em>}' attribute.
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
     * @see #setFetchSize(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_FetchSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='fetchSize' namespace='##targetNamespace'"
     * @generated
     */
    Integer getFetchSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fetch Size</em>' attribute.
     * @see #getFetchSize()
     * @generated
     */
    void setFetchSize(Integer value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Unseen()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='unseen' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getUnseen();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUnseen <em>Unseen</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUnseen <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnseen()
     * @see #getUnseen()
     * @see #setUnseen(Boolean)
     * @generated
     */
    void unsetUnseen();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUnseen <em>Unseen</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Delete()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelete <em>Delete</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelete()
     * @see #getDelete()
     * @see #setDelete(Boolean)
     * @generated
     */
    void unsetDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelete <em>Delete</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_CopyTo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='copyTo' namespace='##targetNamespace'"
     * @generated
     */
    String getCopyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getCopyTo <em>Copy To</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Disconnect()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #getDisconnect()
     * @see #setDisconnect(Boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}' attribute is set.
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
     * The default value is <code>"imap"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Account Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Account Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
     * @see #isSetAccountType()
     * @see #unsetAccountType()
     * @see #setAccountType(MailConsumerAccountType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_AccountType()
     * @model default="imap" unsettable="true"
     *        extendedMetaData="kind='attribute' name='accountType'"
     * @generated
     */
    MailConsumerAccountType getAccountType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getAccountType <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Account Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
     * @see #isSetAccountType()
     * @see #unsetAccountType()
     * @see #getAccountType()
     * @generated
     */
    void setAccountType(MailConsumerAccountType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getAccountType <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccountType()
     * @see #getAccountType()
     * @see #setAccountType(MailConsumerAccountType)
     * @generated
     */
    void unsetAccountType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getAccountType <em>Account Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Account Type</em>' attribute is set.
     * @see #unsetAccountType()
     * @see #getAccountType()
     * @see #setAccountType(MailConsumerAccountType)
     * @generated
     */
    boolean isSetAccountType();

} // CamelMailConsumerType
