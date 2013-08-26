/**
 */
package org.switchyard.tools.models.switchyard1_0.http.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.http.ProxyType;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getNtlm <em>Ntlm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HTTPBindingTypeImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HTTPBindingTypeImpl extends SwitchYardBindingTypeImpl implements HTTPBindingType {
    /**
     * The cached value of the '{@link #getContextMapper() <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextMapper()
     * @generated
     * @ordered
     */
    protected ContextMapperType contextMapper;

    /**
     * The cached value of the '{@link #getMessageComposer() <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageComposer()
     * @generated
     * @ordered
     */
    protected MessageComposerType messageComposer;

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
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected static final String METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected String method = METHOD_EDEFAULT;

    /**
     * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContentType()
     * @generated
     * @ordered
     */
    protected static final String CONTENT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContentType()
     * @generated
     * @ordered
     */
    protected String contentType = CONTENT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected static final Object TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected Object timeout = TIMEOUT_EDEFAULT;

    /**
     * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasic()
     * @generated
     * @ordered
     */
    protected BasicAuthenticationType basic;

    /**
     * The cached value of the '{@link #getNtlm() <em>Ntlm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNtlm()
     * @generated
     * @ordered
     */
    protected NTLMAuthenticationType ntlm;

    /**
     * The cached value of the '{@link #getProxy() <em>Proxy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProxy()
     * @generated
     * @ordered
     */
    protected ProxyType proxy;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HTTPBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HttpPackage.Literals.HTTP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getContextMapper() {
        return contextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapper(ContextMapperType newContextMapper, NotificationChain msgs) {
        ContextMapperType oldContextMapper = contextMapper;
        contextMapper = newContextMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER, oldContextMapper, newContextMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(ContextMapperType newContextMapper) {
        if (newContextMapper != contextMapper) {
            NotificationChain msgs = null;
            if (contextMapper != null)
                msgs = ((InternalEObject)contextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            if (newContextMapper != null)
                msgs = ((InternalEObject)newContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            msgs = basicSetContextMapper(newContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER, newContextMapper, newContextMapper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType getMessageComposer() {
        return messageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposer(MessageComposerType newMessageComposer, NotificationChain msgs) {
        MessageComposerType oldMessageComposer = messageComposer;
        messageComposer = newMessageComposer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER, oldMessageComposer, newMessageComposer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(MessageComposerType newMessageComposer) {
        if (newMessageComposer != messageComposer) {
            NotificationChain msgs = null;
            if (messageComposer != null)
                msgs = ((InternalEObject)messageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            if (newMessageComposer != null)
                msgs = ((InternalEObject)newMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetMessageComposer(newMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER, newMessageComposer, newMessageComposer));
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
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        String oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__ADDRESS, oldAddress, address));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMethod() {
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMethod(String newMethod) {
        String oldMethod = method;
        method = newMethod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__METHOD, oldMethod, method));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContentType(String newContentType) {
        String oldContentType = contentType;
        contentType = newContentType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE, oldContentType, contentType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTimeout() {
        return timeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeout(Object newTimeout) {
        Object oldTimeout = timeout;
        timeout = newTimeout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__TIMEOUT, oldTimeout, timeout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicAuthenticationType getBasic() {
        return basic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBasic(BasicAuthenticationType newBasic, NotificationChain msgs) {
        BasicAuthenticationType oldBasic = basic;
        basic = newBasic;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__BASIC, oldBasic, newBasic);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBasic(BasicAuthenticationType newBasic) {
        if (newBasic != basic) {
            NotificationChain msgs = null;
            if (basic != null)
                msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__BASIC, null, msgs);
            if (newBasic != null)
                msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__BASIC, null, msgs);
            msgs = basicSetBasic(newBasic, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__BASIC, newBasic, newBasic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NTLMAuthenticationType getNtlm() {
        return ntlm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNtlm(NTLMAuthenticationType newNtlm, NotificationChain msgs) {
        NTLMAuthenticationType oldNtlm = ntlm;
        ntlm = newNtlm;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__NTLM, oldNtlm, newNtlm);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNtlm(NTLMAuthenticationType newNtlm) {
        if (newNtlm != ntlm) {
            NotificationChain msgs = null;
            if (ntlm != null)
                msgs = ((InternalEObject)ntlm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__NTLM, null, msgs);
            if (newNtlm != null)
                msgs = ((InternalEObject)newNtlm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__NTLM, null, msgs);
            msgs = basicSetNtlm(newNtlm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__NTLM, newNtlm, newNtlm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProxyType getProxy() {
        return proxy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProxy(ProxyType newProxy, NotificationChain msgs) {
        ProxyType oldProxy = proxy;
        proxy = newProxy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__PROXY, oldProxy, newProxy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProxy(ProxyType newProxy) {
        if (newProxy != proxy) {
            NotificationChain msgs = null;
            if (proxy != null)
                msgs = ((InternalEObject)proxy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__PROXY, null, msgs);
            if (newProxy != null)
                msgs = ((InternalEObject)newProxy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__PROXY, null, msgs);
            msgs = basicSetProxy(newProxy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__PROXY, newProxy, newProxy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case HttpPackage.HTTP_BINDING_TYPE__BASIC:
                return basicSetBasic(null, msgs);
            case HttpPackage.HTTP_BINDING_TYPE__NTLM:
                return basicSetNtlm(null, msgs);
            case HttpPackage.HTTP_BINDING_TYPE__PROXY:
                return basicSetProxy(null, msgs);
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER:
                return getContextMapper();
            case HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER:
                return getMessageComposer();
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                return getContextPath();
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                return getAddress();
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                return getMethod();
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                return getContentType();
            case HttpPackage.HTTP_BINDING_TYPE__TIMEOUT:
                return getTimeout();
            case HttpPackage.HTTP_BINDING_TYPE__BASIC:
                return getBasic();
            case HttpPackage.HTTP_BINDING_TYPE__NTLM:
                return getNtlm();
            case HttpPackage.HTTP_BINDING_TYPE__PROXY:
                return getProxy();
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                setMethod((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                setContentType((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__TIMEOUT:
                setTimeout(newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__BASIC:
                setBasic((BasicAuthenticationType)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__NTLM:
                setNtlm((NTLMAuthenticationType)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__PROXY:
                setProxy((ProxyType)newValue);
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)null);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                setMethod(METHOD_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                setContentType(CONTENT_TYPE_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__TIMEOUT:
                setTimeout(TIMEOUT_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__BASIC:
                setBasic((BasicAuthenticationType)null);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__NTLM:
                setNtlm((NTLMAuthenticationType)null);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__PROXY:
                setProxy((ProxyType)null);
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER:
                return contextMapper != null;
            case HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER:
                return messageComposer != null;
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
            case HttpPackage.HTTP_BINDING_TYPE__TIMEOUT:
                return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
            case HttpPackage.HTTP_BINDING_TYPE__BASIC:
                return basic != null;
            case HttpPackage.HTTP_BINDING_TYPE__NTLM:
                return ntlm != null;
            case HttpPackage.HTTP_BINDING_TYPE__PROXY:
                return proxy != null;
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
        result.append(" (contextPath: ");
        result.append(contextPath);
        result.append(", address: ");
        result.append(address);
        result.append(", method: ");
        result.append(method);
        result.append(", contentType: ");
        result.append(contentType);
        result.append(", timeout: ");
        result.append(timeout);
        result.append(')');
        return result.toString();
    }

} //HTTPBindingTypeImpl
