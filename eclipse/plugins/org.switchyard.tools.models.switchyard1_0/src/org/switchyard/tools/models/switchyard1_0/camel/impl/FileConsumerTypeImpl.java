/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isNoop <em>Noop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getPreMove <em>Pre Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getMove <em>Move</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getMoveFailed <em>Move Failed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getIdempotentRepository <em>Idempotent Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getInProgressRepository <em>In Progress Repository</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getSorter <em>Sorter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getReadLock <em>Read Lock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getReadLockTimeout <em>Read Lock Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getReadLockCheckInterval <em>Read Lock Check Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getProcessStrategy <em>Process Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#isDirectoryMustExist <em>Directory Must Exist</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl#getDoneFileName <em>Done File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileConsumerTypeImpl extends EObjectImpl implements FileConsumerType {
	/**
     * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
	protected static final BigInteger INITIAL_DELAY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
	protected BigInteger initialDelay = INITIAL_DELAY_EDEFAULT;

	/**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected static final BigInteger DELAY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected BigInteger delay = DELAY_EDEFAULT;

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
     * The default value of the '{@link #getReadLockTimeout() <em>Read Lock Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReadLockTimeout()
     * @generated
     * @ordered
     */
	protected static final long READ_LOCK_TIMEOUT_EDEFAULT = 0L;

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
     * The default value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
	protected static final BigInteger MAX_MESSAGES_PER_POLL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
	protected BigInteger maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;

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
        return CamelPackage.Literals.FILE_CONSUMER_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BigInteger getInitialDelay() {
        return initialDelay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInitialDelay(BigInteger newInitialDelay) {
        BigInteger oldInitialDelay = initialDelay;
        initialDelay = newInitialDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, initialDelay));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BigInteger getDelay() {
        return delay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDelay(BigInteger newDelay) {
        BigInteger oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__DELAY, oldDelay, delay));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, useFixedDelay, !oldUseFixedDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, USE_FIXED_DELAY_EDEFAULT, oldUseFixedDelayESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__RECURSIVE, oldRecursive, recursive, !oldRecursiveESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__RECURSIVE, oldRecursive, RECURSIVE_EDEFAULT, oldRecursiveESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__DELETE, oldDelete, delete, !oldDeleteESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__DELETE, oldDelete, DELETE_EDEFAULT, oldDeleteESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__NOOP, oldNoop, noop, !oldNoopESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__NOOP, oldNoop, NOOP_EDEFAULT, oldNoopESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__PRE_MOVE, oldPreMove, preMove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__MOVE, oldMove, move));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__MOVE_FAILED, oldMoveFailed, moveFailed));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__INCLUDE, oldInclude, include));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__EXCLUDE, oldExclude, exclude));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT, oldIdempotent, idempotent, !oldIdempotentESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT, oldIdempotent, IDEMPOTENT_EDEFAULT, oldIdempotentESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY, oldIdempotentRepository, idempotentRepository));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY, oldInProgressRepository, inProgressRepository));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__FILTER, oldFilter, filter));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__SORTER, oldSorter, sorter));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__SORT_BY, oldSortBy, sortBy));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK, oldReadLock, readLock));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT, oldReadLockTimeout, readLockTimeout, !oldReadLockTimeoutESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT, oldReadLockTimeout, READ_LOCK_TIMEOUT_EDEFAULT, oldReadLockTimeoutESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL, oldReadLockCheckInterval, readLockCheckInterval));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY, oldExclusiveReadLockStrategy, exclusiveReadLockStrategy));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY, oldProcessStrategy, processStrategy));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BigInteger getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxMessagesPerPoll(BigInteger newMaxMessagesPerPoll) {
        BigInteger oldMaxMessagesPerPoll = maxMessagesPerPoll;
        maxMessagesPerPoll = newMaxMessagesPerPoll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, maxMessagesPerPoll));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST, oldStartingDirectoryMustExist, startingDirectoryMustExist, !oldStartingDirectoryMustExistESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST, oldStartingDirectoryMustExist, STARTING_DIRECTORY_MUST_EXIST_EDEFAULT, oldStartingDirectoryMustExistESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST, oldDirectoryMustExist, directoryMustExist, !oldDirectoryMustExistESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST, oldDirectoryMustExist, DIRECTORY_MUST_EXIST_EDEFAULT, oldDirectoryMustExistESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME, oldDoneFileName, doneFileName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.FILE_CONSUMER_TYPE__INITIAL_DELAY:
                return getInitialDelay();
            case CamelPackage.FILE_CONSUMER_TYPE__DELAY:
                return getDelay();
            case CamelPackage.FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isUseFixedDelay();
            case CamelPackage.FILE_CONSUMER_TYPE__RECURSIVE:
                return isRecursive();
            case CamelPackage.FILE_CONSUMER_TYPE__DELETE:
                return isDelete();
            case CamelPackage.FILE_CONSUMER_TYPE__NOOP:
                return isNoop();
            case CamelPackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                return getPreMove();
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE:
                return getMove();
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                return getMoveFailed();
            case CamelPackage.FILE_CONSUMER_TYPE__INCLUDE:
                return getInclude();
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUDE:
                return getExclude();
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                return isIdempotent();
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                return getIdempotentRepository();
            case CamelPackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                return getInProgressRepository();
            case CamelPackage.FILE_CONSUMER_TYPE__FILTER:
                return getFilter();
            case CamelPackage.FILE_CONSUMER_TYPE__SORTER:
                return getSorter();
            case CamelPackage.FILE_CONSUMER_TYPE__SORT_BY:
                return getSortBy();
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK:
                return getReadLock();
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                return getReadLockTimeout();
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                return getReadLockCheckInterval();
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                return getExclusiveReadLockStrategy();
            case CamelPackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                return getProcessStrategy();
            case CamelPackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
            case CamelPackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                return isStartingDirectoryMustExist();
            case CamelPackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                return isDirectoryMustExist();
            case CamelPackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
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
            case CamelPackage.FILE_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay((BigInteger)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DELAY:
                setDelay((BigInteger)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                setUseFixedDelay((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__RECURSIVE:
                setRecursive((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__NOOP:
                setNoop((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                setPreMove((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE:
                setMove((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                setMoveFailed((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__INCLUDE:
                setInclude((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUDE:
                setExclude((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                setIdempotent((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                setIdempotentRepository((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                setInProgressRepository((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__FILTER:
                setFilter((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__SORTER:
                setSorter((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__SORT_BY:
                setSortBy((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK:
                setReadLock((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                setReadLockTimeout((Long)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                setReadLockCheckInterval((BigInteger)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                setExclusiveReadLockStrategy((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                setProcessStrategy((String)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll((BigInteger)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                setStartingDirectoryMustExist((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                setDirectoryMustExist((Boolean)newValue);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
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
            case CamelPackage.FILE_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay(INITIAL_DELAY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DELAY:
                setDelay(DELAY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                unsetUseFixedDelay();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__RECURSIVE:
                unsetRecursive();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DELETE:
                unsetDelete();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__NOOP:
                unsetNoop();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                setPreMove(PRE_MOVE_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE:
                setMove(MOVE_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                setMoveFailed(MOVE_FAILED_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__INCLUDE:
                setInclude(INCLUDE_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUDE:
                setExclude(EXCLUDE_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                unsetIdempotent();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                setIdempotentRepository(IDEMPOTENT_REPOSITORY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                setInProgressRepository(IN_PROGRESS_REPOSITORY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__FILTER:
                setFilter(FILTER_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__SORTER:
                setSorter(SORTER_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__SORT_BY:
                setSortBy(SORT_BY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK:
                setReadLock(READ_LOCK_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                unsetReadLockTimeout();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                setReadLockCheckInterval(READ_LOCK_CHECK_INTERVAL_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                setExclusiveReadLockStrategy(EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                setProcessStrategy(PROCESS_STRATEGY_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll(MAX_MESSAGES_PER_POLL_EDEFAULT);
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                unsetStartingDirectoryMustExist();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                unsetDirectoryMustExist();
                return;
            case CamelPackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                setDoneFileName(DONE_FILE_NAME_EDEFAULT);
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
            case CamelPackage.FILE_CONSUMER_TYPE__INITIAL_DELAY:
                return INITIAL_DELAY_EDEFAULT == null ? initialDelay != null : !INITIAL_DELAY_EDEFAULT.equals(initialDelay);
            case CamelPackage.FILE_CONSUMER_TYPE__DELAY:
                return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
            case CamelPackage.FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isSetUseFixedDelay();
            case CamelPackage.FILE_CONSUMER_TYPE__RECURSIVE:
                return isSetRecursive();
            case CamelPackage.FILE_CONSUMER_TYPE__DELETE:
                return isSetDelete();
            case CamelPackage.FILE_CONSUMER_TYPE__NOOP:
                return isSetNoop();
            case CamelPackage.FILE_CONSUMER_TYPE__PRE_MOVE:
                return PRE_MOVE_EDEFAULT == null ? preMove != null : !PRE_MOVE_EDEFAULT.equals(preMove);
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE:
                return MOVE_EDEFAULT == null ? move != null : !MOVE_EDEFAULT.equals(move);
            case CamelPackage.FILE_CONSUMER_TYPE__MOVE_FAILED:
                return MOVE_FAILED_EDEFAULT == null ? moveFailed != null : !MOVE_FAILED_EDEFAULT.equals(moveFailed);
            case CamelPackage.FILE_CONSUMER_TYPE__INCLUDE:
                return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUDE:
                return EXCLUDE_EDEFAULT == null ? exclude != null : !EXCLUDE_EDEFAULT.equals(exclude);
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT:
                return isSetIdempotent();
            case CamelPackage.FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
                return IDEMPOTENT_REPOSITORY_EDEFAULT == null ? idempotentRepository != null : !IDEMPOTENT_REPOSITORY_EDEFAULT.equals(idempotentRepository);
            case CamelPackage.FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
                return IN_PROGRESS_REPOSITORY_EDEFAULT == null ? inProgressRepository != null : !IN_PROGRESS_REPOSITORY_EDEFAULT.equals(inProgressRepository);
            case CamelPackage.FILE_CONSUMER_TYPE__FILTER:
                return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
            case CamelPackage.FILE_CONSUMER_TYPE__SORTER:
                return SORTER_EDEFAULT == null ? sorter != null : !SORTER_EDEFAULT.equals(sorter);
            case CamelPackage.FILE_CONSUMER_TYPE__SORT_BY:
                return SORT_BY_EDEFAULT == null ? sortBy != null : !SORT_BY_EDEFAULT.equals(sortBy);
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK:
                return READ_LOCK_EDEFAULT == null ? readLock != null : !READ_LOCK_EDEFAULT.equals(readLock);
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
                return isSetReadLockTimeout();
            case CamelPackage.FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
                return READ_LOCK_CHECK_INTERVAL_EDEFAULT == null ? readLockCheckInterval != null : !READ_LOCK_CHECK_INTERVAL_EDEFAULT.equals(readLockCheckInterval);
            case CamelPackage.FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
                return EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT == null ? exclusiveReadLockStrategy != null : !EXCLUSIVE_READ_LOCK_STRATEGY_EDEFAULT.equals(exclusiveReadLockStrategy);
            case CamelPackage.FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
                return PROCESS_STRATEGY_EDEFAULT == null ? processStrategy != null : !PROCESS_STRATEGY_EDEFAULT.equals(processStrategy);
            case CamelPackage.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return MAX_MESSAGES_PER_POLL_EDEFAULT == null ? maxMessagesPerPoll != null : !MAX_MESSAGES_PER_POLL_EDEFAULT.equals(maxMessagesPerPoll);
            case CamelPackage.FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
                return isSetStartingDirectoryMustExist();
            case CamelPackage.FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
                return isSetDirectoryMustExist();
            case CamelPackage.FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                return DONE_FILE_NAME_EDEFAULT == null ? doneFileName != null : !DONE_FILE_NAME_EDEFAULT.equals(doneFileName);
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
        result.append(", recursive: ");
        if (recursiveESet) result.append(recursive); else result.append("<unset>");
        result.append(", delete: ");
        if (deleteESet) result.append(delete); else result.append("<unset>");
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
        result.append(readLockCheckInterval);
        result.append(", exclusiveReadLockStrategy: ");
        result.append(exclusiveReadLockStrategy);
        result.append(", processStrategy: ");
        result.append(processStrategy);
        result.append(", maxMessagesPerPoll: ");
        result.append(maxMessagesPerPoll);
        result.append(", startingDirectoryMustExist: ");
        if (startingDirectoryMustExistESet) result.append(startingDirectoryMustExist); else result.append("<unset>");
        result.append(", directoryMustExist: ");
        if (directoryMustExistESet) result.append(directoryMustExist); else result.append("<unset>");
        result.append(", doneFileName: ");
        result.append(doneFileName);
        result.append(')');
        return result.toString();
    }

} //FileConsumerTypeImpl
