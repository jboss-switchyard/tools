/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getWsdl <em>Wsdl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getSocketAddr <em>Socket Addr</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getContextPath <em>Context Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOAPBindingTypeImpl extends SwitchYardBindingTypeImpl implements SOAPBindingType {
	/**
     * The default value of the '{@link #getWsdl() <em>Wsdl</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWsdl()
     * @generated
     * @ordered
     */
	protected static final String WSDL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getWsdl() <em>Wsdl</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWsdl()
     * @generated
     * @ordered
     */
	protected String wsdl = WSDL_EDEFAULT;

	/**
     * The default value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWsdlPort()
     * @generated
     * @ordered
     */
	protected static final String WSDL_PORT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWsdlPort()
     * @generated
     * @ordered
     */
	protected String wsdlPort = WSDL_PORT_EDEFAULT;

	/**
     * The default value of the '{@link #getSocketAddr() <em>Socket Addr</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSocketAddr()
     * @generated
     * @ordered
     */
	protected static final String SOCKET_ADDR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSocketAddr() <em>Socket Addr</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSocketAddr()
     * @generated
     * @ordered
     */
	protected String socketAddr = SOCKET_ADDR_EDEFAULT;

	/**
     * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
	protected static final String CONTEXT_PATH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
	protected String contextPath = CONTEXT_PATH_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SOAPBindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SOAPPackage.Literals.SOAP_BINDING_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getWsdl() {
        return wsdl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWsdl(String newWsdl) {
        String oldWsdl = wsdl;
        wsdl = newWsdl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__WSDL, oldWsdl, wsdl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getWsdlPort() {
        return wsdlPort;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWsdlPort(String newWsdlPort) {
        String oldWsdlPort = wsdlPort;
        wsdlPort = newWsdlPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT, oldWsdlPort, wsdlPort));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSocketAddr() {
        return socketAddr;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSocketAddr(String newSocketAddr) {
        String oldSocketAddr = socketAddr;
        socketAddr = newSocketAddr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR, oldSocketAddr, socketAddr));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getContextPath() {
        return contextPath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setContextPath(String newContextPath) {
        String oldContextPath = contextPath;
        contextPath = newContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                return getWsdl();
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                return getWsdlPort();
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                return getSocketAddr();
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                return getContextPath();
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
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                setWsdl((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                setWsdlPort((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                setSocketAddr((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath((String)newValue);
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
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                setWsdl(WSDL_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                setWsdlPort(WSDL_PORT_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                setSocketAddr(SOCKET_ADDR_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
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
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                return WSDL_EDEFAULT == null ? wsdl != null : !WSDL_EDEFAULT.equals(wsdl);
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                return WSDL_PORT_EDEFAULT == null ? wsdlPort != null : !WSDL_PORT_EDEFAULT.equals(wsdlPort);
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                return SOCKET_ADDR_EDEFAULT == null ? socketAddr != null : !SOCKET_ADDR_EDEFAULT.equals(socketAddr);
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
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
        result.append(" (wsdl: ");
        result.append(wsdl);
        result.append(", wsdlPort: ");
        result.append(wsdlPort);
        result.append(", socketAddr: ");
        result.append(socketAddr);
        result.append(", contextPath: ");
        result.append(contextPath);
        result.append(')');
        return result.toString();
    }

} //SOAPBindingTypeImpl
