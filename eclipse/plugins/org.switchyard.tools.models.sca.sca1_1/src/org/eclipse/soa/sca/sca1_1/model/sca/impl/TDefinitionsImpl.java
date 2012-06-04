/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.BindingType;
import org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType;
import org.eclipse.soa.sca.sca1_1.model.sca.Intent;
import org.eclipse.soa.sca.sca1_1.model.sca.PolicySet;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDefinitionsImpl extends CommonExtensionBaseImpl implements TDefinitions {
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
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TDefinitionsImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getTDefinitions();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, ScaPackage.TDEFINITIONS__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Intent> getIntent() {
        return getGroup().list(ScaPackage.eINSTANCE.getTDefinitions_Intent());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicySet> getPolicySet() {
        return getGroup().list(ScaPackage.eINSTANCE.getTDefinitions_PolicySet());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getBindingGroup() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(ScaPackage.eINSTANCE.getTDefinitions_BindingGroup());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Binding> getBinding() {
        return getBindingGroup().list(ScaPackage.eINSTANCE.getTDefinitions_Binding());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BindingType> getBindingType() {
        return getGroup().list(ScaPackage.eINSTANCE.getTDefinitions_BindingType());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ImplementationType> getImplementationType() {
        return getGroup().list(ScaPackage.eINSTANCE.getTDefinitions_ImplementationType());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(ScaPackage.eINSTANCE.getTDefinitions_Any());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTargetNamespace() {
        return targetNamespace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.TDEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.TDEFINITIONS__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__INTENT:
                return ((InternalEList<?>)getIntent()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__POLICY_SET:
                return ((InternalEList<?>)getPolicySet()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__BINDING_GROUP:
                return ((InternalEList<?>)getBindingGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__BINDING:
                return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__BINDING_TYPE:
                return ((InternalEList<?>)getBindingType()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__IMPLEMENTATION_TYPE:
                return ((InternalEList<?>)getImplementationType()).basicRemove(otherEnd, msgs);
            case ScaPackage.TDEFINITIONS__ANY:
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
            case ScaPackage.TDEFINITIONS__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case ScaPackage.TDEFINITIONS__INTENT:
                return getIntent();
            case ScaPackage.TDEFINITIONS__POLICY_SET:
                return getPolicySet();
            case ScaPackage.TDEFINITIONS__BINDING_GROUP:
                if (coreType) return getBindingGroup();
                return ((FeatureMap.Internal)getBindingGroup()).getWrapper();
            case ScaPackage.TDEFINITIONS__BINDING:
                return getBinding();
            case ScaPackage.TDEFINITIONS__BINDING_TYPE:
                return getBindingType();
            case ScaPackage.TDEFINITIONS__IMPLEMENTATION_TYPE:
                return getImplementationType();
            case ScaPackage.TDEFINITIONS__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.TDEFINITIONS__TARGET_NAMESPACE:
                return getTargetNamespace();
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
            case ScaPackage.TDEFINITIONS__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case ScaPackage.TDEFINITIONS__INTENT:
                getIntent().clear();
                getIntent().addAll((Collection<? extends Intent>)newValue);
                return;
            case ScaPackage.TDEFINITIONS__POLICY_SET:
                getPolicySet().clear();
                getPolicySet().addAll((Collection<? extends PolicySet>)newValue);
                return;
            case ScaPackage.TDEFINITIONS__BINDING_GROUP:
                ((FeatureMap.Internal)getBindingGroup()).set(newValue);
                return;
            case ScaPackage.TDEFINITIONS__BINDING_TYPE:
                getBindingType().clear();
                getBindingType().addAll((Collection<? extends BindingType>)newValue);
                return;
            case ScaPackage.TDEFINITIONS__IMPLEMENTATION_TYPE:
                getImplementationType().clear();
                getImplementationType().addAll((Collection<? extends ImplementationType>)newValue);
                return;
            case ScaPackage.TDEFINITIONS__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.TDEFINITIONS__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
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
            case ScaPackage.TDEFINITIONS__GROUP:
                getGroup().clear();
                return;
            case ScaPackage.TDEFINITIONS__INTENT:
                getIntent().clear();
                return;
            case ScaPackage.TDEFINITIONS__POLICY_SET:
                getPolicySet().clear();
                return;
            case ScaPackage.TDEFINITIONS__BINDING_GROUP:
                getBindingGroup().clear();
                return;
            case ScaPackage.TDEFINITIONS__BINDING_TYPE:
                getBindingType().clear();
                return;
            case ScaPackage.TDEFINITIONS__IMPLEMENTATION_TYPE:
                getImplementationType().clear();
                return;
            case ScaPackage.TDEFINITIONS__ANY:
                getAny().clear();
                return;
            case ScaPackage.TDEFINITIONS__TARGET_NAMESPACE:
                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
            case ScaPackage.TDEFINITIONS__GROUP:
                return group != null && !group.isEmpty();
            case ScaPackage.TDEFINITIONS__INTENT:
                return !getIntent().isEmpty();
            case ScaPackage.TDEFINITIONS__POLICY_SET:
                return !getPolicySet().isEmpty();
            case ScaPackage.TDEFINITIONS__BINDING_GROUP:
                return !getBindingGroup().isEmpty();
            case ScaPackage.TDEFINITIONS__BINDING:
                return !getBinding().isEmpty();
            case ScaPackage.TDEFINITIONS__BINDING_TYPE:
                return !getBindingType().isEmpty();
            case ScaPackage.TDEFINITIONS__IMPLEMENTATION_TYPE:
                return !getImplementationType().isEmpty();
            case ScaPackage.TDEFINITIONS__ANY:
                return !getAny().isEmpty();
            case ScaPackage.TDEFINITIONS__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(')');
        return result.toString();
    }

} //TDefinitionsImpl
