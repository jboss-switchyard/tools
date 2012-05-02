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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getWireFormatGroup <em>Wire Format Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getOperationSelectorGroup <em>Operation Selector Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getOperationSelector <em>Operation Selector</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BindingImpl extends CommonExtensionBaseImpl implements Binding {
	/**
	 * The cached value of the '{@link #getWireFormatGroup() <em>Wire Format Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireFormatGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap wireFormatGroup;

	/**
	 * The cached value of the '{@link #getOperationSelectorGroup() <em>Operation Selector Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSelectorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap operationSelectorGroup;

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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getWireFormatGroup() {
		if (wireFormatGroup == null) {
			wireFormatGroup = new BasicFeatureMap(this, ScaPackage.BINDING__WIRE_FORMAT_GROUP);
		}
		return wireFormatGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireFormatType getWireFormat() {
		return (WireFormatType)getWireFormatGroup().get(ScaPackage.eINSTANCE.getBinding_WireFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireFormat(WireFormatType newWireFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getWireFormatGroup()).basicAdd(ScaPackage.eINSTANCE.getBinding_WireFormat(), newWireFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOperationSelectorGroup() {
		if (operationSelectorGroup == null) {
			operationSelectorGroup = new BasicFeatureMap(this, ScaPackage.BINDING__OPERATION_SELECTOR_GROUP);
		}
		return operationSelectorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSelectorType getOperationSelector() {
		return (OperationSelectorType)getOperationSelectorGroup().get(ScaPackage.eINSTANCE.getBinding_OperationSelector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationSelector(OperationSelectorType newOperationSelector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getOperationSelectorGroup()).basicAdd(ScaPackage.eINSTANCE.getBinding_OperationSelector(), newOperationSelector, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING__POLICY_SETS, oldPolicySets, policySets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.BINDING__WIRE_FORMAT_GROUP:
				return ((InternalEList<?>)getWireFormatGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.BINDING__WIRE_FORMAT:
				return basicSetWireFormat(null, msgs);
			case ScaPackage.BINDING__OPERATION_SELECTOR_GROUP:
				return ((InternalEList<?>)getOperationSelectorGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.BINDING__OPERATION_SELECTOR:
				return basicSetOperationSelector(null, msgs);
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
			case ScaPackage.BINDING__WIRE_FORMAT_GROUP:
				if (coreType) return getWireFormatGroup();
				return ((FeatureMap.Internal)getWireFormatGroup()).getWrapper();
			case ScaPackage.BINDING__WIRE_FORMAT:
				return getWireFormat();
			case ScaPackage.BINDING__OPERATION_SELECTOR_GROUP:
				if (coreType) return getOperationSelectorGroup();
				return ((FeatureMap.Internal)getOperationSelectorGroup()).getWrapper();
			case ScaPackage.BINDING__OPERATION_SELECTOR:
				return getOperationSelector();
			case ScaPackage.BINDING__NAME:
				return getName();
			case ScaPackage.BINDING__POLICY_SETS:
				return getPolicySets();
			case ScaPackage.BINDING__REQUIRES:
				return getRequires();
			case ScaPackage.BINDING__URI:
				return getUri();
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
			case ScaPackage.BINDING__WIRE_FORMAT_GROUP:
				((FeatureMap.Internal)getWireFormatGroup()).set(newValue);
				return;
			case ScaPackage.BINDING__OPERATION_SELECTOR_GROUP:
				((FeatureMap.Internal)getOperationSelectorGroup()).set(newValue);
				return;
			case ScaPackage.BINDING__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.BINDING__POLICY_SETS:
				setPolicySets((List<QName>)newValue);
				return;
			case ScaPackage.BINDING__REQUIRES:
				setRequires((List<QName>)newValue);
				return;
			case ScaPackage.BINDING__URI:
				setUri((String)newValue);
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
			case ScaPackage.BINDING__WIRE_FORMAT_GROUP:
				getWireFormatGroup().clear();
				return;
			case ScaPackage.BINDING__OPERATION_SELECTOR_GROUP:
				getOperationSelectorGroup().clear();
				return;
			case ScaPackage.BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.BINDING__POLICY_SETS:
				setPolicySets(POLICY_SETS_EDEFAULT);
				return;
			case ScaPackage.BINDING__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
				return;
			case ScaPackage.BINDING__URI:
				setUri(URI_EDEFAULT);
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
			case ScaPackage.BINDING__WIRE_FORMAT_GROUP:
				return wireFormatGroup != null && !wireFormatGroup.isEmpty();
			case ScaPackage.BINDING__WIRE_FORMAT:
				return getWireFormat() != null;
			case ScaPackage.BINDING__OPERATION_SELECTOR_GROUP:
				return operationSelectorGroup != null && !operationSelectorGroup.isEmpty();
			case ScaPackage.BINDING__OPERATION_SELECTOR:
				return getOperationSelector() != null;
			case ScaPackage.BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.BINDING__POLICY_SETS:
				return POLICY_SETS_EDEFAULT == null ? policySets != null : !POLICY_SETS_EDEFAULT.equals(policySets);
			case ScaPackage.BINDING__REQUIRES:
				return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
			case ScaPackage.BINDING__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (wireFormatGroup: ");
		result.append(wireFormatGroup);
		result.append(", operationSelectorGroup: ");
		result.append(operationSelectorGroup);
		result.append(", name: ");
		result.append(name);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(", requires: ");
		result.append(requires);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
