/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.FaultsType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faults Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.FaultsTypeImpl#getFault <em>Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultsTypeImpl extends CommonExtensionBaseImpl implements FaultsType {
    /**
     * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFault()
     * @generated
     * @ordered
     */
    protected EList<MappingType> fault;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FaultsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.FAULTS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MappingType> getFault() {
        if (fault == null) {
            fault = new EObjectContainmentEList<MappingType>(MappingType.class, this, BPMPackage.FAULTS_TYPE__FAULT);
        }
        return fault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.FAULTS_TYPE__FAULT:
                return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
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
            case BPMPackage.FAULTS_TYPE__FAULT:
                return getFault();
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
            case BPMPackage.FAULTS_TYPE__FAULT:
                getFault().clear();
                getFault().addAll((Collection<? extends MappingType>)newValue);
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
            case BPMPackage.FAULTS_TYPE__FAULT:
                getFault().clear();
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
            case BPMPackage.FAULTS_TYPE__FAULT:
                return fault != null && !fault.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FaultsTypeImpl
