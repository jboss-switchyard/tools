/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.JpaProducerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jpa Producer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JpaProducerTypeImpl#getFlushOnSend <em>Flush On Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JpaProducerTypeImpl#getUsePersist <em>Use Persist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JpaProducerTypeImpl extends EObjectImpl implements JpaProducerType {
	/**
     * The default value of the '{@link #getFlushOnSend() <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFlushOnSend()
     * @generated
     * @ordered
     */
	protected static final Boolean FLUSH_ON_SEND_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFlushOnSend() <em>Flush On Send</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFlushOnSend()
     * @generated
     * @ordered
     */
	protected Boolean flushOnSend = FLUSH_ON_SEND_EDEFAULT;

	/**
     * This is true if the Flush On Send attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean flushOnSendESet;

	/**
     * The default value of the '{@link #getUsePersist() <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsePersist()
     * @generated
     * @ordered
     */
	protected static final Boolean USE_PERSIST_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUsePersist() <em>Use Persist</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsePersist()
     * @generated
     * @ordered
     */
	protected Boolean usePersist = USE_PERSIST_EDEFAULT;

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
        return CamelPackage.Literals.JPA_PRODUCER_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getFlushOnSend() {
        return flushOnSend;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFlushOnSend(Boolean newFlushOnSend) {
        Boolean oldFlushOnSend = flushOnSend;
        flushOnSend = newFlushOnSend;
        boolean oldFlushOnSendESet = flushOnSendESet;
        flushOnSendESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND, oldFlushOnSend, flushOnSend, !oldFlushOnSendESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetFlushOnSend() {
        Boolean oldFlushOnSend = flushOnSend;
        boolean oldFlushOnSendESet = flushOnSendESet;
        flushOnSend = FLUSH_ON_SEND_EDEFAULT;
        flushOnSendESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND, oldFlushOnSend, FLUSH_ON_SEND_EDEFAULT, oldFlushOnSendESet));
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
	public Boolean getUsePersist() {
        return usePersist;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUsePersist(Boolean newUsePersist) {
        Boolean oldUsePersist = usePersist;
        usePersist = newUsePersist;
        boolean oldUsePersistESet = usePersistESet;
        usePersistESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.JPA_PRODUCER_TYPE__USE_PERSIST, oldUsePersist, usePersist, !oldUsePersistESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetUsePersist() {
        Boolean oldUsePersist = usePersist;
        boolean oldUsePersistESet = usePersistESet;
        usePersist = USE_PERSIST_EDEFAULT;
        usePersistESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.JPA_PRODUCER_TYPE__USE_PERSIST, oldUsePersist, USE_PERSIST_EDEFAULT, oldUsePersistESet));
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
            case CamelPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                return getFlushOnSend();
            case CamelPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
                return getUsePersist();
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
            case CamelPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                setFlushOnSend((Boolean)newValue);
                return;
            case CamelPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
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
            case CamelPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                unsetFlushOnSend();
                return;
            case CamelPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
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
            case CamelPackage.JPA_PRODUCER_TYPE__FLUSH_ON_SEND:
                return isSetFlushOnSend();
            case CamelPackage.JPA_PRODUCER_TYPE__USE_PERSIST:
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
