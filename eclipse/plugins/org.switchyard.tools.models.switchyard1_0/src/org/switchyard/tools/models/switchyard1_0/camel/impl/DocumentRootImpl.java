/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelContextMapperType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.JmsBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getBindingCamel <em>Binding Camel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getBindingDirect <em>Binding Direct</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getBindingJms <em>Binding Jms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getBindingMock <em>Binding Mock</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getBindingSeda <em>Binding Seda</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl#getBindingTimer <em>Binding Timer</em>}</li>
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
        return CamelPackage.Literals.DOCUMENT_ROOT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, CamelPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CamelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CamelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelBindingType getBindingCamel() {
        return (CamelBindingType)getMixed().get(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_CAMEL, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingCamel(CamelBindingType newBindingCamel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_CAMEL, newBindingCamel, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingCamel(CamelBindingType newBindingCamel) {
        ((FeatureMap.Internal)getMixed()).set(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_CAMEL, newBindingCamel);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelDirectBindingType getBindingDirect() {
        return (CamelDirectBindingType)getMixed().get(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingDirect(CamelDirectBindingType newBindingDirect, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT, newBindingDirect, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingDirect(CamelDirectBindingType newBindingDirect) {
        ((FeatureMap.Internal)getMixed()).set(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT, newBindingDirect);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JmsBindingType getBindingJms() {
        return (JmsBindingType)getMixed().get(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_JMS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingJms(JmsBindingType newBindingJms, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_JMS, newBindingJms, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingJms(JmsBindingType newBindingJms) {
        ((FeatureMap.Internal)getMixed()).set(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_JMS, newBindingJms);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelMockBindingType getBindingMock() {
        return (CamelMockBindingType)getMixed().get(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_MOCK, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingMock(CamelMockBindingType newBindingMock, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_MOCK, newBindingMock, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingMock(CamelMockBindingType newBindingMock) {
        ((FeatureMap.Internal)getMixed()).set(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_MOCK, newBindingMock);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelSedaBindingType getBindingSeda() {
        return (CamelSedaBindingType)getMixed().get(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SEDA, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingSeda(CamelSedaBindingType newBindingSeda, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SEDA, newBindingSeda, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingSeda(CamelSedaBindingType newBindingSeda) {
        ((FeatureMap.Internal)getMixed()).set(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SEDA, newBindingSeda);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelTimerBindingType getBindingTimer() {
        return (CamelTimerBindingType)getMixed().get(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_TIMER, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingTimer(CamelTimerBindingType newBindingTimer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_TIMER, newBindingTimer, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBindingTimer(CamelTimerBindingType newBindingTimer) {
        ((FeatureMap.Internal)getMixed()).set(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_TIMER, newBindingTimer);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case CamelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case CamelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case CamelPackage.DOCUMENT_ROOT__BINDING_CAMEL:
                return basicSetBindingCamel(null, msgs);
            case CamelPackage.DOCUMENT_ROOT__BINDING_DIRECT:
                return basicSetBindingDirect(null, msgs);
            case CamelPackage.DOCUMENT_ROOT__BINDING_JMS:
                return basicSetBindingJms(null, msgs);
            case CamelPackage.DOCUMENT_ROOT__BINDING_MOCK:
                return basicSetBindingMock(null, msgs);
            case CamelPackage.DOCUMENT_ROOT__BINDING_SEDA:
                return basicSetBindingSeda(null, msgs);
            case CamelPackage.DOCUMENT_ROOT__BINDING_TIMER:
                return basicSetBindingTimer(null, msgs);
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
            case CamelPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case CamelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case CamelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case CamelPackage.DOCUMENT_ROOT__BINDING_CAMEL:
                return getBindingCamel();
            case CamelPackage.DOCUMENT_ROOT__BINDING_DIRECT:
                return getBindingDirect();
            case CamelPackage.DOCUMENT_ROOT__BINDING_JMS:
                return getBindingJms();
            case CamelPackage.DOCUMENT_ROOT__BINDING_MOCK:
                return getBindingMock();
            case CamelPackage.DOCUMENT_ROOT__BINDING_SEDA:
                return getBindingSeda();
            case CamelPackage.DOCUMENT_ROOT__BINDING_TIMER:
                return getBindingTimer();
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
            case CamelPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_CAMEL:
                setBindingCamel((CamelBindingType)newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_DIRECT:
                setBindingDirect((CamelDirectBindingType)newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_JMS:
                setBindingJms((JmsBindingType)newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_MOCK:
                setBindingMock((CamelMockBindingType)newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_SEDA:
                setBindingSeda((CamelSedaBindingType)newValue);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_TIMER:
                setBindingTimer((CamelTimerBindingType)newValue);
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
            case CamelPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case CamelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case CamelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_CAMEL:
                setBindingCamel((CamelBindingType)null);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_DIRECT:
                setBindingDirect((CamelDirectBindingType)null);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_JMS:
                setBindingJms((JmsBindingType)null);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_MOCK:
                setBindingMock((CamelMockBindingType)null);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_SEDA:
                setBindingSeda((CamelSedaBindingType)null);
                return;
            case CamelPackage.DOCUMENT_ROOT__BINDING_TIMER:
                setBindingTimer((CamelTimerBindingType)null);
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
            case CamelPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case CamelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case CamelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case CamelPackage.DOCUMENT_ROOT__BINDING_CAMEL:
                return getBindingCamel() != null;
            case CamelPackage.DOCUMENT_ROOT__BINDING_DIRECT:
                return getBindingDirect() != null;
            case CamelPackage.DOCUMENT_ROOT__BINDING_JMS:
                return getBindingJms() != null;
            case CamelPackage.DOCUMENT_ROOT__BINDING_MOCK:
                return getBindingMock() != null;
            case CamelPackage.DOCUMENT_ROOT__BINDING_SEDA:
                return getBindingSeda() != null;
            case CamelPackage.DOCUMENT_ROOT__BINDING_TIMER:
                return getBindingTimer() != null;
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
