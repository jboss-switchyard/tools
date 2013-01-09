/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl#isFlushOnSend <em>Flush On Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl#isUsePersist <em>Use Persist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JpaProducerTypeImpl extends EObjectImpl implements JpaProducerType {
    /**
     * The default value of the '{@link #isFlushOnSend() <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFlushOnSend()
     * @generated
     * @ordered
     */
    protected static final boolean FLUSH_ON_SEND_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isFlushOnSend() <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFlushOnSend()
     * @generated
     * @ordered
     */
    protected boolean flushOnSend = FLUSH_ON_SEND_EDEFAULT;

    /**
     * This is true if the Flush On Send attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flushOnSendESet;

    /**
     * The default value of the '{@link #isUsePersist() <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUsePersist()
     * @generated
     * @ordered
     */
    protected static final boolean USE_PERSIST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUsePersist() <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUsePersist()
     * @generated
     * @ordered
     */
    protected boolean usePersist = USE_PERSIST_EDEFAULT;

    /**
     * This is true if the Use Persist attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usePersistESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JpaProducerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JpaPackage.Literals.JPA_PRODUCER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFlushOnSend() {
        return flushOnSend;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlushOnSend(boolean newFlushOnSend) {
        boolean oldFlushOnSend = flushOnSend;
        flushOnSend = newFlushOnSend;
        boolean oldFlushOnSendESet = flushOnSendESet;
        flushOnSendESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND, oldFlushOnSend, flushOnSend, !oldFlushOnSendESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFlushOnSend() {
        boolean oldFlushOnSend = flushOnSend;
        boolean oldFlushOnSendESet = flushOnSendESet;
        flushOnSend = FLUSH_ON_SEND_EDEFAULT;
        flushOnSendESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JpaPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND, oldFlushOnSend, FLUSH_ON_SEND_EDEFAULT, oldFlushOnSendESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFlushOnSend() {
        return flushOnSendESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUsePersist() {
        return usePersist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsePersist(boolean newUsePersist) {
        boolean oldUsePersist = usePersist;
        usePersist = newUsePersist;
        boolean oldUsePersistESet = usePersistESet;
        usePersistESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JPA_PRODUCER_TYPE__USE_PERSIST, oldUsePersist, usePersist, !oldUsePersistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUsePersist() {
        boolean oldUsePersist = usePersist;
        boolean oldUsePersistESet = usePersistESet;
        usePersist = USE_PERSIST_EDEFAULT;
        usePersistESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JpaPackage.JPA_PRODUCER_TYPE__USE_PERSIST, oldUsePersist, USE_PERSIST_EDEFAULT, oldUsePersistESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUsePersist() {
        return usePersistESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JpaPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                return isFlushOnSend();
            case JpaPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
                return isUsePersist();
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
            case JpaPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                setFlushOnSend((Boolean)newValue);
                return;
            case JpaPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
                setUsePersist((Boolean)newValue);
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
            case JpaPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                unsetFlushOnSend();
                return;
            case JpaPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
                unsetUsePersist();
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
            case JpaPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                return isSetFlushOnSend();
            case JpaPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
                return isSetUsePersist();
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
        result.append(" (flushOnSend: ");
        if (flushOnSendESet) result.append(flushOnSend); else result.append("<unset>");
        result.append(", usePersist: ");
        if (usePersistESet) result.append(usePersist); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //JpaProducerTypeImpl
