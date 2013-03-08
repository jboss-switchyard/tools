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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUnseen <em>Unseen</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getCopyTo <em>Copy To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDisconnect <em>Disconnect</em>}</li>
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
     * The default value is <code>"1000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see #setInitialDelay(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_InitialDelay()
     * @model default="1000" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='initialDelay' namespace='##targetNamespace'"
     * @generated
     */
    Object getInitialDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Delay</em>' attribute.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @generated
     */
    void setInitialDelay(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialDelay()
     * @see #getInitialDelay()
     * @see #setInitialDelay(Object)
     * @generated
     */
    void unsetInitialDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay <em>Initial Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial Delay</em>' attribute is set.
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @see #setInitialDelay(Object)
     * @generated
     */
    boolean isSetInitialDelay();

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * The default value is <code>"60000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see #setDelay(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Delay()
     * @model default="60000" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
    Object getDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #isSetDelay()
     * @see #unsetDelay()
     * @see #getDelay()
     * @generated
     */
    void setDelay(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelay()
     * @see #getDelay()
     * @see #setDelay(Object)
     * @generated
     */
    void unsetDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay <em>Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delay</em>' attribute is set.
     * @see #unsetDelay()
     * @see #getDelay()
     * @see #setDelay(Object)
     * @generated
     */
    boolean isSetDelay();

    /**
     * Returns the value of the '<em><b>Use Fixed Delay</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Fixed Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #setUseFixedDelay(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_UseFixedDelay()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='useFixedDelay' namespace='##targetNamespace'"
     * @generated
     */
    boolean isUseFixedDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Fixed Delay</em>' attribute.
     * @see #isSetUseFixedDelay()
     * @see #unsetUseFixedDelay()
     * @see #isUseFixedDelay()
     * @generated
     */
    void setUseFixedDelay(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseFixedDelay()
     * @see #isUseFixedDelay()
     * @see #setUseFixedDelay(boolean)
     * @generated
     */
    void unsetUseFixedDelay();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Fixed Delay</em>' attribute is set.
     * @see #unsetUseFixedDelay()
     * @see #isUseFixedDelay()
     * @see #setUseFixedDelay(boolean)
     * @generated
     */
    boolean isSetUseFixedDelay();

    /**
     * Returns the value of the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Empty Message When Idle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_SendEmptyMessageWhenIdle()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='sendEmptyMessageWhenIdle' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSendEmptyMessageWhenIdle();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Empty Message When Idle</em>' attribute.
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #isSendEmptyMessageWhenIdle()
     * @generated
     */
    void setSendEmptyMessageWhenIdle(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSendEmptyMessageWhenIdle()
     * @see #isSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(boolean)
     * @generated
     */
    void unsetSendEmptyMessageWhenIdle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Send Empty Message When Idle</em>' attribute is set.
     * @see #unsetSendEmptyMessageWhenIdle()
     * @see #isSendEmptyMessageWhenIdle()
     * @see #setSendEmptyMessageWhenIdle(boolean)
     * @generated
     */
    boolean isSetSendEmptyMessageWhenIdle();

    /**
     * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
     * The default value is <code>"MILLISECONDS"</code>.
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
     * @model default="MILLISECONDS" unsettable="true"
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
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Messages Per Poll</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #isSetMaxMessagesPerPoll()
     * @see #unsetMaxMessagesPerPoll()
     * @see #setMaxMessagesPerPoll(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_MaxMessagesPerPoll()
     * @model default="0" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='maxMessagesPerPoll' namespace='##targetNamespace'"
     * @generated
     */
    Object getMaxMessagesPerPoll();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Messages Per Poll</em>' attribute.
     * @see #isSetMaxMessagesPerPoll()
     * @see #unsetMaxMessagesPerPoll()
     * @see #getMaxMessagesPerPoll()
     * @generated
     */
    void setMaxMessagesPerPoll(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxMessagesPerPoll()
     * @see #getMaxMessagesPerPoll()
     * @see #setMaxMessagesPerPoll(Object)
     * @generated
     */
    void unsetMaxMessagesPerPoll();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Messages Per Poll</em>' attribute is set.
     * @see #unsetMaxMessagesPerPoll()
     * @see #getMaxMessagesPerPoll()
     * @see #setMaxMessagesPerPoll(Object)
     * @generated
     */
    boolean isSetMaxMessagesPerPoll();

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
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fetch Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fetch Size</em>' attribute.
     * @see #isSetFetchSize()
     * @see #unsetFetchSize()
     * @see #setFetchSize(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_FetchSize()
     * @model default="-1" unsettable="true" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='fetchSize' namespace='##targetNamespace'"
     * @generated
     */
    Object getFetchSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fetch Size</em>' attribute.
     * @see #isSetFetchSize()
     * @see #unsetFetchSize()
     * @see #getFetchSize()
     * @generated
     */
    void setFetchSize(Object value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFetchSize()
     * @see #getFetchSize()
     * @see #setFetchSize(Object)
     * @generated
     */
    void unsetFetchSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fetch Size</em>' attribute is set.
     * @see #unsetFetchSize()
     * @see #getFetchSize()
     * @see #setFetchSize(Object)
     * @generated
     */
    boolean isSetFetchSize();

    /**
     * Returns the value of the '<em><b>Unseen</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unseen</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unseen</em>' attribute.
     * @see #isSetUnseen()
     * @see #unsetUnseen()
     * @see #setUnseen(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Unseen()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='unseen' namespace='##targetNamespace'"
     * @generated
     */
    boolean isUnseen();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUnseen <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unseen</em>' attribute.
     * @see #isSetUnseen()
     * @see #unsetUnseen()
     * @see #isUnseen()
     * @generated
     */
    void setUnseen(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUnseen <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnseen()
     * @see #isUnseen()
     * @see #setUnseen(boolean)
     * @generated
     */
    void unsetUnseen();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isUnseen <em>Unseen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unseen</em>' attribute is set.
     * @see #unsetUnseen()
     * @see #isUnseen()
     * @see #setUnseen(boolean)
     * @generated
     */
    boolean isSetUnseen();

    /**
     * Returns the value of the '<em><b>Delete</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #setDelete(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Delete()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDelete();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete</em>' attribute.
     * @see #isSetDelete()
     * @see #unsetDelete()
     * @see #isDelete()
     * @generated
     */
    void setDelete(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelete()
     * @see #isDelete()
     * @see #setDelete(boolean)
     * @generated
     */
    void unsetDelete();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDelete <em>Delete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delete</em>' attribute is set.
     * @see #unsetDelete()
     * @see #isDelete()
     * @see #setDelete(boolean)
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
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disconnect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #setDisconnect(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailConsumerType_Disconnect()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisconnect();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disconnect</em>' attribute.
     * @see #isSetDisconnect()
     * @see #unsetDisconnect()
     * @see #isDisconnect()
     * @generated
     */
    void setDisconnect(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDisconnect <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
     * @generated
     */
    void unsetDisconnect();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#isDisconnect <em>Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disconnect</em>' attribute is set.
     * @see #unsetDisconnect()
     * @see #isDisconnect()
     * @see #setDisconnect(boolean)
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
