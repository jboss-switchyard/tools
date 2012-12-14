/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Netty Udp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyUdpBindingTypeImpl#getBroadcast <em>Broadcast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelNettyUdpBindingTypeImpl extends CamelNettyBindingTypeImpl implements CamelNettyUdpBindingType {
    /**
     * The default value of the '{@link #getBroadcast() <em>Broadcast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBroadcast()
     * @generated
     * @ordered
     */
    protected static final Boolean BROADCAST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBroadcast() <em>Broadcast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBroadcast()
     * @generated
     * @ordered
     */
    protected Boolean broadcast = BROADCAST_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelNettyUdpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NettyPackage.Literals.CAMEL_NETTY_UDP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getBroadcast() {
        return broadcast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBroadcast(Boolean newBroadcast) {
        Boolean oldBroadcast = broadcast;
        broadcast = newBroadcast;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST, oldBroadcast, broadcast));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST:
                return getBroadcast();
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
            case NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST:
                setBroadcast((Boolean)newValue);
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
            case NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST:
                setBroadcast(BROADCAST_EDEFAULT);
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
            case NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST:
                return BROADCAST_EDEFAULT == null ? broadcast != null : !BROADCAST_EDEFAULT.equals(broadcast);
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
        result.append(" (broadcast: ");
        result.append(broadcast);
        result.append(')');
        return result.toString();
    }

} //CamelNettyUdpBindingTypeImpl
