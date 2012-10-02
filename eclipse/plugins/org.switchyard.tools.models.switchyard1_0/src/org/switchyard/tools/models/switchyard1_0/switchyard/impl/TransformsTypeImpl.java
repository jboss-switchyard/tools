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
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transforms Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformsTypeImpl#getTransformGroup <em>Transform Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformsTypeImpl#getTransform <em>Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformsTypeImpl extends EObjectImpl implements TransformsType {
	/**
     * The cached value of the '{@link #getTransformGroup() <em>Transform Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTransformGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap transformGroup;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TransformsTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.TRANSFORMS_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getTransformGroup() {
        if (transformGroup == null) {
            transformGroup = new BasicFeatureMap(this, SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM_GROUP);
        }
        return transformGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransformType> getTransform() {
        return getTransformGroup().list(SwitchyardPackage.Literals.TRANSFORMS_TYPE__TRANSFORM);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM_GROUP:
                return ((InternalEList<?>)getTransformGroup()).basicRemove(otherEnd, msgs);
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM:
                return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
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
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM_GROUP:
                if (coreType) return getTransformGroup();
                return ((FeatureMap.Internal)getTransformGroup()).getWrapper();
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM:
                return getTransform();
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
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM_GROUP:
                ((FeatureMap.Internal)getTransformGroup()).set(newValue);
                return;
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM:
                getTransform().clear();
                getTransform().addAll((Collection<? extends TransformType>)newValue);
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
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM_GROUP:
                getTransformGroup().clear();
                return;
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM:
                getTransform().clear();
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
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM_GROUP:
                return transformGroup != null && !transformGroup.isEmpty();
            case SwitchyardPackage.TRANSFORMS_TYPE__TRANSFORM:
                return !getTransform().isEmpty();
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
        result.append(" (transformGroup: ");
        result.append(transformGroup);
        result.append(')');
        return result.toString();
    }

} //TransformsTypeImpl
