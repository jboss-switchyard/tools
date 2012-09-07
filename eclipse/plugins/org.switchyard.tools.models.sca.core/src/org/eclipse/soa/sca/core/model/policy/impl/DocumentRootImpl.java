/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy.impl;

import java.util.List;

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

import org.eclipse.soa.sca.core.model.policy.AppliesToType;
import org.eclipse.soa.sca.core.model.policy.DocumentRoot;
import org.eclipse.soa.sca.core.model.policy.OperatorContentType;
import org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType;
import org.eclipse.soa.sca.core.model.policy.PolicyPackage;
import org.eclipse.soa.sca.core.model.policy.PolicyReferenceType;
import org.eclipse.soa.sca.core.model.policy.PolicyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getPolicyAttachment <em>Policy Attachment</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl#getPolicyURIs <em>Policy UR Is</em>}</li>
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
     * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isOptional()
     * @generated
     * @ordered
     */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isOptional()
     * @generated
     * @ordered
     */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
     * This is true if the Optional attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean optionalESet;

	/**
     * The default value of the '{@link #getPolicyURIs() <em>Policy UR Is</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPolicyURIs()
     * @generated
     * @ordered
     */
	protected static final List<String> POLICY_UR_IS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPolicyURIs() <em>Policy UR Is</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPolicyURIs()
     * @generated
     * @ordered
     */
	protected List<String> policyURIs = POLICY_UR_IS_EDEFAULT;

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
        return PolicyPackage.Literals.DOCUMENT_ROOT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, PolicyPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperatorContentType getAll() {
        return (OperatorContentType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__ALL, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAll(OperatorContentType newAll, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__ALL, newAll, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAll(OperatorContentType newAll) {
        ((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__ALL, newAll);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AppliesToType getAppliesTo() {
        return (AppliesToType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAppliesTo(AppliesToType newAppliesTo, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO, newAppliesTo, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAppliesTo(AppliesToType newAppliesTo) {
        ((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__APPLIES_TO, newAppliesTo);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperatorContentType getExactlyOne() {
        return (OperatorContentType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExactlyOne(OperatorContentType newExactlyOne, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, newExactlyOne, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExactlyOne(OperatorContentType newExactlyOne) {
        ((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__EXACTLY_ONE, newExactlyOne);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyType getPolicy() {
        return (PolicyType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPolicy(PolicyType newPolicy, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY, newPolicy, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicy(PolicyType newPolicy) {
        ((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY, newPolicy);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyAttachmentType getPolicyAttachment() {
        return (PolicyAttachmentType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPolicyAttachment(PolicyAttachmentType newPolicyAttachment, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT, newPolicyAttachment, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicyAttachment(PolicyAttachmentType newPolicyAttachment) {
        ((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_ATTACHMENT, newPolicyAttachment);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyReferenceType getPolicyReference() {
        return (PolicyReferenceType)getMixed().get(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPolicyReference(PolicyReferenceType newPolicyReference, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE, newPolicyReference, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicyReference(PolicyReferenceType newPolicyReference) {
        ((FeatureMap.Internal)getMixed()).set(PolicyPackage.Literals.DOCUMENT_ROOT__POLICY_REFERENCE, newPolicyReference);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isOptional() {
        return optional;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOptional(boolean newOptional) {
        boolean oldOptional = optional;
        optional = newOptional;
        boolean oldOptionalESet = optionalESet;
        optionalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.DOCUMENT_ROOT__OPTIONAL, oldOptional, optional, !oldOptionalESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetOptional() {
        boolean oldOptional = optional;
        boolean oldOptionalESet = optionalESet;
        optional = OPTIONAL_EDEFAULT;
        optionalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PolicyPackage.DOCUMENT_ROOT__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetOptional() {
        return optionalESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<String> getPolicyURIs() {
        return policyURIs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicyURIs(List<String> newPolicyURIs) {
        List<String> oldPolicyURIs = policyURIs;
        policyURIs = newPolicyURIs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS, oldPolicyURIs, policyURIs));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PolicyPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case PolicyPackage.DOCUMENT_ROOT__ALL:
                return basicSetAll(null, msgs);
            case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
                return basicSetAppliesTo(null, msgs);
            case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
                return basicSetExactlyOne(null, msgs);
            case PolicyPackage.DOCUMENT_ROOT__POLICY:
                return basicSetPolicy(null, msgs);
            case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
                return basicSetPolicyAttachment(null, msgs);
            case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
                return basicSetPolicyReference(null, msgs);
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
            case PolicyPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case PolicyPackage.DOCUMENT_ROOT__ALL:
                return getAll();
            case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
                return getAppliesTo();
            case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
                return getExactlyOne();
            case PolicyPackage.DOCUMENT_ROOT__POLICY:
                return getPolicy();
            case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
                return getPolicyAttachment();
            case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
                return getPolicyReference();
            case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
                return isOptional();
            case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
                return getPolicyURIs();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PolicyPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__ALL:
                setAll((OperatorContentType)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
                setAppliesTo((AppliesToType)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
                setExactlyOne((OperatorContentType)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY:
                setPolicy((PolicyType)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
                setPolicyAttachment((PolicyAttachmentType)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
                setPolicyReference((PolicyReferenceType)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
                setOptional((Boolean)newValue);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
                setPolicyURIs((List<String>)newValue);
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
            case PolicyPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case PolicyPackage.DOCUMENT_ROOT__ALL:
                setAll((OperatorContentType)null);
                return;
            case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
                setAppliesTo((AppliesToType)null);
                return;
            case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
                setExactlyOne((OperatorContentType)null);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY:
                setPolicy((PolicyType)null);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
                setPolicyAttachment((PolicyAttachmentType)null);
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
                setPolicyReference((PolicyReferenceType)null);
                return;
            case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
                unsetOptional();
                return;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
                setPolicyURIs(POLICY_UR_IS_EDEFAULT);
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
            case PolicyPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case PolicyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case PolicyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case PolicyPackage.DOCUMENT_ROOT__ALL:
                return getAll() != null;
            case PolicyPackage.DOCUMENT_ROOT__APPLIES_TO:
                return getAppliesTo() != null;
            case PolicyPackage.DOCUMENT_ROOT__EXACTLY_ONE:
                return getExactlyOne() != null;
            case PolicyPackage.DOCUMENT_ROOT__POLICY:
                return getPolicy() != null;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_ATTACHMENT:
                return getPolicyAttachment() != null;
            case PolicyPackage.DOCUMENT_ROOT__POLICY_REFERENCE:
                return getPolicyReference() != null;
            case PolicyPackage.DOCUMENT_ROOT__OPTIONAL:
                return isSetOptional();
            case PolicyPackage.DOCUMENT_ROOT__POLICY_UR_IS:
                return POLICY_UR_IS_EDEFAULT == null ? policyURIs != null : !POLICY_UR_IS_EDEFAULT.equals(policyURIs);
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
        result.append(", optional: ");
        if (optionalESet) result.append(optional); else result.append("<unset>");
        result.append(", policyURIs: ");
        result.append(policyURIs);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
