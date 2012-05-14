/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.PollEnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll Enrich Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PollEnrichDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PollEnrichDefinitionImpl#getStrategyRef <em>Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PollEnrichDefinitionImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PollEnrichDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PollEnrichDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollEnrichDefinitionImpl extends NoOutputDefinitionImpl implements PollEnrichDefinition {
	/**
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected static final String REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected String ref = REF_EDEFAULT;

	/**
     * The default value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
	protected static final String STRATEGY_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
	protected String strategyRef = STRATEGY_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
	protected static final long TIMEOUT_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
	protected long timeout = TIMEOUT_EDEFAULT;

	/**
     * This is true if the Timeout attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean timeoutESet;

	/**
     * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
	protected static final String URI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
	protected String uri = URI_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PollEnrichDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getPollEnrichDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRef() {
        return ref;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRef(String newRef) {
        String oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.POLL_ENRICH_DEFINITION__REF, oldRef, ref));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStrategyRef() {
        return strategyRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStrategyRef(String newStrategyRef) {
        String oldStrategyRef = strategyRef;
        strategyRef = newStrategyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.POLL_ENRICH_DEFINITION__STRATEGY_REF, oldStrategyRef, strategyRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getTimeout() {
        return timeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTimeout(long newTimeout) {
        long oldTimeout = timeout;
        timeout = newTimeout;
        boolean oldTimeoutESet = timeoutESet;
        timeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.POLL_ENRICH_DEFINITION__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetTimeout() {
        long oldTimeout = timeout;
        boolean oldTimeoutESet = timeoutESet;
        timeout = TIMEOUT_EDEFAULT;
        timeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.POLL_ENRICH_DEFINITION__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetTimeout() {
        return timeoutESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUri() {
        return uri;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUri(String newUri) {
        String oldUri = uri;
        uri = newUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.POLL_ENRICH_DEFINITION__URI, oldUri, uri));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.POLL_ENRICH_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.POLL_ENRICH_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.POLL_ENRICH_DEFINITION__REF:
                return getRef();
            case SpringPackage.POLL_ENRICH_DEFINITION__STRATEGY_REF:
                return getStrategyRef();
            case SpringPackage.POLL_ENRICH_DEFINITION__TIMEOUT:
                return getTimeout();
            case SpringPackage.POLL_ENRICH_DEFINITION__URI:
                return getUri();
            case SpringPackage.POLL_ENRICH_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
            case SpringPackage.POLL_ENRICH_DEFINITION__REF:
                setRef((String)newValue);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__STRATEGY_REF:
                setStrategyRef((String)newValue);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__TIMEOUT:
                setTimeout((Long)newValue);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__URI:
                setUri((String)newValue);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.POLL_ENRICH_DEFINITION__REF:
                setRef(REF_EDEFAULT);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__STRATEGY_REF:
                setStrategyRef(STRATEGY_REF_EDEFAULT);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__TIMEOUT:
                unsetTimeout();
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__URI:
                setUri(URI_EDEFAULT);
                return;
            case SpringPackage.POLL_ENRICH_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.POLL_ENRICH_DEFINITION__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
            case SpringPackage.POLL_ENRICH_DEFINITION__STRATEGY_REF:
                return STRATEGY_REF_EDEFAULT == null ? strategyRef != null : !STRATEGY_REF_EDEFAULT.equals(strategyRef);
            case SpringPackage.POLL_ENRICH_DEFINITION__TIMEOUT:
                return isSetTimeout();
            case SpringPackage.POLL_ENRICH_DEFINITION__URI:
                return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
            case SpringPackage.POLL_ENRICH_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (ref: ");
        result.append(ref);
        result.append(", strategyRef: ");
        result.append(strategyRef);
        result.append(", timeout: ");
        if (timeoutESet) result.append(timeout); else result.append("<unset>");
        result.append(", uri: ");
        result.append(uri);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //PollEnrichDefinitionImpl
