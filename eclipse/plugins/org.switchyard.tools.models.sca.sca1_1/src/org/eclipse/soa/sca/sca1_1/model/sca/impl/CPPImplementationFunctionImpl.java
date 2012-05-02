/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPP Implementation Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationFunctionImpl#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationFunctionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CPPImplementationFunctionImpl extends EObjectImpl implements CPPImplementationFunction {
	/**
	 * The default value of the '{@link #isAllowsPassByReference() <em>Allows Pass By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsPassByReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOWS_PASS_BY_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowsPassByReference() <em>Allows Pass By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsPassByReference()
	 * @generated
	 * @ordered
	 */
	protected boolean allowsPassByReference = ALLOWS_PASS_BY_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Allows Pass By Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowsPassByReferenceESet;

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
	protected CPPImplementationFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getCPPImplementationFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowsPassByReference() {
		return allowsPassByReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsPassByReference(boolean newAllowsPassByReference) {
		boolean oldAllowsPassByReference = allowsPassByReference;
		allowsPassByReference = newAllowsPassByReference;
		boolean oldAllowsPassByReferenceESet = allowsPassByReferenceESet;
		allowsPassByReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, allowsPassByReference, !oldAllowsPassByReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowsPassByReference() {
		boolean oldAllowsPassByReference = allowsPassByReference;
		boolean oldAllowsPassByReferenceESet = allowsPassByReferenceESet;
		allowsPassByReference = ALLOWS_PASS_BY_REFERENCE_EDEFAULT;
		allowsPassByReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, ALLOWS_PASS_BY_REFERENCE_EDEFAULT, oldAllowsPassByReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowsPassByReference() {
		return allowsPassByReferenceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CPP_IMPLEMENTATION_FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE);
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
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
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
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
				return isAllowsPassByReference();
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__NAME:
				return getName();
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
				setAllowsPassByReference((Boolean)newValue);
				return;
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
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
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
				unsetAllowsPassByReference();
				return;
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
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
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
				return isSetAllowsPassByReference();
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
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
		result.append(" (allowsPassByReference: ");
		if (allowsPassByReferenceESet) result.append(allowsPassByReference); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CPPImplementationFunctionImpl
