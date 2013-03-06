/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.jca.BatchCommit;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCA Inbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl#isTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl#getBatchCommit <em>Batch Commit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JCAInboundInteractionImpl extends EObjectImpl implements JCAInboundInteraction {
    /**
     * The default value of the '{@link #getListener() <em>Listener</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListener()
     * @generated
     * @ordered
     */
    protected static final String LISTENER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListener() <em>Listener</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListener()
     * @generated
     * @ordered
     */
    protected String listener = LISTENER_EDEFAULT;

    /**
     * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpoint()
     * @generated
     * @ordered
     */
    protected Endpoint endpoint;

    /**
     * The default value of the '{@link #isTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransacted()
     * @generated
     * @ordered
     */
    protected static final boolean TRANSACTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransacted()
     * @generated
     * @ordered
     */
    protected boolean transacted = TRANSACTED_EDEFAULT;

    /**
     * This is true if the Transacted attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transactedESet;

    /**
     * The cached value of the '{@link #getBatchCommit() <em>Batch Commit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatchCommit()
     * @generated
     * @ordered
     */
    protected BatchCommit batchCommit;

    /**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
    protected FeatureMap any;

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAInboundInteractionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JcaPackage.Literals.JCA_INBOUND_INTERACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListener() {
        return listener;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListener(String newListener) {
        String oldListener = listener;
        listener = newListener;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_INTERACTION__LISTENER, oldListener, listener));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndpoint(Endpoint newEndpoint, NotificationChain msgs) {
        Endpoint oldEndpoint = endpoint;
        endpoint = newEndpoint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT, oldEndpoint, newEndpoint);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndpoint(Endpoint newEndpoint) {
        if (newEndpoint != endpoint) {
            NotificationChain msgs = null;
            if (endpoint != null)
                msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT, null, msgs);
            if (newEndpoint != null)
                msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT, null, msgs);
            msgs = basicSetEndpoint(newEndpoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT, newEndpoint, newEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTransacted() {
        return transacted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransacted(boolean newTransacted) {
        boolean oldTransacted = transacted;
        transacted = newTransacted;
        boolean oldTransactedESet = transactedESet;
        transactedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED, oldTransacted, transacted, !oldTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTransacted() {
        boolean oldTransacted = transacted;
        boolean oldTransactedESet = transactedESet;
        transacted = TRANSACTED_EDEFAULT;
        transactedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED, oldTransacted, TRANSACTED_EDEFAULT, oldTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTransacted() {
        return transactedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BatchCommit getBatchCommit() {
        return batchCommit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBatchCommit(BatchCommit newBatchCommit, NotificationChain msgs) {
        BatchCommit oldBatchCommit = batchCommit;
        batchCommit = newBatchCommit;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT, oldBatchCommit, newBatchCommit);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBatchCommit(BatchCommit newBatchCommit) {
        if (newBatchCommit != batchCommit) {
            NotificationChain msgs = null;
            if (batchCommit != null)
                msgs = ((InternalEObject)batchCommit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT, null, msgs);
            if (newBatchCommit != null)
                msgs = ((InternalEObject)newBatchCommit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT, null, msgs);
            msgs = basicSetBatchCommit(newBatchCommit, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT, newBatchCommit, newBatchCommit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, JcaPackage.JCA_INBOUND_INTERACTION__ANY);
        }
        return any;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT:
                return basicSetEndpoint(null, msgs);
            case JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT:
                return basicSetBatchCommit(null, msgs);
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case JcaPackage.JCA_INBOUND_INTERACTION__LISTENER:
                return getListener();
            case JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT:
                return getEndpoint();
            case JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED:
                return isTransacted();
            case JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT:
                return getBatchCommit();
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case JcaPackage.JCA_INBOUND_INTERACTION__LISTENER:
                setListener((String)newValue);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT:
                setEndpoint((Endpoint)newValue);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED:
                setTransacted((Boolean)newValue);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT:
                setBatchCommit((BatchCommit)newValue);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case JcaPackage.JCA_INBOUND_INTERACTION__LISTENER:
                setListener(LISTENER_EDEFAULT);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT:
                setEndpoint((Endpoint)null);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED:
                unsetTransacted();
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT:
                setBatchCommit((BatchCommit)null);
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY:
                getAny().clear();
                return;
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case JcaPackage.JCA_INBOUND_INTERACTION__LISTENER:
                return LISTENER_EDEFAULT == null ? listener != null : !LISTENER_EDEFAULT.equals(listener);
            case JcaPackage.JCA_INBOUND_INTERACTION__ENDPOINT:
                return endpoint != null;
            case JcaPackage.JCA_INBOUND_INTERACTION__TRANSACTED:
                return isSetTransacted();
            case JcaPackage.JCA_INBOUND_INTERACTION__BATCH_COMMIT:
                return batchCommit != null;
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY:
                return any != null && !any.isEmpty();
            case JcaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(" (listener: ");
        result.append(listener);
        result.append(", transacted: ");
        if (transactedESet) result.append(transacted); else result.append("<unset>");
        result.append(", any: ");
        result.append(any);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //JCAInboundInteractionImpl
