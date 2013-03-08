/**
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.jca.BatchCommit;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.BatchCommitImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.BatchCommitImpl#getBatchTimeout <em>Batch Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatchCommitImpl extends EObjectImpl implements BatchCommit {
    /**
     * The default value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatchSize()
     * @generated
     * @ordered
     */
    protected static final Object BATCH_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatchSize()
     * @generated
     * @ordered
     */
    protected Object batchSize = BATCH_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getBatchTimeout() <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatchTimeout()
     * @generated
     * @ordered
     */
    protected static final Object BATCH_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBatchTimeout() <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatchTimeout()
     * @generated
     * @ordered
     */
    protected Object batchTimeout = BATCH_TIMEOUT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BatchCommitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JcaPackage.Literals.BATCH_COMMIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBatchSize() {
        return batchSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBatchSize(Object newBatchSize) {
        Object oldBatchSize = batchSize;
        batchSize = newBatchSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.BATCH_COMMIT__BATCH_SIZE, oldBatchSize, batchSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBatchTimeout() {
        return batchTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBatchTimeout(Object newBatchTimeout) {
        Object oldBatchTimeout = batchTimeout;
        batchTimeout = newBatchTimeout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.BATCH_COMMIT__BATCH_TIMEOUT, oldBatchTimeout, batchTimeout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JcaPackage.BATCH_COMMIT__BATCH_SIZE:
                return getBatchSize();
            case JcaPackage.BATCH_COMMIT__BATCH_TIMEOUT:
                return getBatchTimeout();
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
            case JcaPackage.BATCH_COMMIT__BATCH_SIZE:
                setBatchSize(newValue);
                return;
            case JcaPackage.BATCH_COMMIT__BATCH_TIMEOUT:
                setBatchTimeout(newValue);
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
            case JcaPackage.BATCH_COMMIT__BATCH_SIZE:
                setBatchSize(BATCH_SIZE_EDEFAULT);
                return;
            case JcaPackage.BATCH_COMMIT__BATCH_TIMEOUT:
                setBatchTimeout(BATCH_TIMEOUT_EDEFAULT);
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
            case JcaPackage.BATCH_COMMIT__BATCH_SIZE:
                return BATCH_SIZE_EDEFAULT == null ? batchSize != null : !BATCH_SIZE_EDEFAULT.equals(batchSize);
            case JcaPackage.BATCH_COMMIT__BATCH_TIMEOUT:
                return BATCH_TIMEOUT_EDEFAULT == null ? batchTimeout != null : !BATCH_TIMEOUT_EDEFAULT.equals(batchTimeout);
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
        result.append(" (batchSize: ");
        result.append(batchSize);
        result.append(", batchTimeout: ");
        result.append(batchTimeout);
        result.append(')');
        return result.toString();
    }

} //BatchCommitImpl
