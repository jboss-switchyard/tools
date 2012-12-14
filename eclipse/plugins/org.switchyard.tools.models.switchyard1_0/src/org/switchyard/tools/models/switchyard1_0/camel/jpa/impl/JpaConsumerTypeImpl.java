/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledBatchPollConsumerTypeImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumeDelete <em>Consume Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumeLockEntity <em>Consume Lock Entity</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getMaximumResults <em>Maximum Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerQuery <em>Consumer Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerNamedQuery <em>Consumer Named Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerNativeQuery <em>Consumer Native Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerResultClass <em>Consumer Result Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl#getConsumerTransacted <em>Consumer Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JpaConsumerTypeImpl extends ScheduledBatchPollConsumerTypeImpl implements JpaConsumerType {
    /**
     * The default value of the '{@link #getConsumeDelete() <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumeDelete()
     * @generated
     * @ordered
     */
    protected static final Boolean CONSUME_DELETE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumeDelete() <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumeDelete()
     * @generated
     * @ordered
     */
    protected Boolean consumeDelete = CONSUME_DELETE_EDEFAULT;

    /**
     * This is true if the Consume Delete attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumeDeleteESet;

    /**
     * The default value of the '{@link #getConsumeLockEntity() <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumeLockEntity()
     * @generated
     * @ordered
     */
    protected static final Boolean CONSUME_LOCK_ENTITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumeLockEntity() <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumeLockEntity()
     * @generated
     * @ordered
     */
    protected Boolean consumeLockEntity = CONSUME_LOCK_ENTITY_EDEFAULT;

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
    protected static final Integer MAXIMUM_RESULTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumResults() <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumResults()
     * @generated
     * @ordered
     */
    protected Integer maximumResults = MAXIMUM_RESULTS_EDEFAULT;

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
     * The default value of the '{@link #getConsumerTransacted() <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerTransacted()
     * @generated
     * @ordered
     */
    protected static final Boolean CONSUMER_TRANSACTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumerTransacted() <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerTransacted()
     * @generated
     * @ordered
     */
    protected Boolean consumerTransacted = CONSUMER_TRANSACTED_EDEFAULT;

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
    public Boolean getConsumeDelete() {
        return consumeDelete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumeDelete(Boolean newConsumeDelete) {
        Boolean oldConsumeDelete = consumeDelete;
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
        Boolean oldConsumeDelete = consumeDelete;
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
    public Boolean getConsumeLockEntity() {
        return consumeLockEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumeLockEntity(Boolean newConsumeLockEntity) {
        Boolean oldConsumeLockEntity = consumeLockEntity;
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
        Boolean oldConsumeLockEntity = consumeLockEntity;
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
    public Integer getMaximumResults() {
        return maximumResults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumResults(Integer newMaximumResults) {
        Integer oldMaximumResults = maximumResults;
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
        Integer oldMaximumResults = maximumResults;
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
    public Boolean getConsumerTransacted() {
        return consumerTransacted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerTransacted(Boolean newConsumerTransacted) {
        Boolean oldConsumerTransacted = consumerTransacted;
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
        Boolean oldConsumerTransacted = consumerTransacted;
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_DELETE:
                return getConsumeDelete();
            case JpaPackage.JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY:
                return getConsumeLockEntity();
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
                return getConsumerTransacted();
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
        result.append(" (consumeDelete: ");
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
