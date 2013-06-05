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
import org.switchyard.tools.models.switchyard1_0.bpm.GlobalsType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Globals Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.GlobalsTypeImpl#getGlobal <em>Global</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalsTypeImpl extends CommonExtensionBaseImpl implements GlobalsType {
    /**
     * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGlobal()
     * @generated
     * @ordered
     */
    protected EList<MappingType> global;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GlobalsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.GLOBALS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MappingType> getGlobal() {
        if (global == null) {
            global = new EObjectContainmentEList<MappingType>(MappingType.class, this, BPMPackage.GLOBALS_TYPE__GLOBAL);
        }
        return global;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.GLOBALS_TYPE__GLOBAL:
                return ((InternalEList<?>)getGlobal()).basicRemove(otherEnd, msgs);
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
            case BPMPackage.GLOBALS_TYPE__GLOBAL:
                return getGlobal();
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
            case BPMPackage.GLOBALS_TYPE__GLOBAL:
                getGlobal().clear();
                getGlobal().addAll((Collection<? extends MappingType>)newValue);
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
            case BPMPackage.GLOBALS_TYPE__GLOBAL:
                getGlobal().clear();
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
            case BPMPackage.GLOBALS_TYPE__GLOBAL:
                return global != null && !global.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GlobalsTypeImpl
