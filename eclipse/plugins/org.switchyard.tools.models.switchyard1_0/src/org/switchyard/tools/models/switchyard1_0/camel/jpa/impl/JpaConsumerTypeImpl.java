/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#isUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#isConsumeDelete <em>Consume Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#isConsumeLockEntity <em>Consume Lock Entity</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getMaximumResults <em>Maximum Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerQuery <em>Consumer Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerNamedQuery <em>Consumer Named Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerNativeQuery <em>Consumer Native Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerResultClass <em>Consumer Result Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#isConsumerTransacted <em>Consumer Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JpaConsumerTypeImpl extends EObjectImpl implements JpaConsumerType {
    /**
     * The cached value of the '{@link #getScheduledPollConsumerType() <em>Scheduled Poll Consumer Type</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledPollConsumerType()
     * @generated
     * @ordered
     */
    protected FeatureMap scheduledPollConsumerType;

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
     * The cached value of the '{@link #getScheduledBatchPollConsumerType() <em>Scheduled Batch Poll Consumer Type</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledBatchPollConsumerType()
     * @generated
     * @ordered
     */
    protected FeatureMap scheduledBatchPollConsumerType;

    /**
     * The default value of the '{@link #isConsumeDelete() <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConsumeDelete()
     * @generated
     * @ordered
     */
    protected static final boolean CONSUME_DELETE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isConsumeDelete() <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConsumeDelete()
     * @generated
     * @ordered
     */
    protected boolean consumeDelete = CONSUME_DELETE_EDEFAULT;

    /**
     * This is true if the Consume Delete attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumeDeleteESet;

    /**
     * The default value of the '{@link #isConsumeLockEntity() <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConsumeLockEntity()
     * @generated
     * @ordered
     */
    protected static final boolean CONSUME_LOCK_ENTITY_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isConsumeLockEntity() <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConsumeLockEntity()
     * @generated
     * @ordered
     */
    protected boolean consumeLockEntity = CONSUME_LOCK_ENTITY_EDEFAULT;

    /**
     * This is true if the Consume Lock Entity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumeLockEntityESet;

    /**
     * The default value of the '{@link #getMaximumResults() <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumResults()
     * @generated
     * @ordered
     */
    protected static final int MAXIMUM_RESULTS_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMaximumResults() <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumResults()
     * @generated
     * @ordered
     */
    protected int maximumResults = MAXIMUM_RESULTS_EDEFAULT;

    /**
     * This is true if the Maximum Results attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumResultsESet;

    /**
     * The default value of the '{@link #getConsumerQuery() <em>Consumer Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerQuery()
     * @generated
     * @ordered
     */
    protected static final String CONSUMER_QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumerQuery() <em>Consumer Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerQuery()
     * @generated
     * @ordered
     */
    protected String consumerQuery = CONSUMER_QUERY_EDEFAULT;

    /**
     * The default value of the '{@link #getConsumerNamedQuery() <em>Consumer Named Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerNamedQuery()
     * @generated
     * @ordered
     */
    protected static final String CONSUMER_NAMED_QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumerNamedQuery() <em>Consumer Named Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerNamedQuery()
     * @generated
     * @ordered
     */
    protected String consumerNamedQuery = CONSUMER_NAMED_QUERY_EDEFAULT;

    /**
     * The default value of the '{@link #getConsumerNativeQuery() <em>Consumer Native Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerNativeQuery()
     * @generated
     * @ordered
     */
    protected static final String CONSUMER_NATIVE_QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumerNativeQuery() <em>Consumer Native Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerNativeQuery()
     * @generated
     * @ordered
     */
    protected String consumerNativeQuery = CONSUMER_NATIVE_QUERY_EDEFAULT;

    /**
     * The default value of the '{@link #getConsumerResultClass() <em>Consumer Result Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerResultClass()
     * @generated
     * @ordered
     */
    protected static final String CONSUMER_RESULT_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumerResultClass() <em>Consumer Result Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerResultClass()
     * @generated
     * @ordered
     */
    protected String consumerResultClass = CONSUMER_RESULT_CLASS_EDEFAULT;

    /**
     * The default value of the '{@link #isConsumerTransacted() <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConsumerTransacted()
     * @generated
     * @ordered
     */
    protected static final boolean CONSUMER_TRANSACTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConsumerTransacted() <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConsumerTransacted()
     * @generated
     * @ordered
     */
    protected boolean consumerTransacted = CONSUMER_TRANSACTED_EDEFAULT;

    /**
     * This is true if the Consumer Transacted attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumerTransactedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JpaConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JpaPackage.Literals.JPA_CONSUMER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getScheduledPollConsumerType() {
        if (scheduledPollConsumerType == null) {
            scheduledPollConsumerType = new BasicFeatureMap(this, JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE);
        }
        return scheduledPollConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getInitialDelay() {
        return getScheduledPollConsumerType().get(JpaPackage.Literals.JPA_CONSUMER_TYPE__INITIAL_DELAY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialDelay(Object newInitialDelay) {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).set(JpaPackage.Literals.JPA_CONSUMER_TYPE__INITIAL_DELAY, newInitialDelay);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInitialDelay() {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).clear(JpaPackage.Literals.JPA_CONSUMER_TYPE__INITIAL_DELAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInitialDelay() {
        return !((FeatureMap.Internal)getScheduledPollConsumerType()).isEmpty(JpaPackage.Literals.JPA_CONSUMER_TYPE__INITIAL_DELAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDelay() {
        return getScheduledPollConsumerType().get(JpaPackage.Literals.JPA_CONSUMER_TYPE__DELAY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(Object newDelay) {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).set(JpaPackage.Literals.JPA_CONSUMER_TYPE__DELAY, newDelay);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDelay() {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).clear(JpaPackage.Literals.JPA_CONSUMER_TYPE__DELAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDelay() {
        return !((FeatureMap.Internal)getScheduledPollConsumerType()).isEmpty(JpaPackage.Literals.JPA_CONSUMER_TYPE__DELAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseFixedDelay() {
        return (Boolean)getScheduledPollConsumerType().get(JpaPackage.Literals.JPA_CONSUMER_TYPE__USE_FIXED_DELAY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseFixedDelay(boolean newUseFixedDelay) {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).set(JpaPackage.Literals.JPA_CONSUMER_TYPE__USE_FIXED_DELAY, newUseFixedDelay);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseFixedDelay() {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).clear(JpaPackage.Literals.JPA_CONSUMER_TYPE__USE_FIXED_DELAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseFixedDelay() {
        return !((FeatureMap.Internal)getScheduledPollConsumerType()).isEmpty(JpaPackage.Literals.JPA_CONSUMER_TYPE__USE_FIXED_DELAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSendEmptyMessageWhenIdle() {
        return (Boolean)getScheduledPollConsumerType().get(JpaPackage.Literals.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendEmptyMessageWhenIdle(boolean newSendEmptyMessageWhenIdle) {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).set(JpaPackage.Literals.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, newSendEmptyMessageWhenIdle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSendEmptyMessageWhenIdle() {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).clear(JpaPackage.Literals.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSendEmptyMessageWhenIdle() {
        return !((FeatureMap.Internal)getScheduledPollConsumerType()).isEmpty(JpaPackage.Literals.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType getTimeUnit() {
        return (TimeUnitType)getScheduledPollConsumerType().get(JpaPackage.Literals.JPA_CONSUMER_TYPE__TIME_UNIT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeUnit(TimeUnitType newTimeUnit) {
        ((FeatureMap.Internal)getScheduledPollConsumerType()).set(JpaPackage.Literals.JPA_CONSUMER_TYPE__TIME_UNIT, newTimeUnit);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getScheduledBatchPollConsumerType() {
        if (scheduledBatchPollConsumerType == null) {
            scheduledBatchPollConsumerType = new BasicFeatureMap(this, JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE);
        }
        return scheduledBatchPollConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMaxMessagesPerPoll() {
        return getScheduledBatchPollConsumerType().get(JpaPackage.Literals.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxMessagesPerPoll(Object newMaxMessagesPerPoll) {
        ((FeatureMap.Internal)getScheduledBatchPollConsumerType()).set(JpaPackage.Literals.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, newMaxMessagesPerPoll);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxMessagesPerPoll() {
        ((FeatureMap.Internal)getScheduledBatchPollConsumerType()).clear(JpaPackage.Literals.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaxMessagesPerPoll() {
        return !((FeatureMap.Internal)getScheduledBatchPollConsumerType()).isEmpty(JpaPackage.Literals.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConsumeDelete() {
        return consumeDelete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumeDelete(boolean newConsumeDelete) {
        boolean oldConsumeDelete = consumeDelete;
        consumeDelete = newConsumeDelete;
        boolean oldConsumeDeleteESet = consumeDeleteESet;
        consumeDeleteESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE, oldConsumeDelete, consumeDelete, !oldConsumeDeleteESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConsumeDelete() {
        boolean oldConsumeDelete = consumeDelete;
        boolean oldConsumeDeleteESet = consumeDeleteESet;
        consumeDelete = CONSUME_DELETE_EDEFAULT;
        consumeDeleteESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE, oldConsumeDelete, CONSUME_DELETE_EDEFAULT, oldConsumeDeleteESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConsumeDelete() {
        return consumeDeleteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConsumeLockEntity() {
        return consumeLockEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumeLockEntity(boolean newConsumeLockEntity) {
        boolean oldConsumeLockEntity = consumeLockEntity;
        consumeLockEntity = newConsumeLockEntity;
        boolean oldConsumeLockEntityESet = consumeLockEntityESet;
        consumeLockEntityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY, oldConsumeLockEntity, consumeLockEntity, !oldConsumeLockEntityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConsumeLockEntity() {
        boolean oldConsumeLockEntity = consumeLockEntity;
        boolean oldConsumeLockEntityESet = consumeLockEntityESet;
        consumeLockEntity = CONSUME_LOCK_ENTITY_EDEFAULT;
        consumeLockEntityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY, oldConsumeLockEntity, CONSUME_LOCK_ENTITY_EDEFAULT, oldConsumeLockEntityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConsumeLockEntity() {
        return consumeLockEntityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaximumResults() {
        return maximumResults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumResults(int newMaximumResults) {
        int oldMaximumResults = maximumResults;
        maximumResults = newMaximumResults;
        boolean oldMaximumResultsESet = maximumResultsESet;
        maximumResultsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS, oldMaximumResults, maximumResults, !oldMaximumResultsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaximumResults() {
        int oldMaximumResults = maximumResults;
        boolean oldMaximumResultsESet = maximumResultsESet;
        maximumResults = MAXIMUM_RESULTS_EDEFAULT;
        maximumResultsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS, oldMaximumResults, MAXIMUM_RESULTS_EDEFAULT, oldMaximumResultsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaximumResults() {
        return maximumResultsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConsumerQuery() {
        return consumerQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerQuery(String newConsumerQuery) {
        String oldConsumerQuery = consumerQuery;
        consumerQuery = newConsumerQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_QUERY, oldConsumerQuery, consumerQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConsumerNamedQuery() {
        return consumerNamedQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerNamedQuery(String newConsumerNamedQuery) {
        String oldConsumerNamedQuery = consumerNamedQuery;
        consumerNamedQuery = newConsumerNamedQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY, oldConsumerNamedQuery, consumerNamedQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConsumerNativeQuery() {
        return consumerNativeQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerNativeQuery(String newConsumerNativeQuery) {
        String oldConsumerNativeQuery = consumerNativeQuery;
        consumerNativeQuery = newConsumerNativeQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY, oldConsumerNativeQuery, consumerNativeQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConsumerResultClass() {
        return consumerResultClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerResultClass(String newConsumerResultClass) {
        String oldConsumerResultClass = consumerResultClass;
        consumerResultClass = newConsumerResultClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS, oldConsumerResultClass, consumerResultClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConsumerTransacted() {
        return consumerTransacted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerTransacted(boolean newConsumerTransacted) {
        boolean oldConsumerTransacted = consumerTransacted;
        consumerTransacted = newConsumerTransacted;
        boolean oldConsumerTransactedESet = consumerTransactedESet;
        consumerTransactedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED, oldConsumerTransacted, consumerTransacted, !oldConsumerTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConsumerTransacted() {
        boolean oldConsumerTransacted = consumerTransacted;
        boolean oldConsumerTransactedESet = consumerTransactedESet;
        consumerTransacted = CONSUMER_TRANSACTED_EDEFAULT;
        consumerTransactedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED, oldConsumerTransacted, CONSUMER_TRANSACTED_EDEFAULT, oldConsumerTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConsumerTransacted() {
        return consumerTransactedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE:
                return ((InternalEList<?>)getScheduledPollConsumerType()).basicRemove(otherEnd, msgs);
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE:
                return ((InternalEList<?>)getScheduledBatchPollConsumerType()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE:
                if (coreType) return getScheduledPollConsumerType();
                return ((FeatureMap.Internal)getScheduledPollConsumerType()).getWrapper();
            case JpaPackage.JPA_CONSUMER_TYPE__INITIAL_DELAY:
                return getInitialDelay();
            case JpaPackage.JPA_CONSUMER_TYPE__DELAY:
                return getDelay();
            case JpaPackage.JPA_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isUseFixedDelay();
            case JpaPackage.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSendEmptyMessageWhenIdle();
            case JpaPackage.JPA_CONSUMER_TYPE__TIME_UNIT:
                return getTimeUnit();
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE:
                if (coreType) return getScheduledBatchPollConsumerType();
                return ((FeatureMap.Internal)getScheduledBatchPollConsumerType()).getWrapper();
            case JpaPackage.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE:
                return isConsumeDelete();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY:
                return isConsumeLockEntity();
            case JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS:
                return getMaximumResults();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_QUERY:
                return getConsumerQuery();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY:
                return getConsumerNamedQuery();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY:
                return getConsumerNativeQuery();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS:
                return getConsumerResultClass();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED:
                return isConsumerTransacted();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE:
                ((FeatureMap.Internal)getScheduledPollConsumerType()).set(newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay(newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__DELAY:
                setDelay(newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__USE_FIXED_DELAY:
                setUseFixedDelay((Boolean)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                setSendEmptyMessageWhenIdle((Boolean)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__TIME_UNIT:
                setTimeUnit((TimeUnitType)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE:
                ((FeatureMap.Internal)getScheduledBatchPollConsumerType()).set(newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll(newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE:
                setConsumeDelete((Boolean)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY:
                setConsumeLockEntity((Boolean)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS:
                setMaximumResults((Integer)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_QUERY:
                setConsumerQuery((String)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY:
                setConsumerNamedQuery((String)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY:
                setConsumerNativeQuery((String)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS:
                setConsumerResultClass((String)newValue);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED:
                setConsumerTransacted((Boolean)newValue);
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
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE:
                getScheduledPollConsumerType().clear();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__INITIAL_DELAY:
                unsetInitialDelay();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__DELAY:
                unsetDelay();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__USE_FIXED_DELAY:
                unsetUseFixedDelay();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                unsetSendEmptyMessageWhenIdle();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__TIME_UNIT:
                setTimeUnit(TIME_UNIT_EDEFAULT);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE:
                getScheduledBatchPollConsumerType().clear();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                unsetMaxMessagesPerPoll();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE:
                unsetConsumeDelete();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY:
                unsetConsumeLockEntity();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS:
                unsetMaximumResults();
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_QUERY:
                setConsumerQuery(CONSUMER_QUERY_EDEFAULT);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY:
                setConsumerNamedQuery(CONSUMER_NAMED_QUERY_EDEFAULT);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY:
                setConsumerNativeQuery(CONSUMER_NATIVE_QUERY_EDEFAULT);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS:
                setConsumerResultClass(CONSUMER_RESULT_CLASS_EDEFAULT);
                return;
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED:
                unsetConsumerTransacted();
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
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE:
                return scheduledPollConsumerType != null && !scheduledPollConsumerType.isEmpty();
            case JpaPackage.JPA_CONSUMER_TYPE__INITIAL_DELAY:
                return isSetInitialDelay();
            case JpaPackage.JPA_CONSUMER_TYPE__DELAY:
                return isSetDelay();
            case JpaPackage.JPA_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isSetUseFixedDelay();
            case JpaPackage.JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSetSendEmptyMessageWhenIdle();
            case JpaPackage.JPA_CONSUMER_TYPE__TIME_UNIT:
                return getTimeUnit() != TIME_UNIT_EDEFAULT;
            case JpaPackage.JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE:
                return scheduledBatchPollConsumerType != null && !scheduledBatchPollConsumerType.isEmpty();
            case JpaPackage.JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return isSetMaxMessagesPerPoll();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE:
                return isSetConsumeDelete();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY:
                return isSetConsumeLockEntity();
            case JpaPackage.JPA_CONSUMER_TYPE__MAXIMUM_RESULTS:
                return isSetMaximumResults();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_QUERY:
                return CONSUMER_QUERY_EDEFAULT == null ? consumerQuery != null : !CONSUMER_QUERY_EDEFAULT.equals(consumerQuery);
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY:
                return CONSUMER_NAMED_QUERY_EDEFAULT == null ? consumerNamedQuery != null : !CONSUMER_NAMED_QUERY_EDEFAULT.equals(consumerNamedQuery);
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY:
                return CONSUMER_NATIVE_QUERY_EDEFAULT == null ? consumerNativeQuery != null : !CONSUMER_NATIVE_QUERY_EDEFAULT.equals(consumerNativeQuery);
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS:
                return CONSUMER_RESULT_CLASS_EDEFAULT == null ? consumerResultClass != null : !CONSUMER_RESULT_CLASS_EDEFAULT.equals(consumerResultClass);
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED:
                return isSetConsumerTransacted();
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
        result.append(" (scheduledPollConsumerType: ");
        result.append(scheduledPollConsumerType);
        result.append(", scheduledBatchPollConsumerType: ");
        result.append(scheduledBatchPollConsumerType);
        result.append(", consumeDelete: ");
        if (consumeDeleteESet) result.append(consumeDelete); else result.append("<unset>");
        result.append(", consumeLockEntity: ");
        if (consumeLockEntityESet) result.append(consumeLockEntity); else result.append("<unset>");
        result.append(", maximumResults: ");
        if (maximumResultsESet) result.append(maximumResults); else result.append("<unset>");
        result.append(", consumerQuery: ");
        result.append(consumerQuery);
        result.append(", consumerNamedQuery: ");
        result.append(consumerNamedQuery);
        result.append(", consumerNativeQuery: ");
        result.append(consumerNativeQuery);
        result.append(", consumerResultClass: ");
        result.append(consumerResultClass);
        result.append(", consumerTransacted: ");
        if (consumerTransactedESet) result.append(consumerTransacted); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //JpaConsumerTypeImpl
