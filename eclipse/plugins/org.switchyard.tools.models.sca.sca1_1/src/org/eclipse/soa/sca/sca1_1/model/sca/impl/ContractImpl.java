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
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getInterfaceGroup <em>Interface Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContractImpl extends CommonExtensionBaseImpl implements Contract {
	/**
	 * The cached value of the '{@link #getInterfaceGroup() <em>Interface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap interfaceGroup;

	/**
	 * The cached value of the '{@link #getBindingGroup() <em>Binding Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap bindingGroup;

	/**
	 * The cached value of the '{@link #getCallback() <em>Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallback()
	 * @generated
	 * @ordered
	 */
	protected Callback callback;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getContract();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInterfaceGroup() {
		if (interfaceGroup == null) {
			interfaceGroup = new BasicFeatureMap(this, ScaPackage.CONTRACT__INTERFACE_GROUP);
		}
		return interfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		return (Interface)getInterfaceGroup().get(ScaPackage.eINSTANCE.getContract_Interface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getInterfaceGroup()).basicAdd(ScaPackage.eINSTANCE.getContract_Interface(), newInterface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBindingGroup() {
		if (bindingGroup == null) {
			bindingGroup = new BasicFeatureMap(this, ScaPackage.CONTRACT__BINDING_GROUP);
		}
		return bindingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		return getBindingGroup().list(ScaPackage.eINSTANCE.getContract_Binding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback getCallback() {
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallback(Callback newCallback, NotificationChain msgs) {
		Callback oldCallback = callback;
		callback = newCallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.CONTRACT__CALLBACK, oldCallback, newCallback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallback(Callback newCallback) {
		if (newCallback != callback) {
			NotificationChain msgs = null;
			if (callback != null)
				msgs = ((InternalEObject)callback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.CONTRACT__CALLBACK, null, msgs);
			if (newCallback != null)
				msgs = ((InternalEObject)newCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.CONTRACT__CALLBACK, null, msgs);
			msgs = basicSetCallback(newCallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CONTRACT__CALLBACK, newCallback, newCallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.CONTRACT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CONTRACT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CONTRACT__POLICY_SETS, oldPolicySets, policySets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CONTRACT__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.CONTRACT__INTERFACE_GROUP:
				return ((InternalEList<?>)getInterfaceGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.CONTRACT__INTERFACE:
				return basicSetInterface(null, msgs);
			case ScaPackage.CONTRACT__BINDING_GROUP:
				return ((InternalEList<?>)getBindingGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.CONTRACT__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case ScaPackage.CONTRACT__CALLBACK:
				return basicSetCallback(null, msgs);
			case ScaPackage.CONTRACT__ANY:
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
			case ScaPackage.CONTRACT__INTERFACE_GROUP:
				if (coreType) return getInterfaceGroup();
				return ((FeatureMap.Internal)getInterfaceGroup()).getWrapper();
			case ScaPackage.CONTRACT__INTERFACE:
				return getInterface();
			case ScaPackage.CONTRACT__BINDING_GROUP:
				if (coreType) return getBindingGroup();
				return ((FeatureMap.Internal)getBindingGroup()).getWrapper();
			case ScaPackage.CONTRACT__BINDING:
				return getBinding();
			case ScaPackage.CONTRACT__CALLBACK:
				return getCallback();
			case ScaPackage.CONTRACT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScaPackage.CONTRACT__NAME:
				return getName();
			case ScaPackage.CONTRACT__POLICY_SETS:
				return getPolicySets();
			case ScaPackage.CONTRACT__REQUIRES:
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
			case ScaPackage.CONTRACT__INTERFACE_GROUP:
				((FeatureMap.Internal)getInterfaceGroup()).set(newValue);
				return;
			case ScaPackage.CONTRACT__BINDING_GROUP:
				((FeatureMap.Internal)getBindingGroup()).set(newValue);
				return;
			case ScaPackage.CONTRACT__CALLBACK:
				setCallback((Callback)newValue);
				return;
			case ScaPackage.CONTRACT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScaPackage.CONTRACT__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.CONTRACT__POLICY_SETS:
				setPolicySets((List<QName>)newValue);
				return;
			case ScaPackage.CONTRACT__REQUIRES:
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
			case ScaPackage.CONTRACT__INTERFACE_GROUP:
				getInterfaceGroup().clear();
				return;
			case ScaPackage.CONTRACT__BINDING_GROUP:
				getBindingGroup().clear();
				return;
			case ScaPackage.CONTRACT__CALLBACK:
				setCallback((Callback)null);
				return;
			case ScaPackage.CONTRACT__ANY:
				getAny().clear();
				return;
			case ScaPackage.CONTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.CONTRACT__POLICY_SETS:
				setPolicySets(POLICY_SETS_EDEFAULT);
				return;
			case ScaPackage.CONTRACT__REQUIRES:
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
			case ScaPackage.CONTRACT__INTERFACE_GROUP:
				return interfaceGroup != null && !interfaceGroup.isEmpty();
			case ScaPackage.CONTRACT__INTERFACE:
				return getInterface() != null;
			case ScaPackage.CONTRACT__BINDING_GROUP:
				return bindingGroup != null && !bindingGroup.isEmpty();
			case ScaPackage.CONTRACT__BINDING:
				return !getBinding().isEmpty();
			case ScaPackage.CONTRACT__CALLBACK:
				return callback != null;
			case ScaPackage.CONTRACT__ANY:
				return any != null && !any.isEmpty();
			case ScaPackage.CONTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.CONTRACT__POLICY_SETS:
				return POLICY_SETS_EDEFAULT == null ? policySets != null : !POLICY_SETS_EDEFAULT.equals(policySets);
			case ScaPackage.CONTRACT__REQUIRES:
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
		result.append(" (interfaceGroup: ");
		result.append(interfaceGroup);
		result.append(", bindingGroup: ");
		result.append(bindingGroup);
		result.append(", any: ");
		result.append(any);
		result.append(", name: ");
		result.append(name);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(", requires: ");
		result.append(requires);
		result.append(')');
		return result.toString();
	}

} //ContractImpl
