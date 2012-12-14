/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType;

import org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledPollConsumerTypeImpl;

import org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getNoop <em>Noop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getPreMove <em>Pre Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getMove <em>Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getMoveFailed <em>Move Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getIdempotentRepository <em>Idempotent Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getInProgressRepository <em>In Progress Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getSorter <em>Sorter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getReadLockTimeout <em>Read Lock Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getReadLockCheckInterval <em>Read Lock Check Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getProcessStrategy <em>Process Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getDirectoryMustExist <em>Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl#getDoneFileName <em>Done File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileConsumerTypeImpl extends ScheduledPollConsumerTypeImpl implements FileConsumerType {
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
     * The default value of the '{@link #getRecursive() <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecursive()
     * @generated
     * @ordered
     */
    protected static final Boolean RECURSIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecursive() <em>Recursive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecursive()
     * @generated
     * @ordered
     */
    protected Boolean recursive = RECURSIVE_EDEFAULT;

    /**
     * This is true if the Recursive attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean recursiveESet;

    /**
     * The default value of the '{@link #getNoop() <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNoop()
     * @generated
     * @ordered
     */
    protected static final Boolean NOOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNoop() <em>Noop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNoop()
     * @generated
     * @ordered
     */
    protected Boolean noop = NOOP_EDEFAULT;

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
     * This is true if the Include attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean includeESet;

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
     * This is true if the Exclude attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean excludeESet;

    /**
     * The default value of the '{@link #getIdempotent() <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdempotent()
     * @generated
     * @ordered
     */
    protected static final Boolean IDEMPOTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdempotent() <em>Idempotent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdempotent()
     * @generated
     * @ordered
     */
    protected Boolean idempotent = IDEMPOTENT_EDEFAULT;

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
     * This is true if the Idempotent Repository attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idempotentRepositoryESet;

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
     * This is true if the In Progress Repository attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inProgressRepositoryESet;

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
     * This is true if the Filter attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean filterESet;

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
     * This is true if the Sorter attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sorterESet;

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
     * This is true if the Sort By attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sortByESet;

    /**
     * The default value of the '{@link #getReadLock() <em>Read Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLock()
     * @generated
     * @ordered
     */
    protected static final String READ_LOCK_EDEFAULT = null;

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
     * This is true if the Read Lock attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readLockESet;

    /**
     * The default value of the '{@link #getReadLockTimeout() <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockTimeout()
     * @generated
     * @ordered
     */
    protected static final Long READ_LOCK_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadLockTimeout() <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockTimeout()
     * @generated
     * @ordered
     */
    protected Long readLockTimeout = READ_LOCK_TIMEOUT_EDEFAULT;

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
    protected static final BigInteger READ_LOCK_CHECK_INTERVAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadLockCheckInterval() <em>Read Lock Check Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLockCheckInterval()
     * @generated
     * @ordered
     */
    protected BigInteger readLockCheckInterval = READ_LOCK_CHECK_INTERVAL_EDEFAULT;

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
     * This is true if the Exclusive Read Lock Strategy attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean exclusiveReadLockStrategyESet;

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
     * This is true if the Process Strategy attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean processStrategyESet;

    /**
     * The default value of the '{@link #getStartingDirectoryMustExist() <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartingDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected static final Boolean STARTING_DIRECTORY_MUST_EXIST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartingDirectoryMustExist() <em>Starting Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartingDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected Boolean startingDirectoryMustExist = STARTING_DIRECTORY_MUST_EXIST_EDEFAULT;

    /**
     * This is true if the Starting Directory Must Exist attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startingDirectoryMustExistESet;

    /**
     * The default value of the '{@link #getDirectoryMustExist() <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected static final Boolean DIRECTORY_MUST_EXIST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDirectoryMustExist() <em>Directory Must Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectoryMustExist()
     * @generated
     * @ordered
     */
    protected Boolean directoryMustExist = DIRECTORY_MUST_EXIST_EDEFAULT;

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
     * This is true if the Done File Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean doneFileNameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FilePackage.Literals.FILE_CONSUMER_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, maxMessagesPerPoll));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__DELETE, oldDelete, delete, !oldDeleteESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__DELETE, oldDelete, DELETE_EDEFAULT, oldDeleteESet));
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
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRecursive(Boolean newRecursive) {
        Boolean oldRecursive = recursive;
        recursive = newRecursive;
        boolean oldRecursiveESet = recursiveESet;
        recursiveESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__RECURSIVE, oldRecursive, recursive, !oldRecursiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRecursive() {
        Boolean oldRecursive = recursive;
        boolean oldRecursiveESet = recursiveESet;
        recursive = RECURSIVE_EDEFAULT;
        recursiveESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__RECURSIVE, oldRecursive, RECURSIVE_EDEFAULT, oldRecursiveESet));
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
    public Boolean getNoop() {
        return noop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNoop(Boolean newNoop) {
        Boolean oldNoop = noop;
        noop = newNoop;
        boolean oldNoopESet = noopESet;
        noopESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__NOOP, oldNoop, noop, !oldNoopESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNoop() {
        Boolean oldNoop = noop;
        boolean oldNoopESet = noopESet;
        noop = NOOP_EDEFAULT;
        noopESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__NOOP, oldNoop, NOOP_EDEFAULT, oldNoopESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE, oldPreMove, preMove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__MOVE, oldMove, move));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED, oldMoveFailed, moveFailed));
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
        boolean oldIncludeESet = includeESet;
        includeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__INCLUDE, oldInclude, include, !oldIncludeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInclude() {
        String oldInclude = include;
        boolean oldIncludeESet = includeESet;
        include = INCLUDE_EDEFAULT;
        includeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__INCLUDE, oldInclude, INCLUDE_EDEFAULT, oldIncludeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInclude() {
        return includeESet;
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
        boolean oldExcludeESet = excludeESet;
        excludeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__EXCLUDE, oldExclude, exclude, !oldExcludeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExclude() {
        String oldExclude = exclude;
        boolean oldExcludeESet = excludeESet;
        exclude = EXCLUDE_EDEFAULT;
        excludeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__EXCLUDE, oldExclude, EXCLUDE_EDEFAULT, oldExcludeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExclude() {
        return excludeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIdempotent() {
        return idempotent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdempotent(Boolean newIdempotent) {
        Boolean oldIdempotent = idempotent;
        idempotent = newIdempotent;
        boolean oldIdempotentESet = idempotentESet;
        idempotentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT, oldIdempotent, idempotent, !oldIdempotentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIdempotent() {
        Boolean oldIdempotent = idempotent;
        boolean oldIdempotentESet = idempotentESet;
        idempotent = IDEMPOTENT_EDEFAULT;
        idempotentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT, oldIdempotent, IDEMPOTENT_EDEFAULT, oldIdempotentESet));
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
        boolean oldIdempotentRepositoryESet = idempotentRepositoryESet;
        idempotentRepositoryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY, oldIdempotentRepository, idempotentRepository, !oldIdempotentRepositoryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIdempotentRepository() {
        String oldIdempotentRepository = idempotentRepository;
        boolean oldIdempotentRepositoryESet = idempotentRepositoryESet;
        idempotentRepository = IDEMPOTENT_REPOSITORY_EDEFAULT;
        idempotentRepositoryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY, oldIdempotentRepository, IDEMPOTENT_REPOSITORY_EDEFAULT, oldIdempotentRepositoryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIdempotentRepository() {
        return idempotentRepositoryESet;
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
        boolean oldInProgressRepositoryESet = inProgressRepositoryESet;
        inProgressRepositoryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY, oldInProgressRepository, inProgressRepository, !oldInProgressRepositoryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInProgressRepository() {
        String oldInProgressRepository = inProgressRepository;
        boolean oldInProgressRepositoryESet = inProgressRepositoryESet;
        inProgressRepository = IN_PROGRESS_REPOSITORY_EDEFAULT;
        inProgressRepositoryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY, oldInProgressRepository, IN_PROGRESS_REPOSITORY_EDEFAULT, oldInProgressRepositoryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInProgressRepository() {
        return inProgressRepositoryESet;
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
        boolean oldFilterESet = filterESet;
        filterESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__FILTER, oldFilter, filter, !oldFilterESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFilter() {
        String oldFilter = filter;
        boolean oldFilterESet = filterESet;
        filter = FILTER_EDEFAULT;
        filterESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__FILTER, oldFilter, FILTER_EDEFAULT, oldFilterESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFilter() {
        return filterESet;
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
        boolean oldSorterESet = sorterESet;
        sorterESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__SORTER, oldSorter, sorter, !oldSorterESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSorter() {
        String oldSorter = sorter;
        boolean oldSorterESet = sorterESet;
        sorter = SORTER_EDEFAULT;
        sorterESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__SORTER, oldSorter, SORTER_EDEFAULT, oldSorterESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSorter() {
        return sorterESet;
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
        boolean oldSortByESet = sortByESet;
        sortByESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__SORT_BY, oldSortBy, sortBy, !oldSortByESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSortBy() {
        String oldSortBy = sortBy;
        boolean oldSortByESet = sortByESet;
        sortBy = SORT_BY_EDEFAULT;
        sortByESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__SORT_BY, oldSortBy, SORT_BY_EDEFAULT, oldSortByESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSortBy() {
        return sortByESet;
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
        boolean oldReadLockESet = readLockESet;
        readLockESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__READ_LOCK, oldReadLock, readLock, !oldReadLockESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReadLock() {
        String oldReadLock = readLock;
        boolean oldReadLockESet = readLockESet;
        readLock = READ_LOCK_EDEFAULT;
        readLockESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__READ_LOCK, oldReadLock, READ_LOCK_EDEFAULT, oldReadLockESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReadLock() {
        return readLockESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Long getReadLockTimeout() {
        return readLockTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadLockTimeout(Long newReadLockTimeout) {
        Long oldReadLockTimeout = readLockTimeout;
        readLockTimeout = newReadLockTimeout;
        boolean oldReadLockTimeoutESet = readLockTimeoutESet;
        readLockTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT, oldReadLockTimeout, readLockTimeout, !oldReadLockTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReadLockTimeout() {
        Long oldReadLockTimeout = readLockTimeout;
        boolean oldReadLockTimeoutESet = readLockTimeoutESet;
        readLockTimeout = READ_LOCK_TIMEOUT_EDEFAULT;
        readLockTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT, oldReadLockTimeout, READ_LOCK_TIMEOUT_EDEFAULT, oldReadLockTimeoutESet));
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
    public BigInteger getReadLockCheckInterval() {
        return readLockCheckInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadLockCheckInterval(BigInteger newReadLockCheckInterval) {
        BigInteger oldReadLockCheckInterval = readLockCheckInterval;
        readLockCheckInterval = newReadLockCheckInterval;
        boolean oldReadLockCheckIntervalESet = readLockCheckIntervalESet;
        readLockCheckIntervalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL, oldReadLockCheckInterval, readLockCheckInterval, !oldReadLockCheckIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReadLockCheckInterval() {
        BigInteger oldReadLockCheckInterval = readLockCheckInterval;
        boolean oldReadLockCheckIntervalESet = readLockCheckIntervalESet;
        readLockCheckInterval = READ_LOCK_CHECK_INTERVAL_EDEFAULT;
        readLockCheckIntervalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL, oldReadLockCheckInterval, READ_LOCK_CHECK_INTERVAL_EDEFAULT, oldReadLockCheckIntervalESet));
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
        boolean oldExclusiveReadLockStrategyESet = exclusiveReadLockStrategyESet;
        exclusiveReadLockStrategyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY, oldExclusiveReadLockStrategy, exclusiveReadLockStrategy, !oldExclusiveReadLockStrategyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExclusiveReadLockStrategy() {
        String oldExclusiveReadLockStrategy = exclusiveReadLockStrategy;
        boolean oldExclusiveReadLockStrategyESet = exclusiveReadLockStrategyESet;
        exclusiveReadLockStrategy = EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT;
        exclusiveReadLockStrategyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY, oldExclusiveReadLockStrategy, EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT, oldExclusiveReadLockStrategyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExclusiveReadLockStrategy() {
        return exclusiveReadLockStrategyESet;
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
        boolean oldProcessStrategyESet = processStrategyESet;
        processStrategyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY, oldProcessStrategy, processStrategy, !oldProcessStrategyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProcessStrategy() {
        String oldProcessStrategy = processStrategy;
        boolean oldProcessStrategyESet = processStrategyESet;
        processStrategy = PROCESS_STRATEGY_EDEFAULT;
        processStrategyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY, oldProcessStrategy, PROCESS_STRATEGY_EDEFAULT, oldProcessStrategyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProcessStrategy() {
        return processStrategyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getStartingDirectoryMustExist() {
        return startingDirectoryMustExist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartingDirectoryMustExist(Boolean newStartingDirectoryMustExist) {
        Boolean oldStartingDirectoryMustExist = startingDirectoryMustExist;
        startingDirectoryMustExist = newStartingDirectoryMustExist;
        boolean oldStartingDirectoryMustExistESet = startingDirectoryMustExistESet;
        startingDirectoryMustExistESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST, oldStartingDirectoryMustExist, startingDirectoryMustExist, !oldStartingDirectoryMustExistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStartingDirectoryMustExist() {
        Boolean oldStartingDirectoryMustExist = startingDirectoryMustExist;
        boolean oldStartingDirectoryMustExistESet = startingDirectoryMustExistESet;
        startingDirectoryMustExist = STARTING_DIRECTORY_MUST_EXIST_EDEFAULT;
        startingDirectoryMustExistESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST, oldStartingDirectoryMustExist, STARTING_DIRECTORY_MUST_EXIST_EDEFAULT, oldStartingDirectoryMustExistESet));
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
    public Boolean getDirectoryMustExist() {
        return directoryMustExist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirectoryMustExist(Boolean newDirectoryMustExist) {
        Boolean oldDirectoryMustExist = directoryMustExist;
        directoryMustExist = newDirectoryMustExist;
        boolean oldDirectoryMustExistESet = directoryMustExistESet;
        directoryMustExistESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST, oldDirectoryMustExist, directoryMustExist, !oldDirectoryMustExistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDirectoryMustExist() {
        Boolean oldDirectoryMustExist = directoryMustExist;
        boolean oldDirectoryMustExistESet = directoryMustExistESet;
        directoryMustExist = DIRECTORY_MUST_EXIST_EDEFAULT;
        directoryMustExistESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST, oldDirectoryMustExist, DIRECTORY_MUST_EXIST_EDEFAULT, oldDirectoryMustExistESet));
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
        boolean oldDoneFileNameESet = doneFileNameESet;
        doneFileNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME, oldDoneFileName, doneFileName, !oldDoneFileNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDoneFileName() {
        String oldDoneFileName = doneFileName;
        boolean oldDoneFileNameESet = doneFileNameESet;
        doneFileName = DONE_FILE_NAME_EDEFAULT;
        doneFileNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME, oldDoneFileName, DONE_FILE_NAME_EDEFAULT, oldDoneFileNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDoneFileName() {
        return doneFileNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
            case FilePackage.FILE_CONSUMER_TYPE__DELETE:
                return getDelete();
            case FilePackage.FILE_CONSUMER_TYPE__RECURSIVE:
                return getRecursive();
            case FilePackage.FILE_CONSUMER_TYPE__NOOP:
                return getNoop();
            case FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                return getPreMove();
            case FilePackage.FILE_CONSUMER_TYPE__MOVE:
                return getMove();
            case FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                return getMoveFailed();
            case FilePackage.FILE_CONSUMER_TYPE__INCLUDE:
                return getInclude();
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUDE:
                return getExclude();
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                return getIdempotent();
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                return getIdempotentRepository();
            case FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                return getInProgressRepository();
            case FilePackage.FILE_CONSUMER_TYPE__FILTER:
                return getFilter();
            case FilePackage.FILE_CONSUMER_TYPE__SORTER:
                return getSorter();
            case FilePackage.FILE_CONSUMER_TYPE__SORT_BY:
                return getSortBy();
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK:
                return getReadLock();
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                return getReadLockTimeout();
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                return getReadLockCheckInterval();
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                return getExclusiveReadLockStrategy();
            case FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                return getProcessStrategy();
            case FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                return getStartingDirectoryMustExist();
            case FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                return getDirectoryMustExist();
            case FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                return getDoneFileName();
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
            case FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll((Integer)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__RECURSIVE:
                setRecursive((Boolean)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__NOOP:
                setNoop((Boolean)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                setPreMove((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__MOVE:
                setMove((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                setMoveFailed((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__INCLUDE:
                setInclude((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUDE:
                setExclude((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                setIdempotent((Boolean)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                setIdempotentRepository((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                setInProgressRepository((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__FILTER:
                setFilter((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__SORTER:
                setSorter((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__SORT_BY:
                setSortBy((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK:
                setReadLock((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                setReadLockTimeout((Long)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                setReadLockCheckInterval((BigInteger)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                setExclusiveReadLockStrategy((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                setProcessStrategy((String)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                setStartingDirectoryMustExist((Boolean)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                setDirectoryMustExist((Boolean)newValue);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                setDoneFileName((String)newValue);
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
            case FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll(MAX_MESSAGES_PER_POLL_EDEFAULT);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__DELETE:
                unsetDelete();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__RECURSIVE:
                unsetRecursive();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__NOOP:
                unsetNoop();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                setPreMove(PRE_MOVE_EDEFAULT);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__MOVE:
                setMove(MOVE_EDEFAULT);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                setMoveFailed(MOVE_FAILED_EDEFAULT);
                return;
            case FilePackage.FILE_CONSUMER_TYPE__INCLUDE:
                unsetInclude();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUDE:
                unsetExclude();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                unsetIdempotent();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                unsetIdempotentRepository();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                unsetInProgressRepository();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__FILTER:
                unsetFilter();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__SORTER:
                unsetSorter();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__SORT_BY:
                unsetSortBy();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK:
                unsetReadLock();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                unsetReadLockTimeout();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                unsetReadLockCheckInterval();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                unsetExclusiveReadLockStrategy();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                unsetProcessStrategy();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                unsetStartingDirectoryMustExist();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                unsetDirectoryMustExist();
                return;
            case FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                unsetDoneFileName();
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
            case FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return MAX_MESSAGES_PER_POLL_EDEFAULT == null ? maxMessagesPerPoll != null : !MAX_MESSAGES_PER_POLL_EDEFAULT.equals(maxMessagesPerPoll);
            case FilePackage.FILE_CONSUMER_TYPE__DELETE:
                return isSetDelete();
            case FilePackage.FILE_CONSUMER_TYPE__RECURSIVE:
                return isSetRecursive();
            case FilePackage.FILE_CONSUMER_TYPE__NOOP:
                return isSetNoop();
            case FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                return PRE_MOVE_EDEFAULT == null ? preMove != null : !PRE_MOVE_EDEFAULT.equals(preMove);
            case FilePackage.FILE_CONSUMER_TYPE__MOVE:
                return MOVE_EDEFAULT == null ? move != null : !MOVE_EDEFAULT.equals(move);
            case FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                return MOVE_FAILED_EDEFAULT == null ? moveFailed != null : !MOVE_FAILED_EDEFAULT.equals(moveFailed);
            case FilePackage.FILE_CONSUMER_TYPE__INCLUDE:
                return isSetInclude();
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUDE:
                return isSetExclude();
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                return isSetIdempotent();
            case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                return isSetIdempotentRepository();
            case FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                return isSetInProgressRepository();
            case FilePackage.FILE_CONSUMER_TYPE__FILTER:
                return isSetFilter();
            case FilePackage.FILE_CONSUMER_TYPE__SORTER:
                return isSetSorter();
            case FilePackage.FILE_CONSUMER_TYPE__SORT_BY:
                return isSetSortBy();
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK:
                return isSetReadLock();
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                return isSetReadLockTimeout();
            case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                return isSetReadLockCheckInterval();
            case FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                return isSetExclusiveReadLockStrategy();
            case FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                return isSetProcessStrategy();
            case FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                return isSetStartingDirectoryMustExist();
            case FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                return isSetDirectoryMustExist();
            case FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                return isSetDoneFileName();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == ScheduledBatchPollConsumerType.class) {
            switch (derivedFeatureID) {
                case FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL: return CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;
                default: return -1;
            }
        }
        if (baseClass == GenericFileConsumerType.class) {
            switch (derivedFeatureID) {
                case FilePackage.FILE_CONSUMER_TYPE__DELETE: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DELETE;
                case FilePackage.FILE_CONSUMER_TYPE__RECURSIVE: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__RECURSIVE;
                case FilePackage.FILE_CONSUMER_TYPE__NOOP: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__NOOP;
                case FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE;
                case FilePackage.FILE_CONSUMER_TYPE__MOVE: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE;
                case FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED;
                case FilePackage.FILE_CONSUMER_TYPE__INCLUDE: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__INCLUDE;
                case FilePackage.FILE_CONSUMER_TYPE__EXCLUDE: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUDE;
                case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT;
                case FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY;
                case FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY;
                case FilePackage.FILE_CONSUMER_TYPE__FILTER: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__FILTER;
                case FilePackage.FILE_CONSUMER_TYPE__SORTER: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORTER;
                case FilePackage.FILE_CONSUMER_TYPE__SORT_BY: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORT_BY;
                case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK;
                case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT;
                case FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL;
                case FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY;
                case FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY;
                case FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST;
                case FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST;
                case FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME: return CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ScheduledBatchPollConsumerType.class) {
            switch (baseFeatureID) {
                case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL: return FilePackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;
                default: return -1;
            }
        }
        if (baseClass == GenericFileConsumerType.class) {
            switch (baseFeatureID) {
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DELETE: return FilePackage.FILE_CONSUMER_TYPE__DELETE;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__RECURSIVE: return FilePackage.FILE_CONSUMER_TYPE__RECURSIVE;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__NOOP: return FilePackage.FILE_CONSUMER_TYPE__NOOP;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE: return FilePackage.FILE_CONSUMER_TYPE__PRE_MOVE;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE: return FilePackage.FILE_CONSUMER_TYPE__MOVE;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED: return FilePackage.FILE_CONSUMER_TYPE__MOVE_FAILED;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__INCLUDE: return FilePackage.FILE_CONSUMER_TYPE__INCLUDE;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUDE: return FilePackage.FILE_CONSUMER_TYPE__EXCLUDE;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT: return FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY: return FilePackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY: return FilePackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__FILTER: return FilePackage.FILE_CONSUMER_TYPE__FILTER;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORTER: return FilePackage.FILE_CONSUMER_TYPE__SORTER;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORT_BY: return FilePackage.FILE_CONSUMER_TYPE__SORT_BY;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK: return FilePackage.FILE_CONSUMER_TYPE__READ_LOCK;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT: return FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL: return FilePackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY: return FilePackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY: return FilePackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST: return FilePackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST: return FilePackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST;
                case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME: return FilePackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (maxMessagesPerPoll: ");
        result.append(maxMessagesPerPoll);
        result.append(", delete: ");
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
        if (includeESet) result.append(include); else result.append("<unset>");
        result.append(", exclude: ");
        if (excludeESet) result.append(exclude); else result.append("<unset>");
        result.append(", idempotent: ");
        if (idempotentESet) result.append(idempotent); else result.append("<unset>");
        result.append(", idempotentRepository: ");
        if (idempotentRepositoryESet) result.append(idempotentRepository); else result.append("<unset>");
        result.append(", inProgressRepository: ");
        if (inProgressRepositoryESet) result.append(inProgressRepository); else result.append("<unset>");
        result.append(", filter: ");
        if (filterESet) result.append(filter); else result.append("<unset>");
        result.append(", sorter: ");
        if (sorterESet) result.append(sorter); else result.append("<unset>");
        result.append(", sortBy: ");
        if (sortByESet) result.append(sortBy); else result.append("<unset>");
        result.append(", readLock: ");
        if (readLockESet) result.append(readLock); else result.append("<unset>");
        result.append(", readLockTimeout: ");
        if (readLockTimeoutESet) result.append(readLockTimeout); else result.append("<unset>");
        result.append(", readLockCheckInterval: ");
        if (readLockCheckIntervalESet) result.append(readLockCheckInterval); else result.append("<unset>");
        result.append(", exclusiveReadLockStrategy: ");
        if (exclusiveReadLockStrategyESet) result.append(exclusiveReadLockStrategy); else result.append("<unset>");
        result.append(", processStrategy: ");
        if (processStrategyESet) result.append(processStrategy); else result.append("<unset>");
        result.append(", startingDirectoryMustExist: ");
        if (startingDirectoryMustExistESet) result.append(startingDirectoryMustExist); else result.append("<unset>");
        result.append(", directoryMustExist: ");
        if (directoryMustExistESet) result.append(directoryMustExist); else result.append("<unset>");
        result.append(", doneFileName: ");
        if (doneFileNameESet) result.append(doneFileName); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //FileConsumerTypeImpl
