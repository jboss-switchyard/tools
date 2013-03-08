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
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Mail Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#isUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#isUnseen <em>Unseen</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#getCopyTo <em>Copy To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl#isDisconnect <em>Disconnect</em>}</li>
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
    protected static final Object INITIAL_DELAY_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "1000");

    /**
     * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected Object initialDelay = INITIAL_DELAY_EDEFAULT;

    /**
     * This is true if the Initial Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialDelayESet;

    /**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected static final Object DELAY_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "60000");

    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected Object delay = DELAY_EDEFAULT;

    /**
     * This is true if the Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean delayESet;

    /**
     * The default value of the '{@link #isUseFixedDelay() <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseFixedDelay()
     * @generated
     * @ordered
     */
    protected static final boolean USE_FIXED_DELAY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseFixedDelay() <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseFixedDelay()
     * @generated
     * @ordered
     */
    protected boolean useFixedDelay = USE_FIXED_DELAY_EDEFAULT;

    /**
     * This is true if the Use Fixed Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useFixedDelayESet;

    /**
     * The default value of the '{@link #isSendEmptyMessageWhenIdle() <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSendEmptyMessageWhenIdle()
     * @generated
     * @ordered
     */
    protected static final boolean SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSendEmptyMessageWhenIdle() <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSendEmptyMessageWhenIdle()
     * @generated
     * @ordered
     */
    protected boolean sendEmptyMessageWhenIdle = SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT;

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
    protected static final TimeUnitType TIME_UNIT_EDEFAULT = TimeUnitType.MILLISECONDS;

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
    protected static final Object MAX_MESSAGES_PER_POLL_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "0");

    /**
     * The cached value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected Object maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;

    /**
     * This is true if the Max Messages Per Poll attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxMessagesPerPollESet;

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
    protected static final Object FETCH_SIZE_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "-1");

    /**
     * The cached value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFetchSize()
     * @generated
     * @ordered
     */
    protected Object fetchSize = FETCH_SIZE_EDEFAULT;

    /**
     * This is true if the Fetch Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fetchSizeESet;

    /**
     * The default value of the '{@link #isUnseen() <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnseen()
     * @generated
     * @ordered
     */
    protected static final boolean UNSEEN_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isUnseen() <em>Unseen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnseen()
     * @generated
     * @ordered
     */
    protected boolean unseen = UNSEEN_EDEFAULT;

    /**
     * This is true if the Unseen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unseenESet;

    /**
     * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDelete()
     * @generated
     * @ordered
     */
    protected static final boolean DELETE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDelete()
     * @generated
     * @ordered
     */
    protected boolean delete = DELETE_EDEFAULT;

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
     * The default value of the '{@link #isDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisconnect()
     * @generated
     * @ordered
     */
    protected static final boolean DISCONNECT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDisconnect() <em>Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisconnect()
     * @generated
     * @ordered
     */
    protected boolean disconnect = DISCONNECT_EDEFAULT;

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
    public Object getInitialDelay() {
        return initialDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialDelay(Object newInitialDelay) {
        Object oldInitialDelay = initialDelay;
        initialDelay = newInitialDelay;
        boolean oldInitialDelayESet = initialDelayESet;
        initialDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, initialDelay, !oldInitialDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInitialDelay() {
        Object oldInitialDelay = initialDelay;
        boolean oldInitialDelayESet = initialDelayESet;
        initialDelay = INITIAL_DELAY_EDEFAULT;
        initialDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, INITIAL_DELAY_EDEFAULT, oldInitialDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInitialDelay() {
        return initialDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(Object newDelay) {
        Object oldDelay = delay;
        delay = newDelay;
        boolean oldDelayESet = delayESet;
        delayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY, oldDelay, delay, !oldDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDelay() {
        Object oldDelay = delay;
        boolean oldDelayESet = delayESet;
        delay = DELAY_EDEFAULT;
        delayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY, oldDelay, DELAY_EDEFAULT, oldDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDelay() {
        return delayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseFixedDelay() {
        return useFixedDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseFixedDelay(boolean newUseFixedDelay) {
        boolean oldUseFixedDelay = useFixedDelay;
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
        boolean oldUseFixedDelay = useFixedDelay;
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
    public boolean isSendEmptyMessageWhenIdle() {
        return sendEmptyMessageWhenIdle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendEmptyMessageWhenIdle(boolean newSendEmptyMessageWhenIdle) {
        boolean oldSendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
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
        boolean oldSendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
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
    public Object getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxMessagesPerPoll(Object newMaxMessagesPerPoll) {
        Object oldMaxMessagesPerPoll = maxMessagesPerPoll;
        maxMessagesPerPoll = newMaxMessagesPerPoll;
        boolean oldMaxMessagesPerPollESet = maxMessagesPerPollESet;
        maxMessagesPerPollESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, maxMessagesPerPoll, !oldMaxMessagesPerPollESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxMessagesPerPoll() {
        Object oldMaxMessagesPerPoll = maxMessagesPerPoll;
        boolean oldMaxMessagesPerPollESet = maxMessagesPerPollESet;
        maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;
        maxMessagesPerPollESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, MAX_MESSAGES_PER_POLL_EDEFAULT, oldMaxMessagesPerPollESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaxMessagesPerPoll() {
        return maxMessagesPerPollESet;
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
    public Object getFetchSize() {
        return fetchSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFetchSize(Object newFetchSize) {
        Object oldFetchSize = fetchSize;
        fetchSize = newFetchSize;
        boolean oldFetchSizeESet = fetchSizeESet;
        fetchSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE, oldFetchSize, fetchSize, !oldFetchSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFetchSize() {
        Object oldFetchSize = fetchSize;
        boolean oldFetchSizeESet = fetchSizeESet;
        fetchSize = FETCH_SIZE_EDEFAULT;
        fetchSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE, oldFetchSize, FETCH_SIZE_EDEFAULT, oldFetchSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFetchSize() {
        return fetchSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUnseen() {
        return unseen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnseen(boolean newUnseen) {
        boolean oldUnseen = unseen;
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
        boolean oldUnseen = unseen;
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
    public boolean isDelete() {
        return delete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelete(boolean newDelete) {
        boolean oldDelete = delete;
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
        boolean oldDelete = delete;
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
    public boolean isDisconnect() {
        return disconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisconnect(boolean newDisconnect) {
        boolean oldDisconnect = disconnect;
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
        boolean oldDisconnect = disconnect;
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
                return isUseFixedDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSendEmptyMessageWhenIdle();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
                return getTimeUnit();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                return getFolderName();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                return getFetchSize();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__UNSEEN:
                return isUnseen();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELETE:
                return isDelete();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__COPY_TO:
                return getCopyTo();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT:
                return isDisconnect();
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
                setInitialDelay(newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                setDelay(newValue);
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
                setMaxMessagesPerPoll(newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                setFolderName((String)newValue);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                setFetchSize(newValue);
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
                unsetInitialDelay();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                unsetDelay();
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
                unsetMaxMessagesPerPoll();
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                setFolderName(FOLDER_NAME_EDEFAULT);
                return;
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                unsetFetchSize();
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
                return isSetInitialDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__DELAY:
                return isSetDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isSetUseFixedDelay();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSetSendEmptyMessageWhenIdle();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT:
                return isSetTimeUnit();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return isSetMaxMessagesPerPoll();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME:
                return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE:
                return isSetFetchSize();
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
        if (initialDelayESet) result.append(initialDelay); else result.append("<unset>");
        result.append(", delay: ");
        if (delayESet) result.append(delay); else result.append("<unset>");
        result.append(", useFixedDelay: ");
        if (useFixedDelayESet) result.append(useFixedDelay); else result.append("<unset>");
        result.append(", sendEmptyMessageWhenIdle: ");
        if (sendEmptyMessageWhenIdleESet) result.append(sendEmptyMessageWhenIdle); else result.append("<unset>");
        result.append(", timeUnit: ");
        if (timeUnitESet) result.append(timeUnit); else result.append("<unset>");
        result.append(", maxMessagesPerPoll: ");
        if (maxMessagesPerPollESet) result.append(maxMessagesPerPoll); else result.append("<unset>");
        result.append(", folderName: ");
        result.append(folderName);
        result.append(", fetchSize: ");
        if (fetchSizeESet) result.append(fetchSize); else result.append("<unset>");
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
