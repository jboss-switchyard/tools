/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

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

import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl#getBindingSoap <em>Binding Soap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl#getContextMapperSoap <em>Context Mapper Soap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl#getMessageComposerSoap <em>Message Composer Soap</em>}</li>
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
        return SOAPPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, SOAPPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SOAPPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SOAPPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPBindingType getBindingSoap() {
        return (SOAPBindingType)getMixed().get(SOAPPackage.Literals.DOCUMENT_ROOT__BINDING_SOAP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingSoap(SOAPBindingType newBindingSoap, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SOAPPackage.Literals.DOCUMENT_ROOT__BINDING_SOAP, newBindingSoap, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingSoap(SOAPBindingType newBindingSoap) {
        ((FeatureMap.Internal)getMixed()).set(SOAPPackage.Literals.DOCUMENT_ROOT__BINDING_SOAP, newBindingSoap);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getContextMapperSoap() {
        return (ContextMapperType)getMixed().get(SOAPPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapperSoap(ContextMapperType newContextMapperSoap, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SOAPPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP, newContextMapperSoap, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapperSoap(ContextMapperType newContextMapperSoap) {
        ((FeatureMap.Internal)getMixed()).set(SOAPPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP, newContextMapperSoap);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPMessageComposerType getMessageComposerSoap() {
        return (SOAPMessageComposerType)getMixed().get(SOAPPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposerSoap(SOAPMessageComposerType newMessageComposerSoap, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SOAPPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP, newMessageComposerSoap, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposerSoap(SOAPMessageComposerType newMessageComposerSoap) {
        ((FeatureMap.Internal)getMixed()).set(SOAPPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP, newMessageComposerSoap);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SOAPPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case SOAPPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case SOAPPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case SOAPPackage.DOCUMENT_ROOT__BINDING_SOAP:
                return basicSetBindingSoap(null, msgs);
            case SOAPPackage.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP:
                return basicSetContextMapperSoap(null, msgs);
            case SOAPPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP:
                return basicSetMessageComposerSoap(null, msgs);
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
            case SOAPPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case SOAPPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case SOAPPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case SOAPPackage.DOCUMENT_ROOT__BINDING_SOAP:
                return getBindingSoap();
            case SOAPPackage.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP:
                return getContextMapperSoap();
            case SOAPPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP:
                return getMessageComposerSoap();
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
            case SOAPPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case SOAPPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case SOAPPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case SOAPPackage.DOCUMENT_ROOT__BINDING_SOAP:
                setBindingSoap((SOAPBindingType)newValue);
                return;
            case SOAPPackage.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP:
                setContextMapperSoap((ContextMapperType)newValue);
                return;
            case SOAPPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP:
                setMessageComposerSoap((SOAPMessageComposerType)newValue);
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
            case SOAPPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case SOAPPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case SOAPPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case SOAPPackage.DOCUMENT_ROOT__BINDING_SOAP:
                setBindingSoap((SOAPBindingType)null);
                return;
            case SOAPPackage.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP:
                setContextMapperSoap((ContextMapperType)null);
                return;
            case SOAPPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP:
                setMessageComposerSoap((SOAPMessageComposerType)null);
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
            case SOAPPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case SOAPPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case SOAPPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case SOAPPackage.DOCUMENT_ROOT__BINDING_SOAP:
                return getBindingSoap() != null;
            case SOAPPackage.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP:
                return getContextMapperSoap() != null;
            case SOAPPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP:
                return getMessageComposerSoap() != null;
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
