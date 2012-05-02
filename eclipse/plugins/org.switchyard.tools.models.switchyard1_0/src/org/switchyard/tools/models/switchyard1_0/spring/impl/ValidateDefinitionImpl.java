/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ValidateDefinitionImpl#getAnyAttribute3 <em>Any Attribute3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidateDefinitionImpl extends NoOutputExpressionNodeImpl implements ValidateDefinition {
	/**
	 * The cached value of the '{@link #getAnyAttribute3() <em>Any Attribute3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getValidateDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute3() {
		if (anyAttribute3 == null) {
			anyAttribute3 = new BasicFeatureMap(this, SpringPackage.VALIDATE_DEFINITION__ANY_ATTRIBUTE3);
		}
		return anyAttribute3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.VALIDATE_DEFINITION__ANY_ATTRIBUTE3:
				return ((InternalEList<?>)getAnyAttribute3()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.VALIDATE_DEFINITION__ANY_ATTRIBUTE3:
				if (coreType) return getAnyAttribute3();
				return ((FeatureMap.Internal)getAnyAttribute3()).getWrapper();
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
			case SpringPackage.VALIDATE_DEFINITION__ANY_ATTRIBUTE3:
				((FeatureMap.Internal)getAnyAttribute3()).set(newValue);
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
			case SpringPackage.VALIDATE_DEFINITION__ANY_ATTRIBUTE3:
				getAnyAttribute3().clear();
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
			case SpringPackage.VALIDATE_DEFINITION__ANY_ATTRIBUTE3:
				return anyAttribute3 != null && !anyAttribute3.isEmpty();
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
		result.append(" (anyAttribute3: ");
		result.append(anyAttribute3);
		result.append(')');
		return result.toString();
	}

} //ValidateDefinitionImpl
