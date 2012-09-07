/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.core.model.policy.AppliesToType;
import org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType;
import org.eclipse.soa.sca.core.model.policy.PolicyPackage;
import org.eclipse.soa.sca.core.model.policy.PolicyReferenceType;
import org.eclipse.soa.sca.core.model.policy.PolicyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyAttachmentTypeImpl extends EObjectImpl implements PolicyAttachmentType {
	/**
     * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAppliesTo()
     * @generated
     * @ordered
     */
	protected AppliesToType appliesTo;

	/**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap group;

	/**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
	protected FeatureMap any;

	/**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PolicyAttachmentTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return PolicyPackage.Literals.POLICY_ATTACHMENT_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AppliesToType getAppliesTo() {
        return appliesTo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAppliesTo(AppliesToType newAppliesTo, NotificationChain msgs) {
        AppliesToType oldAppliesTo = appliesTo;
        appliesTo = newAppliesTo;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO, oldAppliesTo, newAppliesTo);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAppliesTo(AppliesToType newAppliesTo) {
        if (newAppliesTo != appliesTo) {
            NotificationChain msgs = null;
            if (appliesTo != null)
                msgs = ((InternalEObject)appliesTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO, null, msgs);
            if (newAppliesTo != null)
                msgs = ((InternalEObject)newAppliesTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO, null, msgs);
            msgs = basicSetAppliesTo(newAppliesTo, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO, newAppliesTo, newAppliesTo));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, PolicyPackage.POLICY_ATTACHMENT_TYPE__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyType> getPolicy() {
        return getGroup().list(PolicyPackage.Literals.POLICY_ATTACHMENT_TYPE__POLICY);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyReferenceType> getPolicyReference() {
        return getGroup().list(PolicyPackage.Literals.POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO:
                return basicSetAppliesTo(null, msgs);
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY:
                return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE:
                return ((InternalEList<?>)getPolicyReference()).basicRemove(otherEnd, msgs);
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO:
                return getAppliesTo();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY:
                return getPolicy();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE:
                return getPolicyReference();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO:
                setAppliesTo((AppliesToType)newValue);
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY:
                getPolicy().clear();
                getPolicy().addAll((Collection<? extends PolicyType>)newValue);
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE:
                getPolicyReference().clear();
                getPolicyReference().addAll((Collection<? extends PolicyReferenceType>)newValue);
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO:
                setAppliesTo((AppliesToType)null);
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__GROUP:
                getGroup().clear();
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY:
                getPolicy().clear();
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE:
                getPolicyReference().clear();
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY:
                getAny().clear();
                return;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__APPLIES_TO:
                return appliesTo != null;
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY:
                return !getPolicy().isEmpty();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE:
                return !getPolicyReference().isEmpty();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY:
                return any != null && !any.isEmpty();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(" (group: ");
        result.append(group);
        result.append(", any: ");
        result.append(any);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //PolicyAttachmentTypeImpl
