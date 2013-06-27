/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.http.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.http.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpContextMapperType;
import org.switchyard.tools.models.switchyard1_0.http.HttpMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.http.ProxyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getBindingHTTP <em>Binding HTTP</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getNtlm <em>Ntlm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * The cached value of the '{@link #getBasic() <em>Basic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasic()
     * @generated
     * @ordered
     */
    protected BasicAuthenticationType basic;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HttpPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, HttpPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, HttpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, HttpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpBindingType getBindingHTTP() {
        return (HttpBindingType)getMixed().get(HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingHTTP(HttpBindingType newBindingHTTP, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP, newBindingHTTP, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingHTTP(HttpBindingType newBindingHTTP) {
        ((FeatureMap.Internal)getMixed()).set(HttpPackage.Literals.DOCUMENT_ROOT__BINDING_HTTP, newBindingHTTP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpContextMapperType getContextMapper() {
        return (HttpContextMapperType)getMixed().get(HttpPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapper(HttpContextMapperType newContextMapper, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(HttpPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, newContextMapper, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(HttpContextMapperType newContextMapper) {
        ((FeatureMap.Internal)getMixed()).set(HttpPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, newContextMapper);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpMessageComposerType getMessageComposer() {
        return (HttpMessageComposerType)getMixed().get(HttpPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposer(HttpMessageComposerType newMessageComposer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(HttpPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, newMessageComposer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(HttpMessageComposerType newMessageComposer) {
        ((FeatureMap.Internal)getMixed()).set(HttpPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, newMessageComposer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicAuthenticationType getBasic() {
        if (basic != null && basic.eIsProxy()) {
            InternalEObject oldBasic = (InternalEObject)basic;
            basic = (BasicAuthenticationType)eResolveProxy(oldBasic);
            if (basic != oldBasic) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, HttpPackage.DOCUMENT_ROOT__BASIC, oldBasic, basic));
            }
        }
        return basic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicAuthenticationType basicGetBasic() {
        return basic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBasic(BasicAuthenticationType newBasic) {
        BasicAuthenticationType oldBasic = basic;
        basic = newBasic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.DOCUMENT_ROOT__BASIC, oldBasic, basic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NTLMAuthenticationType getNtlm() {
        return (NTLMAuthenticationType)getMixed().get(HttpPackage.Literals.DOCUMENT_ROOT__NTLM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNtlm(NTLMAuthenticationType newNtlm, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(HttpPackage.Literals.DOCUMENT_ROOT__NTLM, newNtlm, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNtlm(NTLMAuthenticationType newNtlm) {
        ((FeatureMap.Internal)getMixed()).set(HttpPackage.Literals.DOCUMENT_ROOT__NTLM, newNtlm);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProxyType getProxy() {
        return (ProxyType)getMixed().get(HttpPackage.Literals.DOCUMENT_ROOT__PROXY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProxy(ProxyType newProxy, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(HttpPackage.Literals.DOCUMENT_ROOT__PROXY, newProxy, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProxy(ProxyType newProxy) {
        ((FeatureMap.Internal)getMixed()).set(HttpPackage.Literals.DOCUMENT_ROOT__PROXY, newProxy);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HttpPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case HttpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case HttpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case HttpPackage.DOCUMENT_ROOT__BINDING_HTTP:
                return basicSetBindingHTTP(null, msgs);
            case HttpPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case HttpPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case HttpPackage.DOCUMENT_ROOT__NTLM:
                return basicSetNtlm(null, msgs);
            case HttpPackage.DOCUMENT_ROOT__PROXY:
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
            case HttpPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case HttpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case HttpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case HttpPackage.DOCUMENT_ROOT__BINDING_HTTP:
                return getBindingHTTP();
            case HttpPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return getContextMapper();
            case HttpPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return getMessageComposer();
            case HttpPackage.DOCUMENT_ROOT__BASIC:
                if (resolve) return getBasic();
                return basicGetBasic();
            case HttpPackage.DOCUMENT_ROOT__NTLM:
                return getNtlm();
            case HttpPackage.DOCUMENT_ROOT__PROXY:
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
            case HttpPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__BINDING_HTTP:
                setBindingHTTP((HttpBindingType)newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                setContextMapper((HttpContextMapperType)newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                setMessageComposer((HttpMessageComposerType)newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__BASIC:
                setBasic((BasicAuthenticationType)newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__NTLM:
                setNtlm((NTLMAuthenticationType)newValue);
                return;
            case HttpPackage.DOCUMENT_ROOT__PROXY:
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
            case HttpPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case HttpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case HttpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case HttpPackage.DOCUMENT_ROOT__BINDING_HTTP:
                setBindingHTTP((HttpBindingType)null);
                return;
            case HttpPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                setContextMapper((HttpContextMapperType)null);
                return;
            case HttpPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                setMessageComposer((HttpMessageComposerType)null);
                return;
            case HttpPackage.DOCUMENT_ROOT__BASIC:
                setBasic((BasicAuthenticationType)null);
                return;
            case HttpPackage.DOCUMENT_ROOT__NTLM:
                setNtlm((NTLMAuthenticationType)null);
                return;
            case HttpPackage.DOCUMENT_ROOT__PROXY:
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
            case HttpPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case HttpPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case HttpPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case HttpPackage.DOCUMENT_ROOT__BINDING_HTTP:
                return getBindingHTTP() != null;
            case HttpPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return getContextMapper() != null;
            case HttpPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return getMessageComposer() != null;
            case HttpPackage.DOCUMENT_ROOT__BASIC:
                return basic != null;
            case HttpPackage.DOCUMENT_ROOT__NTLM:
                return getNtlm() != null;
            case HttpPackage.DOCUMENT_ROOT__PROXY:
                return getProxy() != null;
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
