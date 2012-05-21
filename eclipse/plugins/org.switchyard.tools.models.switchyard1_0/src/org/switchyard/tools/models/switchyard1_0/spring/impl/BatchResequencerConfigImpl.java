/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BatchResequencerConfigImpl#isAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BatchResequencerConfigImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BatchResequencerConfigImpl#getBatchTimeout <em>Batch Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BatchResequencerConfigImpl#isIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BatchResequencerConfigImpl#isReverse <em>Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatchResequencerConfigImpl extends ResequencerConfigImpl implements BatchResequencerConfig {
	/**
     * The default value of the '{@link #isAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAllowDuplicates()
     * @generated
     * @ordered
     */
	protected static final boolean ALLOW_DUPLICATES_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAllowDuplicates()
     * @generated
     * @ordered
     */
	protected boolean allowDuplicates = ALLOW_DUPLICATES_EDEFAULT;

	/**
     * This is true if the Allow Duplicates attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean allowDuplicatesESet;

	/**
     * The default value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchSize()
     * @generated
     * @ordered
     */
	protected static final int BATCH_SIZE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchSize()
     * @generated
     * @ordered
     */
	protected int batchSize = BATCH_SIZE_EDEFAULT;

	/**
     * This is true if the Batch Size attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean batchSizeESet;

	/**
     * The default value of the '{@link #getBatchTimeout() <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchTimeout()
     * @generated
     * @ordered
     */
	protected static final long BATCH_TIMEOUT_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getBatchTimeout() <em>Batch Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchTimeout()
     * @generated
     * @ordered
     */
	protected long batchTimeout = BATCH_TIMEOUT_EDEFAULT;

	/**
     * This is true if the Batch Timeout attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean batchTimeoutESet;

	/**
     * The default value of the '{@link #isIgnoreInvalidExchanges() <em>Ignore Invalid Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIgnoreInvalidExchanges()
     * @generated
     * @ordered
     */
    protected static final boolean IGNORE_INVALID_EXCHANGES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIgnoreInvalidExchanges() <em>Ignore Invalid Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIgnoreInvalidExchanges()
     * @generated
     * @ordered
     */
    protected boolean ignoreInvalidExchanges = IGNORE_INVALID_EXCHANGES_EDEFAULT;

    /**
     * This is true if the Ignore Invalid Exchanges attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ignoreInvalidExchangesESet;

    /**
     * The default value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isReverse()
     * @generated
     * @ordered
     */
	protected static final boolean REVERSE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isReverse()
     * @generated
     * @ordered
     */
	protected boolean reverse = REVERSE_EDEFAULT;

	/**
     * This is true if the Reverse attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean reverseESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BatchResequencerConfigImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getBatchResequencerConfig();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isAllowDuplicates() {
        return allowDuplicates;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAllowDuplicates(boolean newAllowDuplicates) {
        boolean oldAllowDuplicates = allowDuplicates;
        allowDuplicates = newAllowDuplicates;
        boolean oldAllowDuplicatesESet = allowDuplicatesESet;
        allowDuplicatesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates, !oldAllowDuplicatesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetAllowDuplicates() {
        boolean oldAllowDuplicates = allowDuplicates;
        boolean oldAllowDuplicatesESet = allowDuplicatesESet;
        allowDuplicates = ALLOW_DUPLICATES_EDEFAULT;
        allowDuplicatesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES, oldAllowDuplicates, ALLOW_DUPLICATES_EDEFAULT, oldAllowDuplicatesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetAllowDuplicates() {
        return allowDuplicatesESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBatchSize() {
        return batchSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBatchSize(int newBatchSize) {
        int oldBatchSize = batchSize;
        batchSize = newBatchSize;
        boolean oldBatchSizeESet = batchSizeESet;
        batchSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE, oldBatchSize, batchSize, !oldBatchSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetBatchSize() {
        int oldBatchSize = batchSize;
        boolean oldBatchSizeESet = batchSizeESet;
        batchSize = BATCH_SIZE_EDEFAULT;
        batchSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE, oldBatchSize, BATCH_SIZE_EDEFAULT, oldBatchSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetBatchSize() {
        return batchSizeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getBatchTimeout() {
        return batchTimeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBatchTimeout(long newBatchTimeout) {
        long oldBatchTimeout = batchTimeout;
        batchTimeout = newBatchTimeout;
        boolean oldBatchTimeoutESet = batchTimeoutESet;
        batchTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT, oldBatchTimeout, batchTimeout, !oldBatchTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetBatchTimeout() {
        long oldBatchTimeout = batchTimeout;
        boolean oldBatchTimeoutESet = batchTimeoutESet;
        batchTimeout = BATCH_TIMEOUT_EDEFAULT;
        batchTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT, oldBatchTimeout, BATCH_TIMEOUT_EDEFAULT, oldBatchTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetBatchTimeout() {
        return batchTimeoutESet;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIgnoreInvalidExchanges() {
        return ignoreInvalidExchanges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIgnoreInvalidExchanges(boolean newIgnoreInvalidExchanges) {
        boolean oldIgnoreInvalidExchanges = ignoreInvalidExchanges;
        ignoreInvalidExchanges = newIgnoreInvalidExchanges;
        boolean oldIgnoreInvalidExchangesESet = ignoreInvalidExchangesESet;
        ignoreInvalidExchangesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES, oldIgnoreInvalidExchanges, ignoreInvalidExchanges, !oldIgnoreInvalidExchangesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIgnoreInvalidExchanges() {
        boolean oldIgnoreInvalidExchanges = ignoreInvalidExchanges;
        boolean oldIgnoreInvalidExchangesESet = ignoreInvalidExchangesESet;
        ignoreInvalidExchanges = IGNORE_INVALID_EXCHANGES_EDEFAULT;
        ignoreInvalidExchangesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES, oldIgnoreInvalidExchanges, IGNORE_INVALID_EXCHANGES_EDEFAULT, oldIgnoreInvalidExchangesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIgnoreInvalidExchanges() {
        return ignoreInvalidExchangesESet;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isReverse() {
        return reverse;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReverse(boolean newReverse) {
        boolean oldReverse = reverse;
        reverse = newReverse;
        boolean oldReverseESet = reverseESet;
        reverseESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE, oldReverse, reverse, !oldReverseESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetReverse() {
        boolean oldReverse = reverse;
        boolean oldReverseESet = reverseESet;
        reverse = REVERSE_EDEFAULT;
        reverseESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE, oldReverse, REVERSE_EDEFAULT, oldReverseESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetReverse() {
        return reverseESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
                return isAllowDuplicates();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
                return getBatchSize();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
                return getBatchTimeout();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
                return isIgnoreInvalidExchanges();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
                return isReverse();
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
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
                setAllowDuplicates((Boolean)newValue);
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
                setBatchSize((Integer)newValue);
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
                setBatchTimeout((Long)newValue);
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
                setIgnoreInvalidExchanges((Boolean)newValue);
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
                setReverse((Boolean)newValue);
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
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
                unsetAllowDuplicates();
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
                unsetBatchSize();
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
                unsetBatchTimeout();
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
                unsetIgnoreInvalidExchanges();
                return;
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
                unsetReverse();
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
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__ALLOW_DUPLICATES:
                return isSetAllowDuplicates();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_SIZE:
                return isSetBatchSize();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__BATCH_TIMEOUT:
                return isSetBatchTimeout();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__IGNORE_INVALID_EXCHANGES:
                return isSetIgnoreInvalidExchanges();
            case SpringPackage.BATCH_RESEQUENCER_CONFIG__REVERSE:
                return isSetReverse();
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
        result.append(" (allowDuplicates: ");
        if (allowDuplicatesESet) result.append(allowDuplicates); else result.append("<unset>");
        result.append(", batchSize: ");
        if (batchSizeESet) result.append(batchSize); else result.append("<unset>");
        result.append(", batchTimeout: ");
        if (batchTimeoutESet) result.append(batchTimeout); else result.append("<unset>");
        result.append(", ignoreInvalidExchanges: ");
        if (ignoreInvalidExchangesESet) result.append(ignoreInvalidExchanges); else result.append("<unset>");
        result.append(", reverse: ");
        if (reverseESet) result.append(reverse); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //BatchResequencerConfigImpl
