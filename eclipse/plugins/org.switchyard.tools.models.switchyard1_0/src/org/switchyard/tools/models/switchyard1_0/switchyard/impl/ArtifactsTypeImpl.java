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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactsTypeImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactsTypeImpl extends EObjectImpl implements ArtifactsType {
	/**
     * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArtifact()
     * @generated
     * @ordered
     */
	protected EList<ArtifactType> artifact;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ArtifactsTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.ARTIFACTS_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ArtifactType> getArtifact() {
        if (artifact == null) {
            artifact = new EObjectContainmentEList<ArtifactType>(ArtifactType.class, this, SwitchyardPackage.ARTIFACTS_TYPE__ARTIFACT);
        }
        return artifact;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.ARTIFACTS_TYPE__ARTIFACT:
                return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
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
            case SwitchyardPackage.ARTIFACTS_TYPE__ARTIFACT:
                return getArtifact();
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
            case SwitchyardPackage.ARTIFACTS_TYPE__ARTIFACT:
                getArtifact().clear();
                getArtifact().addAll((Collection<? extends ArtifactType>)newValue);
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
            case SwitchyardPackage.ARTIFACTS_TYPE__ARTIFACT:
                getArtifact().clear();
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
            case SwitchyardPackage.ARTIFACTS_TYPE__ARTIFACT:
                return artifact != null && !artifact.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ArtifactsTypeImpl
