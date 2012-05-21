/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.ParametersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ParametersTypeImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersTypeImpl extends CommonExtensionBaseImpl implements ParametersType {
    /**
     * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMapping()
     * @generated
     * @ordered
     */
    protected EList<MappingType> mapping;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParametersTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.PARAMETERS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MappingType> getMapping() {
        if (mapping == null) {
            mapping = new EObjectContainmentEList<MappingType>(MappingType.class, this, BPMPackage.PARAMETERS_TYPE__MAPPING);
        }
        return mapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.PARAMETERS_TYPE__MAPPING:
                return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
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
            case BPMPackage.PARAMETERS_TYPE__MAPPING:
                return getMapping();
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
            case BPMPackage.PARAMETERS_TYPE__MAPPING:
                getMapping().clear();
                getMapping().addAll((Collection<? extends MappingType>)newValue);
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
            case BPMPackage.PARAMETERS_TYPE__MAPPING:
                getMapping().clear();
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
            case BPMPackage.PARAMETERS_TYPE__MAPPING:
                return mapping != null && !mapping.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ParametersTypeImpl
