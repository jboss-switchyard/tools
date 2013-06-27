/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.resteasy.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.resteasy.ProxyType;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTContextMapperType;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getBindingREST <em>Binding REST</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.DocumentRootImpl#getProxy <em>Proxy</em>}</li>
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
        return ResteasyPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, ResteasyPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ResteasyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ResteasyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTBindingType getBindingREST() {
        return (RESTBindingType)getMixed().get(ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingREST(RESTBindingType newBindingREST, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST, newBindingREST, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingREST(RESTBindingType newBindingREST) {
        ((FeatureMap.Internal)getMixed()).set(ResteasyPackage.Literals.DOCUMENT_ROOT__BINDING_REST, newBindingREST);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTContextMapperType getContextMapper() {
        return (RESTContextMapperType)getMixed().get(ResteasyPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapper(RESTContextMapperType newContextMapper, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ResteasyPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, newContextMapper, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(RESTContextMapperType newContextMapper) {
        ((FeatureMap.Internal)getMixed()).set(ResteasyPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, newContextMapper);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTMessageComposerType getMessageComposer() {
        return (RESTMessageComposerType)getMixed().get(ResteasyPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposer(RESTMessageComposerType newMessageComposer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ResteasyPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, newMessageComposer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(RESTMessageComposerType newMessageComposer) {
        ((FeatureMap.Internal)getMixed()).set(ResteasyPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, newMessageComposer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProxyType getProxy() {
        return (ProxyType)getMixed().get(ResteasyPackage.Literals.DOCUMENT_ROOT__PROXY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProxy(ProxyType newProxy, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(ResteasyPackage.Literals.DOCUMENT_ROOT__PROXY, newProxy, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProxy(ProxyType newProxy) {
        ((FeatureMap.Internal)getMixed()).set(ResteasyPackage.Literals.DOCUMENT_ROOT__PROXY, newProxy);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ResteasyPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case ResteasyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case ResteasyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case ResteasyPackage.DOCUMENT_ROOT__BINDING_REST:
                return basicSetBindingREST(null, msgs);
            case ResteasyPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case ResteasyPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case ResteasyPackage.DOCUMENT_ROOT__PROXY:
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
            case ResteasyPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case ResteasyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case ResteasyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case ResteasyPackage.DOCUMENT_ROOT__BINDING_REST:
                return getBindingREST();
            case ResteasyPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return getContextMapper();
            case ResteasyPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return getMessageComposer();
            case ResteasyPackage.DOCUMENT_ROOT__PROXY:
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
            case ResteasyPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__BINDING_REST:
                setBindingREST((RESTBindingType)newValue);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                setContextMapper((RESTContextMapperType)newValue);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                setMessageComposer((RESTMessageComposerType)newValue);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__PROXY:
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
            case ResteasyPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case ResteasyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case ResteasyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case ResteasyPackage.DOCUMENT_ROOT__BINDING_REST:
                setBindingREST((RESTBindingType)null);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                setContextMapper((RESTContextMapperType)null);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                setMessageComposer((RESTMessageComposerType)null);
                return;
            case ResteasyPackage.DOCUMENT_ROOT__PROXY:
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
            case ResteasyPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case ResteasyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case ResteasyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case ResteasyPackage.DOCUMENT_ROOT__BINDING_REST:
                return getBindingREST() != null;
            case ResteasyPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return getContextMapper() != null;
            case ResteasyPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return getMessageComposer() != null;
            case ResteasyPackage.DOCUMENT_ROOT__PROXY:
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
