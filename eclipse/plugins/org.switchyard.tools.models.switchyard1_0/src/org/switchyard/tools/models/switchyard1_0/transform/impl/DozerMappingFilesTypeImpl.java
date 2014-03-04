/**
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType;
import org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dozer Mapping Files Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerMappingFilesTypeImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DozerMappingFilesTypeImpl extends EObjectImpl implements DozerMappingFilesType {
    /**
     * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntry()
     * @generated
     * @ordered
     */
    protected EList<DozerFileEntryType> entry;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DozerMappingFilesTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformPackage.Literals.DOZER_MAPPING_FILES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DozerFileEntryType> getEntry() {
        if (entry == null) {
            entry = new EObjectContainmentEList<DozerFileEntryType>(DozerFileEntryType.class, this, TransformPackage.DOZER_MAPPING_FILES_TYPE__ENTRY);
        }
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TransformPackage.DOZER_MAPPING_FILES_TYPE__ENTRY:
                return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
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
            case TransformPackage.DOZER_MAPPING_FILES_TYPE__ENTRY:
                return getEntry();
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
            case TransformPackage.DOZER_MAPPING_FILES_TYPE__ENTRY:
                getEntry().clear();
                getEntry().addAll((Collection<? extends DozerFileEntryType>)newValue);
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
            case TransformPackage.DOZER_MAPPING_FILES_TYPE__ENTRY:
                getEntry().clear();
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
            case TransformPackage.DOZER_MAPPING_FILES_TYPE__ENTRY:
                return entry != null && !entry.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DozerMappingFilesTypeImpl
