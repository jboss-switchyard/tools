/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Jpa Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl#getEntityClassName <em>Entity Class Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl#getTransactionManager <em>Transaction Manager</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelJpaBindingTypeImpl extends BaseCamelBindingImpl implements CamelJpaBindingType {
    /**
     * The default value of the '{@link #getEntityClassName() <em>Entity Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityClassName()
     * @generated
     * @ordered
     */
    protected static final String ENTITY_CLASS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEntityClassName() <em>Entity Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityClassName()
     * @generated
     * @ordered
     */
    protected String entityClassName = ENTITY_CLASS_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistenceUnit()
     * @generated
     * @ordered
     */
    protected static final String PERSISTENCE_UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistenceUnit()
     * @generated
     * @ordered
     */
    protected String persistenceUnit = PERSISTENCE_UNIT_EDEFAULT;

    /**
     * The default value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionManager()
     * @generated
     * @ordered
     */
    protected static final String TRANSACTION_MANAGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionManager()
     * @generated
     * @ordered
     */
    protected String transactionManager = TRANSACTION_MANAGER_EDEFAULT;

    /**
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
    protected JpaConsumerType consume;

    /**
     * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProduce()
     * @generated
     * @ordered
     */
    protected JpaProducerType produce;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelJpaBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JpaPackage.Literals.CAMEL_JPA_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEntityClassName() {
        return entityClassName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityClassName(String newEntityClassName) {
        String oldEntityClassName = entityClassName;
        entityClassName = newEntityClassName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME, oldEntityClassName, entityClassName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPersistenceUnit() {
        return persistenceUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersistenceUnit(String newPersistenceUnit) {
        String oldPersistenceUnit = persistenceUnit;
        persistenceUnit = newPersistenceUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT, oldPersistenceUnit, persistenceUnit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTransactionManager() {
        return transactionManager;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransactionManager(String newTransactionManager) {
        String oldTransactionManager = transactionManager;
        transactionManager = newTransactionManager;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER, oldTransactionManager, transactionManager));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaConsumerType getConsume() {
        return consume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsume(JpaConsumerType newConsume, NotificationChain msgs) {
        JpaConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsume(JpaConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaProducerType getProduce() {
        return produce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProduce(JpaProducerType newProduce, NotificationChain msgs) {
        JpaProducerType oldProduce = produce;
        produce = newProduce;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProduce(JpaProducerType newProduce) {
        if (newProduce != produce) {
            NotificationChain msgs = null;
            if (produce != null)
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE:
                return basicSetProduce(null, msgs);
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
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME:
                return getEntityClassName();
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT:
                return getPersistenceUnit();
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER:
                return getTransactionManager();
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME:
                return getConsume();
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE:
                return getProduce();
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
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME:
                setEntityClassName((String)newValue);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT:
                setPersistenceUnit((String)newValue);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER:
                setTransactionManager((String)newValue);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME:
                setConsume((JpaConsumerType)newValue);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE:
                setProduce((JpaProducerType)newValue);
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
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME:
                setEntityClassName(ENTITY_CLASS_NAME_EDEFAULT);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT:
                setPersistenceUnit(PERSISTENCE_UNIT_EDEFAULT);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER:
                setTransactionManager(TRANSACTION_MANAGER_EDEFAULT);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME:
                setConsume((JpaConsumerType)null);
                return;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE:
                setProduce((JpaProducerType)null);
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
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME:
                return ENTITY_CLASS_NAME_EDEFAULT == null ? entityClassName != null : !ENTITY_CLASS_NAME_EDEFAULT.equals(entityClassName);
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT:
                return PERSISTENCE_UNIT_EDEFAULT == null ? persistenceUnit != null : !PERSISTENCE_UNIT_EDEFAULT.equals(persistenceUnit);
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER:
                return TRANSACTION_MANAGER_EDEFAULT == null ? transactionManager != null : !TRANSACTION_MANAGER_EDEFAULT.equals(transactionManager);
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__CONSUME:
                return consume != null;
            case JpaPackage.CAMEL_JPA_BINDING_TYPE__PRODUCE:
                return produce != null;
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
        result.append(" (entityClassName: ");
        result.append(entityClassName);
        result.append(", persistenceUnit: ");
        result.append(persistenceUnit);
        result.append(", transactionManager: ");
        result.append(transactionManager);
        result.append(')');
        return result.toString();
    }

} //CamelJpaBindingTypeImpl
