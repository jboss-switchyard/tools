/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.List;

import javax.xml.namespace.QName;

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
import org.eclipse.soa.sca.sca1_1.model.sca.Callback;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallbackImpl extends CommonExtensionBaseImpl implements Callback {
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
     * The default value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPolicySets()
     * @generated
     * @ordered
     */
	protected static final List<QName> POLICY_SETS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPolicySets()
     * @generated
     * @ordered
     */
	protected List<QName> policySets = POLICY_SETS_EDEFAULT;

	/**
     * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequires()
     * @generated
     * @ordered
     */
	protected static final List<QName> REQUIRES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequires()
     * @generated
     * @ordered
     */
	protected List<QName> requires = REQUIRES_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CallbackImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getCallback();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, ScaPackage.CALLBACK__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getBindingGroup() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(ScaPackage.eINSTANCE.getCallback_BindingGroup());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Binding> getBinding() {
        return getBindingGroup().list(ScaPackage.eINSTANCE.getCallback_Binding());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(ScaPackage.eINSTANCE.getCallback_Any());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getPolicySets() {
        return policySets;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicySets(List<QName> newPolicySets) {
        List<QName> oldPolicySets = policySets;
        policySets = newPolicySets;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CALLBACK__POLICY_SETS, oldPolicySets, policySets));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getRequires() {
        return requires;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRequires(List<QName> newRequires) {
        List<QName> oldRequires = requires;
        requires = newRequires;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CALLBACK__REQUIRES, oldRequires, requires));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.CALLBACK__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.CALLBACK__BINDING_GROUP:
                return ((InternalEList<?>)getBindingGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.CALLBACK__BINDING:
                return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
            case ScaPackage.CALLBACK__ANY:
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
            case ScaPackage.CALLBACK__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case ScaPackage.CALLBACK__BINDING_GROUP:
                if (coreType) return getBindingGroup();
                return ((FeatureMap.Internal)getBindingGroup()).getWrapper();
            case ScaPackage.CALLBACK__BINDING:
                return getBinding();
            case ScaPackage.CALLBACK__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.CALLBACK__POLICY_SETS:
                return getPolicySets();
            case ScaPackage.CALLBACK__REQUIRES:
                return getRequires();
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
            case ScaPackage.CALLBACK__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case ScaPackage.CALLBACK__BINDING_GROUP:
                ((FeatureMap.Internal)getBindingGroup()).set(newValue);
                return;
            case ScaPackage.CALLBACK__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.CALLBACK__POLICY_SETS:
                setPolicySets((List<QName>)newValue);
                return;
            case ScaPackage.CALLBACK__REQUIRES:
                setRequires((List<QName>)newValue);
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
            case ScaPackage.CALLBACK__GROUP:
                getGroup().clear();
                return;
            case ScaPackage.CALLBACK__BINDING_GROUP:
                getBindingGroup().clear();
                return;
            case ScaPackage.CALLBACK__ANY:
                getAny().clear();
                return;
            case ScaPackage.CALLBACK__POLICY_SETS:
                setPolicySets(POLICY_SETS_EDEFAULT);
                return;
            case ScaPackage.CALLBACK__REQUIRES:
                setRequires(REQUIRES_EDEFAULT);
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
            case ScaPackage.CALLBACK__GROUP:
                return group != null && !group.isEmpty();
            case ScaPackage.CALLBACK__BINDING_GROUP:
                return !getBindingGroup().isEmpty();
            case ScaPackage.CALLBACK__BINDING:
                return !getBinding().isEmpty();
            case ScaPackage.CALLBACK__ANY:
                return !getAny().isEmpty();
            case ScaPackage.CALLBACK__POLICY_SETS:
                return POLICY_SETS_EDEFAULT == null ? policySets != null : !POLICY_SETS_EDEFAULT.equals(policySets);
            case ScaPackage.CALLBACK__REQUIRES:
                return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
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
        result.append(", policySets: ");
        result.append(policySets);
        result.append(", requires: ");
        result.append(requires);
        result.append(')');
        return result.toString();
    }

} //CallbackImpl
