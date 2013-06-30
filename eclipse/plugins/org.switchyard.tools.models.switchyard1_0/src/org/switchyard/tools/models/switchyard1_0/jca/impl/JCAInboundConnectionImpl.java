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

import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCA Inbound Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl#getActivationSpec <em>Activation Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JCAInboundConnectionImpl extends EObjectImpl implements JCAInboundConnection {
    /**
     * The cached value of the '{@link #getResourceAdapter() <em>Resource Adapter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceAdapter()
     * @generated
     * @ordered
     */
    protected ResourceAdapter resourceAdapter;

    /**
     * The cached value of the '{@link #getActivationSpec() <em>Activation Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivationSpec()
     * @generated
     * @ordered
     */
    protected ActivationSpec activationSpec;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAInboundConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JcaPackage.Literals.JCA_INBOUND_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceAdapter getResourceAdapter() {
        return resourceAdapter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceAdapter(ResourceAdapter newResourceAdapter, NotificationChain msgs) {
        ResourceAdapter oldResourceAdapter = resourceAdapter;
        resourceAdapter = newResourceAdapter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER, oldResourceAdapter, newResourceAdapter);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceAdapter(ResourceAdapter newResourceAdapter) {
        if (newResourceAdapter != resourceAdapter) {
            NotificationChain msgs = null;
            if (resourceAdapter != null)
                msgs = ((InternalEObject)resourceAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER, null, msgs);
            if (newResourceAdapter != null)
                msgs = ((InternalEObject)newResourceAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER, null, msgs);
            msgs = basicSetResourceAdapter(newResourceAdapter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER, newResourceAdapter, newResourceAdapter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivationSpec getActivationSpec() {
        return activationSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivationSpec(ActivationSpec newActivationSpec, NotificationChain msgs) {
        ActivationSpec oldActivationSpec = activationSpec;
        activationSpec = newActivationSpec;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC, oldActivationSpec, newActivationSpec);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivationSpec(ActivationSpec newActivationSpec) {
        if (newActivationSpec != activationSpec) {
            NotificationChain msgs = null;
            if (activationSpec != null)
                msgs = ((InternalEObject)activationSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC, null, msgs);
            if (newActivationSpec != null)
                msgs = ((InternalEObject)newActivationSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC, null, msgs);
            msgs = basicSetActivationSpec(newActivationSpec, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC, newActivationSpec, newActivationSpec));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER:
                return basicSetResourceAdapter(null, msgs);
            case JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC:
                return basicSetActivationSpec(null, msgs);
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
            case JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER:
                return getResourceAdapter();
            case JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC:
                return getActivationSpec();
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
            case JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER:
                setResourceAdapter((ResourceAdapter)newValue);
                return;
            case JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC:
                setActivationSpec((ActivationSpec)newValue);
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
            case JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER:
                setResourceAdapter((ResourceAdapter)null);
                return;
            case JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC:
                setActivationSpec((ActivationSpec)null);
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
            case JcaPackage.JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER:
                return resourceAdapter != null;
            case JcaPackage.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC:
                return activationSpec != null;
        }
        return super.eIsSet(featureID);
    }

} //JCAInboundConnectionImpl
