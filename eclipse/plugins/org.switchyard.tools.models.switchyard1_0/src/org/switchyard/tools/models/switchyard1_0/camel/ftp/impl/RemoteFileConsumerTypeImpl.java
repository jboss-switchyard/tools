/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote File Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isNoop <em>Noop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getPreMove <em>Pre Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getMove <em>Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getMoveFailed <em>Move Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getIdempotentRepository <em>Idempotent Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getInProgressRepository <em>In Progress Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getSorter <em>Sorter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getReadLockTimeout <em>Read Lock Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getReadLockCheckInterval <em>Read Lock Check Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getProcessStrategy <em>Process Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isDirectoryMustExist <em>Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getDoneFileName <em>Done File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteFileConsumerTypeImpl extends EObjectImpl implements RemoteFileConsumerType {
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
     * The default value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRecursive()
     * @generated
     * @ordered
     */
    protected static final boolean RECURSIVE_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRecursive()
     * @generated
     * @ordered
     */
    protected boolean recursive = RECURSIVE_EDEFAULT;
    /**
     * This is true if the Recursive attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean recursiveESet;
    /**
     * The default value of the '{@link #isNoop() <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNoop()
     * @generated
     * @ordered
     */
    protected static final boolean NOOP_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isNoop() <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNoop()
     * @generated
     * @ordered
     */
    protected boolean noop = NOOP_EDEFAULT;
    /**
     * This is true if the Noop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean noopESet;
    /**
     * The default value of the '{@link #getPreMove() <em>Pre Move</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreMove()
     * @generated
     * @ordered
     */
    protected static final String PRE_MOVE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getPreMove() <em>Pre Move</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreMove()
     * @generated
     * @ordered
     */
    protected String preMove = PRE_MOVE_EDEFAULT;
    /**
     * The default value of the '{@link #getMove() <em>Move</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMove()
     * @generated
     * @ordered
     */
    protected static final String MOVE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getMove() <em>Move</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMove()
     * @generated
     * @ordered
     */
    protected String move = MOVE_EDEFAULT;
    /**
     * The default value of the '{@link #getMoveFailed() <em>Move Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMoveFailed()
     * @generated
     * @ordered
     */
    protected static final String MOVE_FAILED_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getMoveFailed() <em>Move Failed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMoveFailed()
     * @generated
     * @ordered
     */
    protected String moveFailed = MOVE_FAILED_EDEFAULT;
    /**
     * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInclude()
     * @generated
     * @ordered
     */
    protected static final String INCLUDE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInclude()
     * @generated
     * @ordered
     */
    protected String include = INCLUDE_EDEFAULT;
    /**
     * The default value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExclude()
     * @generated
     * @ordered
     */
    protected static final String EXCLUDE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExclude()
     * @generated
     * @ordered
     */
    protected String exclude = EXCLUDE_EDEFAULT;
    /**
     * The default value of the '{@link #isIdempotent() <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdempotent()
     * @generated
     * @ordered
     */
    protected static final boolean IDEMPOTENT_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isIdempotent() <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdempotent()
     * @generated
     * @ordered
     */
    protected boolean idempotent = IDEMPOTENT_EDEFAULT;
    /**
     * This is true if the Idempotent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idempotentESet;
    /**
     * The default value of the '{@link #getIdempotentRepository() <em>Idempotent Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdempotentRepository()
     * @generated
     * @ordered
     */
    protected static final String IDEMPOTENT_REPOSITORY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getIdempotentRepository() <em>Idempotent Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdempotentRepository()
     * @generated
     * @ordered
     */
    protected String idempotentRepository = IDEMPOTENT_REPOSITORY_EDEFAULT;
    /**
     * The default value of the '{@link #getInProgressRepository() <em>In Progress Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInProgressRepository()
     * @generated
     * @ordered
     */
    protected static final String IN_PROGRESS_REPOSITORY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getInProgressRepository() <em>In Progress Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInProgressRepository()
     * @generated
     * @ordered
     */
    protected String inProgressRepository = IN_PROGRESS_REPOSITORY_EDEFAULT;
    /**
     * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilter()
     * @generated
     * @ordered
     */
    protected static final String FILTER_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilter()
     * @generated
     * @ordered
     */
    protected String filter = FILTER_EDEFAULT;
    /**
     * The default value of the '{@link #getSorter() <em>Sorter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSorter()
     * @generated
     * @ordered
     */
    protected static final String SORTER_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSorter() <em>Sorter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSorter()
     * @generated
     * @ordered
     */
    protected String sorter = SORTER_EDEFAULT;
    /**
     * The default value of the '{@link #getSortBy() <em>Sort By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSortBy()
     * @generated
     * @ordered
     */
    protected static final String SORT_BY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSortBy() <em>Sort By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSortBy()
     * @generated
     * @ordered
     */
    protected String sortBy = SORT_BY_EDEFAULT;
    /**
     * The default value of the '{@link #getReadLock() <em>Read Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLock()
     * @generated
     * @ordered
     */
    protected static final String READ_LOCK_EDEFAULT = "";
    /**
     * The cached value of the '{@link #getReadLock() <em>Read Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLock()
     * @generated
     * @ordered
     */
    protected String readLock = READ_LOCK_EDEFAULT;
    /**
     * The default value of the '{@link #getReadLockTimeout() <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockTimeout()
     * @generated
     * @ordered
     */
    protected static final long READ_LOCK_TIMEOUT_EDEFAULT = 10000L;
    /**
     * The cached value of the '{@link #getReadLockTimeout() <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockTimeout()
     * @generated
     * @ordered
     */
    protected long readLockTimeout = READ_LOCK_TIMEOUT_EDEFAULT;
    /**
     * This is true if the Read Lock Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readLockTimeoutESet;
    /**
     * The default value of the '{@link #getReadLockCheckInterval() <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockCheckInterval()
     * @generated
     * @ordered
     */
    protected static final int READ_LOCK_CHECK_INTERVAL_EDEFAULT = 1000;
    /**
     * The cached value of the '{@link #getReadLockCheckInterval() <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockCheckInterval()
     * @generated
     * @ordered
     */
    protected int readLockCheckInterval = READ_LOCK_CHECK_INTERVAL_EDEFAULT;
    /**
     * This is true if the Read Lock Check Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readLockCheckIntervalESet;
    /**
     * The default value of the '{@link #getExclusiveReadLockStrategy() <em>Exclusive Read Lock Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExclusiveReadLockStrategy()
     * @generated
     * @ordered
     */
    protected static final String EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getExclusiveReadLockStrategy() <em>Exclusive Read Lock Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExclusiveReadLockStrategy()
     * @generated
     * @ordered
     */
    protected String exclusiveReadLockStrategy = EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT;
    /**
     * The default value of the '{@link #getProcessStrategy() <em>Process Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessStrategy()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_STRATEGY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getProcessStrategy() <em>Process Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessStrategy()
     * @generated
     * @ordered
     */
    protected String processStrategy = PROCESS_STRATEGY_EDEFAULT;
    /**
     * The default value of the '{@link #isStartingDirectoryMustExist() <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStartingDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected static final boolean STARTING_DIRECTORY_MUST_EXIST_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isStartingDirectoryMustExist() <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStartingDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected boolean startingDirectoryMustExist = STARTING_DIRECTORY_MUST_EXIST_EDEFAULT;
    /**
     * This is true if the Starting Directory Must Exist attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startingDirectoryMustExistESet;
    /**
     * The default value of the '{@link #isDirectoryMustExist() <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected static final boolean DIRECTORY_MUST_EXIST_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isDirectoryMustExist() <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected boolean directoryMustExist = DIRECTORY_MUST_EXIST_EDEFAULT;
    /**
     * This is true if the Directory Must Exist attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directoryMustExistESet;
    /**
     * The default value of the '{@link #getDoneFileName() <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoneFileName()
     * @generated
     * @ordered
     */
    protected static final String DONE_FILE_NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDoneFileName() <em>Done File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoneFileName()
     * @generated
     * @ordered
     */
    protected String doneFileName = DONE_FILE_NAME_EDEFAULT;
    /**
     * The default value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected static final int MAX_MESSAGES_PER_POLL_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected int maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;
    /**
     * This is true if the Max Messages Per Poll attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxMessagesPerPollESet;
    /**
     * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected static final int INITIAL_DELAY_EDEFAULT = 1000;
    /**
     * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected int initialDelay = INITIAL_DELAY_EDEFAULT;
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
    protected static final int DELAY_EDEFAULT = 500;
    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected int delay = DELAY_EDEFAULT;
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
    protected static final boolean USE_FIXED_DELAY_EDEFAULT = true;
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteFileConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE, oldDelete, delete, !oldDeleteESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE, oldDelete, DELETE_EDEFAULT, oldDeleteESet));
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
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRecursive(boolean newRecursive) {
        boolean oldRecursive = recursive;
        recursive = newRecursive;
        boolean oldRecursiveESet = recursiveESet;
        recursiveESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE, oldRecursive, recursive, !oldRecursiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRecursive() {
        boolean oldRecursive = recursive;
        boolean oldRecursiveESet = recursiveESet;
        recursive = RECURSIVE_EDEFAULT;
        recursiveESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE, oldRecursive, RECURSIVE_EDEFAULT, oldRecursiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRecursive() {
        return recursiveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNoop() {
        return noop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNoop(boolean newNoop) {
        boolean oldNoop = noop;
        noop = newNoop;
        boolean oldNoopESet = noopESet;
        noopESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP, oldNoop, noop, !oldNoopESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNoop() {
        boolean oldNoop = noop;
        boolean oldNoopESet = noopESet;
        noop = NOOP_EDEFAULT;
        noopESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP, oldNoop, NOOP_EDEFAULT, oldNoopESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNoop() {
        return noopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPreMove() {
        return preMove;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreMove(String newPreMove) {
        String oldPreMove = preMove;
        preMove = newPreMove;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE, oldPreMove, preMove));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMove() {
        return move;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMove(String newMove) {
        String oldMove = move;
        move = newMove;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE, oldMove, move));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMoveFailed() {
        return moveFailed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMoveFailed(String newMoveFailed) {
        String oldMoveFailed = moveFailed;
        moveFailed = newMoveFailed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED, oldMoveFailed, moveFailed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInclude() {
        return include;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInclude(String newInclude) {
        String oldInclude = include;
        include = newInclude;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INCLUDE, oldInclude, include));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExclude() {
        return exclude;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExclude(String newExclude) {
        String oldExclude = exclude;
        exclude = newExclude;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE, oldExclude, exclude));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIdempotent() {
        return idempotent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdempotent(boolean newIdempotent) {
        boolean oldIdempotent = idempotent;
        idempotent = newIdempotent;
        boolean oldIdempotentESet = idempotentESet;
        idempotentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT, oldIdempotent, idempotent, !oldIdempotentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIdempotent() {
        boolean oldIdempotent = idempotent;
        boolean oldIdempotentESet = idempotentESet;
        idempotent = IDEMPOTENT_EDEFAULT;
        idempotentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT, oldIdempotent, IDEMPOTENT_EDEFAULT, oldIdempotentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIdempotent() {
        return idempotentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdempotentRepository() {
        return idempotentRepository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdempotentRepository(String newIdempotentRepository) {
        String oldIdempotentRepository = idempotentRepository;
        idempotentRepository = newIdempotentRepository;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY, oldIdempotentRepository, idempotentRepository));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInProgressRepository() {
        return inProgressRepository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInProgressRepository(String newInProgressRepository) {
        String oldInProgressRepository = inProgressRepository;
        inProgressRepository = newInProgressRepository;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY, oldInProgressRepository, inProgressRepository));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFilter() {
        return filter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilter(String newFilter) {
        String oldFilter = filter;
        filter = newFilter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__FILTER, oldFilter, filter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSorter() {
        return sorter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSorter(String newSorter) {
        String oldSorter = sorter;
        sorter = newSorter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORTER, oldSorter, sorter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSortBy(String newSortBy) {
        String oldSortBy = sortBy;
        sortBy = newSortBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORT_BY, oldSortBy, sortBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReadLock() {
        return readLock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadLock(String newReadLock) {
        String oldReadLock = readLock;
        readLock = newReadLock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK, oldReadLock, readLock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getReadLockTimeout() {
        return readLockTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadLockTimeout(long newReadLockTimeout) {
        long oldReadLockTimeout = readLockTimeout;
        readLockTimeout = newReadLockTimeout;
        boolean oldReadLockTimeoutESet = readLockTimeoutESet;
        readLockTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT, oldReadLockTimeout, readLockTimeout, !oldReadLockTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReadLockTimeout() {
        long oldReadLockTimeout = readLockTimeout;
        boolean oldReadLockTimeoutESet = readLockTimeoutESet;
        readLockTimeout = READ_LOCK_TIMEOUT_EDEFAULT;
        readLockTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT, oldReadLockTimeout, READ_LOCK_TIMEOUT_EDEFAULT, oldReadLockTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReadLockTimeout() {
        return readLockTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReadLockCheckInterval() {
        return readLockCheckInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadLockCheckInterval(int newReadLockCheckInterval) {
        int oldReadLockCheckInterval = readLockCheckInterval;
        readLockCheckInterval = newReadLockCheckInterval;
        boolean oldReadLockCheckIntervalESet = readLockCheckIntervalESet;
        readLockCheckIntervalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL, oldReadLockCheckInterval, readLockCheckInterval, !oldReadLockCheckIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReadLockCheckInterval() {
        int oldReadLockCheckInterval = readLockCheckInterval;
        boolean oldReadLockCheckIntervalESet = readLockCheckIntervalESet;
        readLockCheckInterval = READ_LOCK_CHECK_INTERVAL_EDEFAULT;
        readLockCheckIntervalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL, oldReadLockCheckInterval, READ_LOCK_CHECK_INTERVAL_EDEFAULT, oldReadLockCheckIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReadLockCheckInterval() {
        return readLockCheckIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExclusiveReadLockStrategy() {
        return exclusiveReadLockStrategy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExclusiveReadLockStrategy(String newExclusiveReadLockStrategy) {
        String oldExclusiveReadLockStrategy = exclusiveReadLockStrategy;
        exclusiveReadLockStrategy = newExclusiveReadLockStrategy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY, oldExclusiveReadLockStrategy, exclusiveReadLockStrategy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProcessStrategy() {
        return processStrategy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessStrategy(String newProcessStrategy) {
        String oldProcessStrategy = processStrategy;
        processStrategy = newProcessStrategy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY, oldProcessStrategy, processStrategy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStartingDirectoryMustExist() {
        return startingDirectoryMustExist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartingDirectoryMustExist(boolean newStartingDirectoryMustExist) {
        boolean oldStartingDirectoryMustExist = startingDirectoryMustExist;
        startingDirectoryMustExist = newStartingDirectoryMustExist;
        boolean oldStartingDirectoryMustExistESet = startingDirectoryMustExistESet;
        startingDirectoryMustExistESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST, oldStartingDirectoryMustExist, startingDirectoryMustExist, !oldStartingDirectoryMustExistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStartingDirectoryMustExist() {
        boolean oldStartingDirectoryMustExist = startingDirectoryMustExist;
        boolean oldStartingDirectoryMustExistESet = startingDirectoryMustExistESet;
        startingDirectoryMustExist = STARTING_DIRECTORY_MUST_EXIST_EDEFAULT;
        startingDirectoryMustExistESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST, oldStartingDirectoryMustExist, STARTING_DIRECTORY_MUST_EXIST_EDEFAULT, oldStartingDirectoryMustExistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStartingDirectoryMustExist() {
        return startingDirectoryMustExistESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDirectoryMustExist() {
        return directoryMustExist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirectoryMustExist(boolean newDirectoryMustExist) {
        boolean oldDirectoryMustExist = directoryMustExist;
        directoryMustExist = newDirectoryMustExist;
        boolean oldDirectoryMustExistESet = directoryMustExistESet;
        directoryMustExistESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST, oldDirectoryMustExist, directoryMustExist, !oldDirectoryMustExistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDirectoryMustExist() {
        boolean oldDirectoryMustExist = directoryMustExist;
        boolean oldDirectoryMustExistESet = directoryMustExistESet;
        directoryMustExist = DIRECTORY_MUST_EXIST_EDEFAULT;
        directoryMustExistESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST, oldDirectoryMustExist, DIRECTORY_MUST_EXIST_EDEFAULT, oldDirectoryMustExistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDirectoryMustExist() {
        return directoryMustExistESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDoneFileName() {
        return doneFileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDoneFileName(String newDoneFileName) {
        String oldDoneFileName = doneFileName;
        doneFileName = newDoneFileName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME, oldDoneFileName, doneFileName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxMessagesPerPoll(int newMaxMessagesPerPoll) {
        int oldMaxMessagesPerPoll = maxMessagesPerPoll;
        maxMessagesPerPoll = newMaxMessagesPerPoll;
        boolean oldMaxMessagesPerPollESet = maxMessagesPerPollESet;
        maxMessagesPerPollESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, maxMessagesPerPoll, !oldMaxMessagesPerPollESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxMessagesPerPoll() {
        int oldMaxMessagesPerPoll = maxMessagesPerPoll;
        boolean oldMaxMessagesPerPollESet = maxMessagesPerPollESet;
        maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;
        maxMessagesPerPollESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, MAX_MESSAGES_PER_POLL_EDEFAULT, oldMaxMessagesPerPollESet));
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
    public int getInitialDelay() {
        return initialDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialDelay(int newInitialDelay) {
        int oldInitialDelay = initialDelay;
        initialDelay = newInitialDelay;
        boolean oldInitialDelayESet = initialDelayESet;
        initialDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, initialDelay, !oldInitialDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInitialDelay() {
        int oldInitialDelay = initialDelay;
        boolean oldInitialDelayESet = initialDelayESet;
        initialDelay = INITIAL_DELAY_EDEFAULT;
        initialDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, INITIAL_DELAY_EDEFAULT, oldInitialDelayESet));
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
    public int getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(int newDelay) {
        int oldDelay = delay;
        delay = newDelay;
        boolean oldDelayESet = delayESet;
        delayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY, oldDelay, delay, !oldDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDelay() {
        int oldDelay = delay;
        boolean oldDelayESet = delayESet;
        delay = DELAY_EDEFAULT;
        delayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY, oldDelay, DELAY_EDEFAULT, oldDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, useFixedDelay, !oldUseFixedDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, USE_FIXED_DELAY_EDEFAULT, oldUseFixedDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, oldSendEmptyMessageWhenIdle, sendEmptyMessageWhenIdle, !oldSendEmptyMessageWhenIdleESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, oldSendEmptyMessageWhenIdle, SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT, oldSendEmptyMessageWhenIdleESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT, oldTimeUnit, timeUnit, !oldTimeUnitESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT, oldTimeUnit, TIME_UNIT_EDEFAULT, oldTimeUnitESet));
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE:
                return isDelete();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE:
                return isRecursive();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP:
                return isNoop();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE:
                return getPreMove();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE:
                return getMove();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED:
                return getMoveFailed();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INCLUDE:
                return getInclude();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE:
                return getExclude();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT:
                return isIdempotent();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                return getIdempotentRepository();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                return getInProgressRepository();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__FILTER:
                return getFilter();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORTER:
                return getSorter();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORT_BY:
                return getSortBy();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK:
                return getReadLock();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                return getReadLockTimeout();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                return getReadLockCheckInterval();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                return getExclusiveReadLockStrategy();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                return getProcessStrategy();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                return isStartingDirectoryMustExist();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                return isDirectoryMustExist();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                return getDoneFileName();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY:
                return getInitialDelay();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY:
                return getDelay();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isUseFixedDelay();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSendEmptyMessageWhenIdle();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT:
                return getTimeUnit();
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
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE:
                setRecursive((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP:
                setNoop((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE:
                setPreMove((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE:
                setMove((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED:
                setMoveFailed((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INCLUDE:
                setInclude((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE:
                setExclude((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT:
                setIdempotent((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                setIdempotentRepository((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                setInProgressRepository((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__FILTER:
                setFilter((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORTER:
                setSorter((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORT_BY:
                setSortBy((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK:
                setReadLock((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                setReadLockTimeout((Long)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                setReadLockCheckInterval((Integer)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                setExclusiveReadLockStrategy((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                setProcessStrategy((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                setStartingDirectoryMustExist((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                setDirectoryMustExist((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                setDoneFileName((String)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll((Integer)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay((Integer)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY:
                setDelay((Integer)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                setUseFixedDelay((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                setSendEmptyMessageWhenIdle((Boolean)newValue);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT:
                setTimeUnit((TimeUnitType)newValue);
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
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE:
                unsetDelete();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE:
                unsetRecursive();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP:
                unsetNoop();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE:
                setPreMove(PRE_MOVE_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE:
                setMove(MOVE_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED:
                setMoveFailed(MOVE_FAILED_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INCLUDE:
                setInclude(INCLUDE_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE:
                setExclude(EXCLUDE_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT:
                unsetIdempotent();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                setIdempotentRepository(IDEMPOTENT_REPOSITORY_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                setInProgressRepository(IN_PROGRESS_REPOSITORY_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__FILTER:
                setFilter(FILTER_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORTER:
                setSorter(SORTER_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORT_BY:
                setSortBy(SORT_BY_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK:
                setReadLock(READ_LOCK_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                unsetReadLockTimeout();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                unsetReadLockCheckInterval();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                setExclusiveReadLockStrategy(EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                setProcessStrategy(PROCESS_STRATEGY_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                unsetStartingDirectoryMustExist();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                unsetDirectoryMustExist();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                setDoneFileName(DONE_FILE_NAME_EDEFAULT);
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                unsetMaxMessagesPerPoll();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY:
                unsetInitialDelay();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY:
                unsetDelay();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                unsetUseFixedDelay();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                unsetSendEmptyMessageWhenIdle();
                return;
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT:
                unsetTimeUnit();
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
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE:
                return isSetDelete();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE:
                return isSetRecursive();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP:
                return isSetNoop();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE:
                return PRE_MOVE_EDEFAULT == null ? preMove != null : !PRE_MOVE_EDEFAULT.equals(preMove);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE:
                return MOVE_EDEFAULT == null ? move != null : !MOVE_EDEFAULT.equals(move);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED:
                return MOVE_FAILED_EDEFAULT == null ? moveFailed != null : !MOVE_FAILED_EDEFAULT.equals(moveFailed);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INCLUDE:
                return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE:
                return EXCLUDE_EDEFAULT == null ? exclude != null : !EXCLUDE_EDEFAULT.equals(exclude);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT:
                return isSetIdempotent();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                return IDEMPOTENT_REPOSITORY_EDEFAULT == null ? idempotentRepository != null : !IDEMPOTENT_REPOSITORY_EDEFAULT.equals(idempotentRepository);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                return IN_PROGRESS_REPOSITORY_EDEFAULT == null ? inProgressRepository != null : !IN_PROGRESS_REPOSITORY_EDEFAULT.equals(inProgressRepository);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__FILTER:
                return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORTER:
                return SORTER_EDEFAULT == null ? sorter != null : !SORTER_EDEFAULT.equals(sorter);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORT_BY:
                return SORT_BY_EDEFAULT == null ? sortBy != null : !SORT_BY_EDEFAULT.equals(sortBy);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK:
                return READ_LOCK_EDEFAULT == null ? readLock != null : !READ_LOCK_EDEFAULT.equals(readLock);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                return isSetReadLockTimeout();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                return isSetReadLockCheckInterval();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                return EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT == null ? exclusiveReadLockStrategy != null : !EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT.equals(exclusiveReadLockStrategy);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                return PROCESS_STRATEGY_EDEFAULT == null ? processStrategy != null : !PROCESS_STRATEGY_EDEFAULT.equals(processStrategy);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                return isSetStartingDirectoryMustExist();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                return isSetDirectoryMustExist();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                return DONE_FILE_NAME_EDEFAULT == null ? doneFileName != null : !DONE_FILE_NAME_EDEFAULT.equals(doneFileName);
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return isSetMaxMessagesPerPoll();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY:
                return isSetInitialDelay();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY:
                return isSetDelay();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isSetUseFixedDelay();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSetSendEmptyMessageWhenIdle();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT:
                return isSetTimeUnit();
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
        result.append(" (delete: ");
        if (deleteESet) result.append(delete); else result.append("<unset>");
        result.append(", recursive: ");
        if (recursiveESet) result.append(recursive); else result.append("<unset>");
        result.append(", noop: ");
        if (noopESet) result.append(noop); else result.append("<unset>");
        result.append(", preMove: ");
        result.append(preMove);
        result.append(", move: ");
        result.append(move);
        result.append(", moveFailed: ");
        result.append(moveFailed);
        result.append(", include: ");
        result.append(include);
        result.append(", exclude: ");
        result.append(exclude);
        result.append(", idempotent: ");
        if (idempotentESet) result.append(idempotent); else result.append("<unset>");
        result.append(", idempotentRepository: ");
        result.append(idempotentRepository);
        result.append(", inProgressRepository: ");
        result.append(inProgressRepository);
        result.append(", filter: ");
        result.append(filter);
        result.append(", sorter: ");
        result.append(sorter);
        result.append(", sortBy: ");
        result.append(sortBy);
        result.append(", readLock: ");
        result.append(readLock);
        result.append(", readLockTimeout: ");
        if (readLockTimeoutESet) result.append(readLockTimeout); else result.append("<unset>");
        result.append(", readLockCheckInterval: ");
        if (readLockCheckIntervalESet) result.append(readLockCheckInterval); else result.append("<unset>");
        result.append(", exclusiveReadLockStrategy: ");
        result.append(exclusiveReadLockStrategy);
        result.append(", processStrategy: ");
        result.append(processStrategy);
        result.append(", startingDirectoryMustExist: ");
        if (startingDirectoryMustExistESet) result.append(startingDirectoryMustExist); else result.append("<unset>");
        result.append(", directoryMustExist: ");
        if (directoryMustExistESet) result.append(directoryMustExist); else result.append("<unset>");
        result.append(", doneFileName: ");
        result.append(doneFileName);
        result.append(", maxMessagesPerPoll: ");
        if (maxMessagesPerPollESet) result.append(maxMessagesPerPoll); else result.append("<unset>");
        result.append(", initialDelay: ");
        if (initialDelayESet) result.append(initialDelay); else result.append("<unset>");
        result.append(", delay: ");
        if (delayESet) result.append(delay); else result.append("<unset>");
        result.append(", useFixedDelay: ");
        if (useFixedDelayESet) result.append(useFixedDelay); else result.append("<unset>");
        result.append(", sendEmptyMessageWhenIdle: ");
        if (sendEmptyMessageWhenIdleESet) result.append(sendEmptyMessageWhenIdle); else result.append("<unset>");
        result.append(", timeUnit: ");
        if (timeUnitESet) result.append(timeUnit); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //RemoteFileConsumerTypeImpl
