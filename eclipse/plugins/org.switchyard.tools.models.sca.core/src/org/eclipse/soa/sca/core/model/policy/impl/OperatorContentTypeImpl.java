/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.core.model.policy.OperatorContentType;
import org.eclipse.soa.sca.core.model.policy.PolicyPackage;
import org.eclipse.soa.sca.core.model.policy.PolicyReferenceType;
import org.eclipse.soa.sca.core.model.policy.PolicyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorContentTypeImpl extends EObjectImpl implements OperatorContentType {
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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected OperatorContentTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return PolicyPackage.Literals.OPERATOR_CONTENT_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, PolicyPackage.OPERATOR_CONTENT_TYPE__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyType> getPolicy() {
        return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__POLICY);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OperatorContentType> getAll() {
        return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__ALL);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OperatorContentType> getExactlyOne() {
        return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__EXACTLY_ONE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyReferenceType> getPolicyReference() {
        return getGroup().list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__POLICY_REFERENCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__ANY);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PolicyPackage.OPERATOR_CONTENT_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY:
                return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ALL:
                return ((InternalEList<?>)getAll()).basicRemove(otherEnd, msgs);
            case PolicyPackage.OPERATOR_CONTENT_TYPE__EXACTLY_ONE:
                return ((InternalEList<?>)getExactlyOne()).basicRemove(otherEnd, msgs);
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY_REFERENCE:
                return ((InternalEList<?>)getPolicyReference()).basicRemove(otherEnd, msgs);
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
            case PolicyPackage.OPERATOR_CONTENT_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY:
                return getPolicy();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ALL:
                return getAll();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__EXACTLY_ONE:
                return getExactlyOne();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY_REFERENCE:
                return getPolicyReference();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
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
            case PolicyPackage.OPERATOR_CONTENT_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY:
                getPolicy().clear();
                getPolicy().addAll((Collection<? extends PolicyType>)newValue);
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ALL:
                getAll().clear();
                getAll().addAll((Collection<? extends OperatorContentType>)newValue);
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__EXACTLY_ONE:
                getExactlyOne().clear();
                getExactlyOne().addAll((Collection<? extends OperatorContentType>)newValue);
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY_REFERENCE:
                getPolicyReference().clear();
                getPolicyReference().addAll((Collection<? extends PolicyReferenceType>)newValue);
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
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
            case PolicyPackage.OPERATOR_CONTENT_TYPE__GROUP:
                getGroup().clear();
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY:
                getPolicy().clear();
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ALL:
                getAll().clear();
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__EXACTLY_ONE:
                getExactlyOne().clear();
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY_REFERENCE:
                getPolicyReference().clear();
                return;
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ANY:
                getAny().clear();
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
            case PolicyPackage.OPERATOR_CONTENT_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY:
                return !getPolicy().isEmpty();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ALL:
                return !getAll().isEmpty();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__EXACTLY_ONE:
                return !getExactlyOne().isEmpty();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__POLICY_REFERENCE:
                return !getPolicyReference().isEmpty();
            case PolicyPackage.OPERATOR_CONTENT_TYPE__ANY:
                return !getAny().isEmpty();
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
        result.append(')');
        return result.toString();
    }

} //OperatorContentTypeImpl
