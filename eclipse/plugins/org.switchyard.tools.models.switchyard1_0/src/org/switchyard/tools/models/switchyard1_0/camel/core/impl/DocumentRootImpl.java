/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

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
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getBindingDirect <em>Binding Direct</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getBindingMock <em>Binding Mock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getBindingSeda <em>Binding Seda</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getBindingTimer <em>Binding Timer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl#getBindingUri <em>Binding Uri</em>}</li>
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
        return CorePackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, CorePackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelDirectBindingType getBindingDirect() {
        return (CamelDirectBindingType)getMixed().get(CorePackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingDirect(CamelDirectBindingType newBindingDirect, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT, newBindingDirect, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingDirect(CamelDirectBindingType newBindingDirect) {
        ((FeatureMap.Internal)getMixed()).set(CorePackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT, newBindingDirect);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMockBindingType getBindingMock() {
        return (CamelMockBindingType)getMixed().get(CorePackage.Literals.DOCUMENT_ROOT__BINDING_MOCK, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingMock(CamelMockBindingType newBindingMock, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.Literals.DOCUMENT_ROOT__BINDING_MOCK, newBindingMock, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingMock(CamelMockBindingType newBindingMock) {
        ((FeatureMap.Internal)getMixed()).set(CorePackage.Literals.DOCUMENT_ROOT__BINDING_MOCK, newBindingMock);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSedaBindingType getBindingSeda() {
        return (CamelSedaBindingType)getMixed().get(CorePackage.Literals.DOCUMENT_ROOT__BINDING_SEDA, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingSeda(CamelSedaBindingType newBindingSeda, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.Literals.DOCUMENT_ROOT__BINDING_SEDA, newBindingSeda, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingSeda(CamelSedaBindingType newBindingSeda) {
        ((FeatureMap.Internal)getMixed()).set(CorePackage.Literals.DOCUMENT_ROOT__BINDING_SEDA, newBindingSeda);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelTimerBindingType getBindingTimer() {
        return (CamelTimerBindingType)getMixed().get(CorePackage.Literals.DOCUMENT_ROOT__BINDING_TIMER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingTimer(CamelTimerBindingType newBindingTimer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.Literals.DOCUMENT_ROOT__BINDING_TIMER, newBindingTimer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingTimer(CamelTimerBindingType newBindingTimer) {
        ((FeatureMap.Internal)getMixed()).set(CorePackage.Literals.DOCUMENT_ROOT__BINDING_TIMER, newBindingTimer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelBindingType getBindingUri() {
        return (CamelBindingType)getMixed().get(CorePackage.Literals.DOCUMENT_ROOT__BINDING_URI, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingUri(CamelBindingType newBindingUri, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.Literals.DOCUMENT_ROOT__BINDING_URI, newBindingUri, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingUri(CamelBindingType newBindingUri) {
        ((FeatureMap.Internal)getMixed()).set(CorePackage.Literals.DOCUMENT_ROOT__BINDING_URI, newBindingUri);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CorePackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case CorePackage.DOCUMENT_ROOT__BINDING_DIRECT:
                return basicSetBindingDirect(null, msgs);
            case CorePackage.DOCUMENT_ROOT__BINDING_MOCK:
                return basicSetBindingMock(null, msgs);
            case CorePackage.DOCUMENT_ROOT__BINDING_SEDA:
                return basicSetBindingSeda(null, msgs);
            case CorePackage.DOCUMENT_ROOT__BINDING_TIMER:
                return basicSetBindingTimer(null, msgs);
            case CorePackage.DOCUMENT_ROOT__BINDING_URI:
                return basicSetBindingUri(null, msgs);
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
            case CorePackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case CorePackage.DOCUMENT_ROOT__BINDING_DIRECT:
                return getBindingDirect();
            case CorePackage.DOCUMENT_ROOT__BINDING_MOCK:
                return getBindingMock();
            case CorePackage.DOCUMENT_ROOT__BINDING_SEDA:
                return getBindingSeda();
            case CorePackage.DOCUMENT_ROOT__BINDING_TIMER:
                return getBindingTimer();
            case CorePackage.DOCUMENT_ROOT__BINDING_URI:
                return getBindingUri();
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
            case CorePackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_DIRECT:
                setBindingDirect((CamelDirectBindingType)newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_MOCK:
                setBindingMock((CamelMockBindingType)newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_SEDA:
                setBindingSeda((CamelSedaBindingType)newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_TIMER:
                setBindingTimer((CamelTimerBindingType)newValue);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_URI:
                setBindingUri((CamelBindingType)newValue);
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
            case CorePackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_DIRECT:
                setBindingDirect((CamelDirectBindingType)null);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_MOCK:
                setBindingMock((CamelMockBindingType)null);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_SEDA:
                setBindingSeda((CamelSedaBindingType)null);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_TIMER:
                setBindingTimer((CamelTimerBindingType)null);
                return;
            case CorePackage.DOCUMENT_ROOT__BINDING_URI:
                setBindingUri((CamelBindingType)null);
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
            case CorePackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case CorePackage.DOCUMENT_ROOT__BINDING_DIRECT:
                return getBindingDirect() != null;
            case CorePackage.DOCUMENT_ROOT__BINDING_MOCK:
                return getBindingMock() != null;
            case CorePackage.DOCUMENT_ROOT__BINDING_SEDA:
                return getBindingSeda() != null;
            case CorePackage.DOCUMENT_ROOT__BINDING_TIMER:
                return getBindingTimer() != null;
            case CorePackage.DOCUMENT_ROOT__BINDING_URI:
                return getBindingUri() != null;
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
