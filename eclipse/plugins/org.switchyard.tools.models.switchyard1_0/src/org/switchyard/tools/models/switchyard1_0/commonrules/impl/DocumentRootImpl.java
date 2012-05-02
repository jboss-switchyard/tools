/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules.impl;

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

import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getImplementationCommonRules <em>Implementation Common Rules</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getAudit1 <em>Audit1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl#getImplementationCommonRules1 <em>Implementation Common Rules1</em>}</li>
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
	 * The default value of the '{@link #getAudit() <em>Audit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudit()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUDIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImplementationCommonRules() <em>Implementation Common Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationCommonRules()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMPLEMENTATION_COMMON_RULES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAudit1() <em>Audit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudit1()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUDIT1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImplementationCommonRules1() <em>Implementation Common Rules1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationCommonRules1()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMPLEMENTATION_COMMON_RULES1_EDEFAULT = null;

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
		return CommonRulesPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CommonRulesPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CommonRulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CommonRulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAudit() {
		return getMixed().get(CommonRulesPackage.Literals.DOCUMENT_ROOT__AUDIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudit(Object newAudit) {
		((FeatureMap.Internal)getMixed()).set(CommonRulesPackage.Literals.DOCUMENT_ROOT__AUDIT, newAudit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImplementationCommonRules() {
		return getMixed().get(CommonRulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationCommonRules(Object newImplementationCommonRules) {
		((FeatureMap.Internal)getMixed()).set(CommonRulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES, newImplementationCommonRules);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAudit1() {
		return getMixed().get(CommonRulesPackage.Literals.DOCUMENT_ROOT__AUDIT1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudit1(Object newAudit1) {
		((FeatureMap.Internal)getMixed()).set(CommonRulesPackage.Literals.DOCUMENT_ROOT__AUDIT1, newAudit1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImplementationCommonRules1() {
		return getMixed().get(CommonRulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationCommonRules1(Object newImplementationCommonRules1) {
		((FeatureMap.Internal)getMixed()).set(CommonRulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES1, newImplementationCommonRules1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonRulesPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CommonRulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CommonRulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
			case CommonRulesPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CommonRulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CommonRulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT:
				return getAudit();
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES:
				return getImplementationCommonRules();
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT1:
				return getAudit1();
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES1:
				return getImplementationCommonRules1();
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
			case CommonRulesPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT:
				setAudit(newValue);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES:
				setImplementationCommonRules(newValue);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT1:
				setAudit1(newValue);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES1:
				setImplementationCommonRules1(newValue);
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
			case CommonRulesPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT:
				setAudit(AUDIT_EDEFAULT);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES:
				setImplementationCommonRules(IMPLEMENTATION_COMMON_RULES_EDEFAULT);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT1:
				setAudit1(AUDIT1_EDEFAULT);
				return;
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES1:
				setImplementationCommonRules1(IMPLEMENTATION_COMMON_RULES1_EDEFAULT);
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
			case CommonRulesPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CommonRulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CommonRulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT:
				return AUDIT_EDEFAULT == null ? getAudit() != null : !AUDIT_EDEFAULT.equals(getAudit());
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES:
				return IMPLEMENTATION_COMMON_RULES_EDEFAULT == null ? getImplementationCommonRules() != null : !IMPLEMENTATION_COMMON_RULES_EDEFAULT.equals(getImplementationCommonRules());
			case CommonRulesPackage.DOCUMENT_ROOT__AUDIT1:
				return AUDIT1_EDEFAULT == null ? getAudit1() != null : !AUDIT1_EDEFAULT.equals(getAudit1());
			case CommonRulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES1:
				return IMPLEMENTATION_COMMON_RULES1_EDEFAULT == null ? getImplementationCommonRules1() != null : !IMPLEMENTATION_COMMON_RULES1_EDEFAULT.equals(getImplementationCommonRules1());
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
