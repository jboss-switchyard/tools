/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType;
import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getEndpointAddress <em>Endpoint Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getInInterceptors <em>In Interceptors</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getOutInterceptors <em>Out Interceptors</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getMtom <em>Mtom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getEndpointConfig <em>Endpoint Config</em>}</li>
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
     * The default value of the '{@link #getEndpointAddress() <em>Endpoint Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointAddress()
     * @generated
     * @ordered
     */
    protected static final String ENDPOINT_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndpointAddress() <em>Endpoint Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointAddress()
     * @generated
     * @ordered
     */
    protected String endpointAddress = ENDPOINT_ADDRESS_EDEFAULT;

    /**
     * The cached value of the '{@link #getInInterceptors() <em>In Interceptors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInInterceptors()
     * @generated
     * @ordered
     */
    protected InterceptorsType inInterceptors;

    /**
     * The cached value of the '{@link #getOutInterceptors() <em>Out Interceptors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutInterceptors()
     * @generated
     * @ordered
     */
    protected InterceptorsType outInterceptors;

    /**
     * The cached value of the '{@link #getMtom() <em>Mtom</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMtom()
     * @generated
     * @ordered
     */
    protected MtomType mtom;

    /**
     * The cached value of the '{@link #getEndpointConfig() <em>Endpoint Config</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointConfig()
     * @generated
     * @ordered
     */
    protected EndpointConfigType endpointConfig;

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
    public String getEndpointAddress() {
        return endpointAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndpointAddress(String newEndpointAddress) {
        String oldEndpointAddress = endpointAddress;
        endpointAddress = newEndpointAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS, oldEndpointAddress, endpointAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterceptorsType getInInterceptors() {
        return inInterceptors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInInterceptors(InterceptorsType newInInterceptors, NotificationChain msgs) {
        InterceptorsType oldInInterceptors = inInterceptors;
        inInterceptors = newInInterceptors;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, oldInInterceptors, newInInterceptors);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInInterceptors(InterceptorsType newInInterceptors) {
        if (newInInterceptors != inInterceptors) {
            NotificationChain msgs = null;
            if (inInterceptors != null)
                msgs = ((InternalEObject)inInterceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, null, msgs);
            if (newInInterceptors != null)
                msgs = ((InternalEObject)newInInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, null, msgs);
            msgs = basicSetInInterceptors(newInInterceptors, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, newInInterceptors, newInInterceptors));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterceptorsType getOutInterceptors() {
        return outInterceptors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutInterceptors(InterceptorsType newOutInterceptors, NotificationChain msgs) {
        InterceptorsType oldOutInterceptors = outInterceptors;
        outInterceptors = newOutInterceptors;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, oldOutInterceptors, newOutInterceptors);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutInterceptors(InterceptorsType newOutInterceptors) {
        if (newOutInterceptors != outInterceptors) {
            NotificationChain msgs = null;
            if (outInterceptors != null)
                msgs = ((InternalEObject)outInterceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, null, msgs);
            if (newOutInterceptors != null)
                msgs = ((InternalEObject)newOutInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, null, msgs);
            msgs = basicSetOutInterceptors(newOutInterceptors, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, newOutInterceptors, newOutInterceptors));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MtomType getMtom() {
        return mtom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMtom(MtomType newMtom, NotificationChain msgs) {
        MtomType oldMtom = mtom;
        mtom = newMtom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__MTOM, oldMtom, newMtom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMtom(MtomType newMtom) {
        if (newMtom != mtom) {
            NotificationChain msgs = null;
            if (mtom != null)
                msgs = ((InternalEObject)mtom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__MTOM, null, msgs);
            if (newMtom != null)
                msgs = ((InternalEObject)newMtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__MTOM, null, msgs);
            msgs = basicSetMtom(newMtom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__MTOM, newMtom, newMtom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndpointConfigType getEndpointConfig() {
        return endpointConfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndpointConfig(EndpointConfigType newEndpointConfig, NotificationChain msgs) {
        EndpointConfigType oldEndpointConfig = endpointConfig;
        endpointConfig = newEndpointConfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, oldEndpointConfig, newEndpointConfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndpointConfig(EndpointConfigType newEndpointConfig) {
        if (newEndpointConfig != endpointConfig) {
            NotificationChain msgs = null;
            if (endpointConfig != null)
                msgs = ((InternalEObject)endpointConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, null, msgs);
            if (newEndpointConfig != null)
                msgs = ((InternalEObject)newEndpointConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, null, msgs);
            msgs = basicSetEndpointConfig(newEndpointConfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, newEndpointConfig, newEndpointConfig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                return basicSetInInterceptors(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                return basicSetOutInterceptors(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                return basicSetMtom(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                return basicSetEndpointConfig(null, msgs);
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
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                return getWsdl();
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                return getWsdlPort();
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                return getSocketAddr();
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                return getContextPath();
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                return getEndpointAddress();
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                return getInInterceptors();
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                return getOutInterceptors();
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                return getMtom();
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                return getEndpointConfig();
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
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                setEndpointAddress((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                setInInterceptors((InterceptorsType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                setOutInterceptors((InterceptorsType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                setMtom((MtomType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                setEndpointConfig((EndpointConfigType)newValue);
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
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                setEndpointAddress(ENDPOINT_ADDRESS_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                setInInterceptors((InterceptorsType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                setOutInterceptors((InterceptorsType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                setMtom((MtomType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                setEndpointConfig((EndpointConfigType)null);
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
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                return ENDPOINT_ADDRESS_EDEFAULT == null ? endpointAddress != null : !ENDPOINT_ADDRESS_EDEFAULT.equals(endpointAddress);
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                return inInterceptors != null;
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                return outInterceptors != null;
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                return mtom != null;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                return endpointConfig != null;
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
        result.append(", endpointAddress: ");
        result.append(endpointAddress);
        result.append(')');
        return result.toString();
    }

} //SOAPBindingTypeImpl
