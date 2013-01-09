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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyUdpBindingTypeImpl#isBroadcast <em>Broadcast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelNettyUdpBindingTypeImpl extends CamelNettyBindingTypeImpl implements CamelNettyUdpBindingType {
    /**
     * The default value of the '{@link #isBroadcast() <em>Broadcast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBroadcast()
     * @generated
     * @ordered
     */
    protected static final boolean BROADCAST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBroadcast() <em>Broadcast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBroadcast()
     * @generated
     * @ordered
     */
    protected boolean broadcast = BROADCAST_EDEFAULT;

    /**
     * This is true if the Broadcast attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean broadcastESet;

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
    public boolean isBroadcast() {
        return broadcast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBroadcast(boolean newBroadcast) {
        boolean oldBroadcast = broadcast;
        broadcast = newBroadcast;
        boolean oldBroadcastESet = broadcastESet;
        broadcastESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST, oldBroadcast, broadcast, !oldBroadcastESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBroadcast() {
        boolean oldBroadcast = broadcast;
        boolean oldBroadcastESet = broadcastESet;
        broadcast = BROADCAST_EDEFAULT;
        broadcastESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST, oldBroadcast, BROADCAST_EDEFAULT, oldBroadcastESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBroadcast() {
        return broadcastESet;
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
                return isBroadcast();
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
                unsetBroadcast();
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
                return isSetBroadcast();
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
        if (broadcastESet) result.append(broadcast); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelNettyUdpBindingTypeImpl
