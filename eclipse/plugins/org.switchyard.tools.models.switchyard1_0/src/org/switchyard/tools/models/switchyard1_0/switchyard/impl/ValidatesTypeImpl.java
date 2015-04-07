/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidatesTypeImpl#getValidateGroup <em>Validate Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidatesTypeImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidatesTypeImpl extends EObjectImpl implements ValidatesType {
	/**
     * The cached value of the '{@link #getValidateGroup() <em>Validate Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValidateGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap validateGroup;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ValidatesTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.VALIDATES_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getValidateGroup() {
        if (validateGroup == null) {
            validateGroup = new BasicFeatureMap(this, SwitchyardPackage.VALIDATES_TYPE__VALIDATE_GROUP);
        }
        return validateGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ValidateType> getValidate() {
        return getValidateGroup().list(SwitchyardPackage.Literals.VALIDATES_TYPE__VALIDATE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE_GROUP:
                return ((InternalEList<?>)getValidateGroup()).basicRemove(otherEnd, msgs);
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE:
                return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
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
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE_GROUP:
                if (coreType) return getValidateGroup();
                return ((FeatureMap.Internal)getValidateGroup()).getWrapper();
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE:
                return getValidate();
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
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE_GROUP:
                ((FeatureMap.Internal)getValidateGroup()).set(newValue);
                return;
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE:
                getValidate().clear();
                getValidate().addAll((Collection<? extends ValidateType>)newValue);
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
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE_GROUP:
                getValidateGroup().clear();
                return;
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE:
                getValidate().clear();
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
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE_GROUP:
                return validateGroup != null && !validateGroup.isEmpty();
            case SwitchyardPackage.VALIDATES_TYPE__VALIDATE:
                return !getValidate().isEmpty();
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
        result.append(" (validateGroup: ");
        result.append(validateGroup);
        result.append(')');
        return result.toString();
    }

} //ValidatesTypeImpl
