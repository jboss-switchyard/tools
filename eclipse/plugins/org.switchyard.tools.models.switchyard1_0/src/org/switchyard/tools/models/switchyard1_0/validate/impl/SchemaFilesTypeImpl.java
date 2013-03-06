/**
 */
package org.switchyard.tools.models.switchyard1_0.validate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.validate.FileEntryType;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaFilesType;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Files Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.SchemaFilesTypeImpl#getEntryGroup <em>Entry Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.SchemaFilesTypeImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaFilesTypeImpl extends EObjectImpl implements SchemaFilesType {
    /**
     * The cached value of the '{@link #getEntryGroup() <em>Entry Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntryGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap entryGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaFilesTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ValidatePackage.Literals.SCHEMA_FILES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getEntryGroup() {
        if (entryGroup == null) {
            entryGroup = new BasicFeatureMap(this, ValidatePackage.SCHEMA_FILES_TYPE__ENTRY_GROUP);
        }
        return entryGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FileEntryType> getEntry() {
        return getEntryGroup().list(ValidatePackage.Literals.SCHEMA_FILES_TYPE__ENTRY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY_GROUP:
                return ((InternalEList<?>)getEntryGroup()).basicRemove(otherEnd, msgs);
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY:
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
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY_GROUP:
                if (coreType) return getEntryGroup();
                return ((FeatureMap.Internal)getEntryGroup()).getWrapper();
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY:
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
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY_GROUP:
                ((FeatureMap.Internal)getEntryGroup()).set(newValue);
                return;
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY:
                getEntry().clear();
                getEntry().addAll((Collection<? extends FileEntryType>)newValue);
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
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY_GROUP:
                getEntryGroup().clear();
                return;
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY:
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
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY_GROUP:
                return entryGroup != null && !entryGroup.isEmpty();
            case ValidatePackage.SCHEMA_FILES_TYPE__ENTRY:
                return !getEntry().isEmpty();
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
        result.append(" (EntryGroup: ");
        result.append(entryGroup);
        result.append(')');
        return result.toString();
    }

} //SchemaFilesTypeImpl
