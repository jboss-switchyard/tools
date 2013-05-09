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

import org.switchyard.tools.models.switchyard1_0.jca.Connection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.ResAuth;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCA Outbound Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JCAOutboundConnectionImpl extends EObjectImpl implements JCAOutboundConnection {
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
     * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnection()
     * @generated
     * @ordered
     */
    protected Connection connection;

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
    protected JCAOutboundConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JcaPackage.Literals.JCA_OUTBOUND_CONNECTION;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER, oldResourceAdapter, newResourceAdapter);
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
                msgs = ((InternalEObject)resourceAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER, null, msgs);
            if (newResourceAdapter != null)
                msgs = ((InternalEObject)newResourceAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER, null, msgs);
            msgs = basicSetResourceAdapter(newResourceAdapter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER, newResourceAdapter, newResourceAdapter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnection(Connection newConnection, NotificationChain msgs) {
        Connection oldConnection = connection;
        connection = newConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION, oldConnection, newConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnection(Connection newConnection) {
        if (newConnection != connection) {
            NotificationChain msgs = null;
            if (connection != null)
                msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION, null, msgs);
            if (newConnection != null)
                msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION, null, msgs);
            msgs = basicSetConnection(newConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION, newConnection, newConnection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, JcaPackage.JCA_OUTBOUND_CONNECTION__ANY);
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
            anyAttribute = new BasicFeatureMap(this, JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE);
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
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER:
                return basicSetResourceAdapter(null, msgs);
            case JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION:
                return basicSetConnection(null, msgs);
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE:
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
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER:
                return getResourceAdapter();
            case JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION:
                return getConnection();
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE:
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
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER:
                setResourceAdapter((ResourceAdapter)newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION:
                setConnection((Connection)newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE:
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
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER:
                setResourceAdapter((ResourceAdapter)null);
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION:
                setConnection((Connection)null);
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY:
                getAny().clear();
                return;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE:
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
            case JcaPackage.JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER:
                return resourceAdapter != null;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__CONNECTION:
                return connection != null;
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY:
                return any != null && !any.isEmpty();
            case JcaPackage.JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE:
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
        result.append(" (any: ");
        result.append(any);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //JCAOutboundConnectionImpl
