/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Netty Tcp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl#isTextline <em>Textline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl#isTcpNoDelay <em>Tcp No Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl#isKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelNettyTcpBindingTypeImpl extends CamelNettyBindingTypeImpl implements CamelNettyTcpBindingType {
    /**
     * The default value of the '{@link #isTextline() <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTextline()
     * @generated
     * @ordered
     */
    protected static final boolean TEXTLINE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTextline() <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTextline()
     * @generated
     * @ordered
     */
    protected boolean textline = TEXTLINE_EDEFAULT;

    /**
     * This is true if the Textline attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean textlineESet;

    /**
     * The default value of the '{@link #isTcpNoDelay() <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTcpNoDelay()
     * @generated
     * @ordered
     */
    protected static final boolean TCP_NO_DELAY_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isTcpNoDelay() <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTcpNoDelay()
     * @generated
     * @ordered
     */
    protected boolean tcpNoDelay = TCP_NO_DELAY_EDEFAULT;

    /**
     * This is true if the Tcp No Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcpNoDelayESet;

    /**
     * The default value of the '{@link #isKeepAlive() <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKeepAlive()
     * @generated
     * @ordered
     */
    protected static final boolean KEEP_ALIVE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isKeepAlive() <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKeepAlive()
     * @generated
     * @ordered
     */
    protected boolean keepAlive = KEEP_ALIVE_EDEFAULT;

    /**
     * This is true if the Keep Alive attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keepAliveESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelNettyTcpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NettyPackage.Literals.CAMEL_NETTY_TCP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTextline() {
        return textline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextline(boolean newTextline) {
        boolean oldTextline = textline;
        textline = newTextline;
        boolean oldTextlineESet = textlineESet;
        textlineESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE, oldTextline, textline, !oldTextlineESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTextline() {
        boolean oldTextline = textline;
        boolean oldTextlineESet = textlineESet;
        textline = TEXTLINE_EDEFAULT;
        textlineESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE, oldTextline, TEXTLINE_EDEFAULT, oldTextlineESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTextline() {
        return textlineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTcpNoDelay() {
        return tcpNoDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTcpNoDelay(boolean newTcpNoDelay) {
        boolean oldTcpNoDelay = tcpNoDelay;
        tcpNoDelay = newTcpNoDelay;
        boolean oldTcpNoDelayESet = tcpNoDelayESet;
        tcpNoDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY, oldTcpNoDelay, tcpNoDelay, !oldTcpNoDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTcpNoDelay() {
        boolean oldTcpNoDelay = tcpNoDelay;
        boolean oldTcpNoDelayESet = tcpNoDelayESet;
        tcpNoDelay = TCP_NO_DELAY_EDEFAULT;
        tcpNoDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY, oldTcpNoDelay, TCP_NO_DELAY_EDEFAULT, oldTcpNoDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTcpNoDelay() {
        return tcpNoDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isKeepAlive() {
        return keepAlive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeepAlive(boolean newKeepAlive) {
        boolean oldKeepAlive = keepAlive;
        keepAlive = newKeepAlive;
        boolean oldKeepAliveESet = keepAliveESet;
        keepAliveESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE, oldKeepAlive, keepAlive, !oldKeepAliveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetKeepAlive() {
        boolean oldKeepAlive = keepAlive;
        boolean oldKeepAliveESet = keepAliveESet;
        keepAlive = KEEP_ALIVE_EDEFAULT;
        keepAliveESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE, oldKeepAlive, KEEP_ALIVE_EDEFAULT, oldKeepAliveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetKeepAlive() {
        return keepAliveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                return isTextline();
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                return isTcpNoDelay();
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
                return isKeepAlive();
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
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                setTextline((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                setTcpNoDelay((Boolean)newValue);
                return;
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
                setKeepAlive((Boolean)newValue);
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
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                unsetTextline();
                return;
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                unsetTcpNoDelay();
                return;
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
                unsetKeepAlive();
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
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                return isSetTextline();
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                return isSetTcpNoDelay();
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
                return isSetKeepAlive();
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
        result.append(" (textline: ");
        if (textlineESet) result.append(textline); else result.append("<unset>");
        result.append(", tcpNoDelay: ");
        if (tcpNoDelayESet) result.append(tcpNoDelay); else result.append("<unset>");
        result.append(", keepAlive: ");
        if (keepAliveESet) result.append(keepAlive); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelNettyTcpBindingTypeImpl
