/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netty Tcp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyTcpBindingTypeImpl#getTextline <em>Textline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyTcpBindingTypeImpl#getTcpNoDelay <em>Tcp No Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelNettyTcpBindingTypeImpl#isKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelNettyTcpBindingTypeImpl extends CamelNettyBindingTypeImpl implements CamelNettyTcpBindingType {
    /**
     * The default value of the '{@link #getTextline() <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextline()
     * @generated
     * @ordered
     */
    protected static final Boolean TEXTLINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextline() <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextline()
     * @generated
     * @ordered
     */
    protected Boolean textline = TEXTLINE_EDEFAULT;

    /**
     * The default value of the '{@link #getTcpNoDelay() <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcpNoDelay()
     * @generated
     * @ordered
     */
    protected static final Boolean TCP_NO_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTcpNoDelay() <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcpNoDelay()
     * @generated
     * @ordered
     */
    protected Boolean tcpNoDelay = TCP_NO_DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #isKeepAlive() <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKeepAlive()
     * @generated
     * @ordered
     */
    protected static final boolean KEEP_ALIVE_EDEFAULT = false;

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
        return CamelPackage.Literals.CAMEL_NETTY_TCP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getTextline() {
        return textline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextline(Boolean newTextline) {
        Boolean oldTextline = textline;
        textline = newTextline;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE, oldTextline, textline));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getTcpNoDelay() {
        return tcpNoDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTcpNoDelay(Boolean newTcpNoDelay) {
        Boolean oldTcpNoDelay = tcpNoDelay;
        tcpNoDelay = newTcpNoDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY, oldTcpNoDelay, tcpNoDelay));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE, oldKeepAlive, keepAlive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                return getTextline();
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                return getTcpNoDelay();
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
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
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                setTextline((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                setTcpNoDelay((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
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
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                setTextline(TEXTLINE_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                setTcpNoDelay(TCP_NO_DELAY_EDEFAULT);
                return;
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
                setKeepAlive(KEEP_ALIVE_EDEFAULT);
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
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE:
                return TEXTLINE_EDEFAULT == null ? textline != null : !TEXTLINE_EDEFAULT.equals(textline);
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY:
                return TCP_NO_DELAY_EDEFAULT == null ? tcpNoDelay != null : !TCP_NO_DELAY_EDEFAULT.equals(tcpNoDelay);
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE:
                return keepAlive != KEEP_ALIVE_EDEFAULT;
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
        result.append(textline);
        result.append(", tcpNoDelay: ");
        result.append(tcpNoDelay);
        result.append(", keepAlive: ");
        result.append(keepAlive);
        result.append(')');
        return result.toString();
    }

} //CamelNettyTcpBindingTypeImpl
