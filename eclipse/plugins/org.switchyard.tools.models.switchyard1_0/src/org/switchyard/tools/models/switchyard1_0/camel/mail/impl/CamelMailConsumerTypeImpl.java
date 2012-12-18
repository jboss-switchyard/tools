/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;
import org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Mail Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getUnseen <em>Unseen</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getCopyTo <em>Copy To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getAccountType <em>Account Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMailConsumerTypeImpl extends EObjectImpl implements CamelMailConsumerType {
    /**
     * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected static final Integer INITIAL_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected Integer initialDelay = INITIAL_DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected static final Integer DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected Integer delay = DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #getUseFixedDelay() <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseFixedDelay()
     * @generated
     * @ordered
     */
    protected static final Boolean USE_FIXED_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUseFixedDelay() <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseFixedDelay()
     * @generated
     * @ordered
     */
    protected Boolean useFixedDelay = USE_FIXED_DELAY_EDEFAULT;

    /**
     * This is true if the Use Fixed Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useFixedDelayESet;

    /**
     * The default value of the '{@link #getSendEmptyMessageWhenIdle() <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     * @ordered
     */
    protected static final Boolean SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSendEmptyMessageWhenIdle() <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     * @ordered
     */
    protected Boolean sendEmptyMessageWhenIdle = SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT;

    /**
     * This is true if the Send Empty Message When Idle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sendEmptyMessageWhenIdleESet;

    /**
     * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
    protected static final TimeUnitType TIME_UNIT_EDEFAULT = TimeUnitType.NANOSECONDS;

    /**
     * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
    protected TimeUnitType timeUnit = TIME_UNIT_EDEFAULT;

    /**
     * This is true if the Time Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeUnitESet;

    /**
     * The default value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_MESSAGES_PER_POLL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected Integer maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;

    /**
     * The default value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFolderName()
     * @generated
     * @ordered
     */
    protected static final String FOLDER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFolderName()
     * @generated
     * @ordered
     */
    protected String folderName = FOLDER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFetchSize()
     * @generated
     * @ordered
     */
    protected static final Integer FETCH_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFetchSize()
     * @generated
     * @ordered
     */
    protected Integer fetchSize = FETCH_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getUnseen() <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnseen()
     * @generated
     * @ordered
     */
    protected static final Boolean UNSEEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnseen() <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnseen()
     * @generated
     * @ordered
     */
    protected Boolean unseen = UNSEEN_EDEFAULT;

    /**
     * This is true if the Unseen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unseenESet;

    /**
     * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelete()
     * @generated
     * @ordered
     */
    protected static final Boolean DELETE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelete()
     * @generated
     * @ordered
     */
    protected Boolean delete = DELETE_EDEFAULT;

    /**
     * This is true if the Delete attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deleteESet;

    /**
     * The default value of the '{@link #getCopyTo() <em>Copy To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyTo()
     * @generated
     * @ordered
     */
    protected static final String COPY_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCopyTo() <em>Copy To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyTo()
     * @generated
     * @ordered
     */
    protected String copyTo = COPY_TO_EDEFAULT;

    /**
     * The default value of the '{@link #getDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnect()
     * @generated
     * @ordered
     */
    protected static final Boolean DISCONNECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnect()
     * @generated
     * @ordered
     */
    protected Boolean disconnect = DISCONNECT_EDEFAULT;

    /**
     * This is true if the Disconnect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disconnectESet;

    /**
     * The default value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountType()
     * @generated
     * @ordered
     */
    protected static final MailConsumerAccountType ACCOUNT_TYPE_EDEFAULT = MailConsumerAccountType.IMAP;

    /**
     * The cached value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountType()
     * @generated
     * @ordered
     */
    protected MailConsumerAccountType accountType = ACCOUNT_TYPE_EDEFAULT;

    /**
     * This is true if the Account Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accountTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMailConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MailPackage.Literals.CAMEL_MAIL_CONSUMER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getInitialDelay() {
        return initialDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialDelay(Integer newInitialDelay) {
        Integer oldInitialDelay = initialDelay;
        initialDelay = newInitialDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, initialDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(Integer newDelay) {
        Integer oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY, oldDelay, delay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getUseFixedDelay() {
        return useFixedDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseFixedDelay(Boolean newUseFixedDelay) {
        Boolean oldUseFixedDelay = useFixedDelay;
        useFixedDelay = newUseFixedDelay;
        boolean oldUseFixedDelayESet = useFixedDelayESet;
        useFixedDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, useFixedDelay, !oldUseFixedDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseFixedDelay() {
        Boolean oldUseFixedDelay = useFixedDelay;
        boolean oldUseFixedDelayESet = useFixedDelayESet;
        useFixedDelay = USE_FIXED_DELAY_EDEFAULT;
        useFixedDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, USE_FIXED_DELAY_EDEFAULT, oldUseFixedDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseFixedDelay() {
        return useFixedDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getSendEmptyMessageWhenIdle() {
        return sendEmptyMessageWhenIdle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendEmptyMessageWhenIdle(Boolean newSendEmptyMessageWhenIdle) {
        Boolean oldSendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        sendEmptyMessageWhenIdle = newSendEmptyMessageWhenIdle;
        boolean oldSendEmptyMessageWhenIdleESet = sendEmptyMessageWhenIdleESet;
        sendEmptyMessageWhenIdleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, oldSendEmptyMessageWhenIdle, sendEmptyMessageWhenIdle, !oldSendEmptyMessageWhenIdleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSendEmptyMessageWhenIdle() {
        Boolean oldSendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        boolean oldSendEmptyMessageWhenIdleESet = sendEmptyMessageWhenIdleESet;
        sendEmptyMessageWhenIdle = SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT;
        sendEmptyMessageWhenIdleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, oldSendEmptyMessageWhenIdle, SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT, oldSendEmptyMessageWhenIdleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSendEmptyMessageWhenIdle() {
        return sendEmptyMessageWhenIdleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType getTimeUnit() {
        return timeUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeUnit(TimeUnitType newTimeUnit) {
        TimeUnitType oldTimeUnit = timeUnit;
        timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
        boolean oldTimeUnitESet = timeUnitESet;
        timeUnitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT, oldTimeUnit, timeUnit, !oldTimeUnitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimeUnit() {
        TimeUnitType oldTimeUnit = timeUnit;
        boolean oldTimeUnitESet = timeUnitESet;
        timeUnit = TIME_UNIT_EDEFAULT;
        timeUnitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT, oldTimeUnit, TIME_UNIT_EDEFAULT, oldTimeUnitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTimeUnit() {
        return timeUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxMessagesPerPoll(Integer newMaxMessagesPerPoll) {
        Integer oldMaxMessagesPerPoll = maxMessagesPerPoll;
        maxMessagesPerPoll = newMaxMessagesPerPoll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, maxMessagesPerPoll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFolderName(String newFolderName) {
        String oldFolderName = folderName;
        folderName = newFolderName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME, oldFolderName, folderName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getFetchSize() {
        return fetchSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFetchSize(Integer newFetchSize) {
        Integer oldFetchSize = fetchSize;
        fetchSize = newFetchSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE, oldFetchSize, fetchSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getUnseen() {
        return unseen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnseen(Boolean newUnseen) {
        Boolean oldUnseen = unseen;
        unseen = newUnseen;
        boolean oldUnseenESet = unseenESet;
        unseenESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN, oldUnseen, unseen, !oldUnseenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUnseen() {
        Boolean oldUnseen = unseen;
        boolean oldUnseenESet = unseenESet;
        unseen = UNSEEN_EDEFAULT;
        unseenESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN, oldUnseen, UNSEEN_EDEFAULT, oldUnseenESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUnseen() {
        return unseenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelete(Boolean newDelete) {
        Boolean oldDelete = delete;
        delete = newDelete;
        boolean oldDeleteESet = deleteESet;
        deleteESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE, oldDelete, delete, !oldDeleteESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDelete() {
        Boolean oldDelete = delete;
        boolean oldDeleteESet = deleteESet;
        delete = DELETE_EDEFAULT;
        deleteESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE, oldDelete, DELETE_EDEFAULT, oldDeleteESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDelete() {
        return deleteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCopyTo() {
        return copyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCopyTo(String newCopyTo) {
        String oldCopyTo = copyTo;
        copyTo = newCopyTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO, oldCopyTo, copyTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDisconnect() {
        return disconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisconnect(Boolean newDisconnect) {
        Boolean oldDisconnect = disconnect;
        disconnect = newDisconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnectESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT, oldDisconnect, disconnect, !oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisconnect() {
        Boolean oldDisconnect = disconnect;
        boolean oldDisconnectESet = disconnectESet;
        disconnect = DISCONNECT_EDEFAULT;
        disconnectESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT, oldDisconnect, DISCONNECT_EDEFAULT, oldDisconnectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisconnect() {
        return disconnectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MailConsumerAccountType getAccountType() {
        return accountType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccountType(MailConsumerAccountType newAccountType) {
        MailConsumerAccountType oldAccountType = accountType;
        accountType = newAccountType == null ? ACCOUNT_TYPE_EDEFAULT : newAccountType;
        boolean oldAccountTypeESet = accountTypeESet;
        accountTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE, oldAccountType, accountType, !oldAccountTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAccountType() {
        MailConsumerAccountType oldAccountType = accountType;
        boolean oldAccountTypeESet = accountTypeESet;
        accountType = ACCOUNT_TYPE_EDEFAULT;
        accountTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE, oldAccountType, ACCOUNT_TYPE_EDEFAULT, oldAccountTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAccountType() {
        return accountTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY:
                return getInitialDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                return getDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY:
                return getUseFixedDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return getSendEmptyMessageWhenIdle();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
                return getTimeUnit();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                return getFolderName();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                return getFetchSize();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                return getUnseen();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                return getDelete();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                return getCopyTo();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                return getDisconnect();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                return getAccountType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay((Integer)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                setDelay((Integer)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY:
                setUseFixedDelay((Boolean)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                setSendEmptyMessageWhenIdle((Boolean)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
                setTimeUnit((TimeUnitType)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll((Integer)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                setFolderName((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                setFetchSize((Integer)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                setUnseen((Boolean)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                setCopyTo((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                setDisconnect((Boolean)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                setAccountType((MailConsumerAccountType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay(INITIAL_DELAY_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                setDelay(DELAY_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY:
                unsetUseFixedDelay();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                unsetSendEmptyMessageWhenIdle();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
                unsetTimeUnit();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll(MAX_MESSAGES_PER_POLL_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                setFolderName(FOLDER_NAME_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                setFetchSize(FETCH_SIZE_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                unsetUnseen();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                unsetDelete();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                setCopyTo(COPY_TO_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                unsetDisconnect();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                unsetAccountType();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY:
                return INITIAL_DELAY_EDEFAULT == null ? initialDelay != null : !INITIAL_DELAY_EDEFAULT.equals(initialDelay);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isSetUseFixedDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSetSendEmptyMessageWhenIdle();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
                return isSetTimeUnit();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return MAX_MESSAGES_PER_POLL_EDEFAULT == null ? maxMessagesPerPoll != null : !MAX_MESSAGES_PER_POLL_EDEFAULT.equals(maxMessagesPerPoll);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                return FETCH_SIZE_EDEFAULT == null ? fetchSize != null : !FETCH_SIZE_EDEFAULT.equals(fetchSize);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                return isSetUnseen();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                return isSetDelete();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                return COPY_TO_EDEFAULT == null ? copyTo != null : !COPY_TO_EDEFAULT.equals(copyTo);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                return isSetDisconnect();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE:
                return isSetAccountType();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (initialDelay: ");
        result.append(initialDelay);
        result.append(", delay: ");
        result.append(delay);
        result.append(", useFixedDelay: ");
        if (useFixedDelayESet) result.append(useFixedDelay); else result.append("<unset>");
        result.append(", sendEmptyMessageWhenIdle: ");
        if (sendEmptyMessageWhenIdleESet) result.append(sendEmptyMessageWhenIdle); else result.append("<unset>");
        result.append(", timeUnit: ");
        if (timeUnitESet) result.append(timeUnit); else result.append("<unset>");
        result.append(", maxMessagesPerPoll: ");
        result.append(maxMessagesPerPoll);
        result.append(", folderName: ");
        result.append(folderName);
        result.append(", fetchSize: ");
        result.append(fetchSize);
        result.append(", unseen: ");
        if (unseenESet) result.append(unseen); else result.append("<unset>");
        result.append(", delete: ");
        if (deleteESet) result.append(delete); else result.append("<unset>");
        result.append(", copyTo: ");
        result.append(copyTo);
        result.append(", disconnect: ");
        if (disconnectESet) result.append(disconnect); else result.append("<unset>");
        result.append(", accountType: ");
        if (accountTypeESet) result.append(accountType); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelMailConsumerTypeImpl
