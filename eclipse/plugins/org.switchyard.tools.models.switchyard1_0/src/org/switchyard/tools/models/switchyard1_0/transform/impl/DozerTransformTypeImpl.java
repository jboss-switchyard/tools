/**
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;

import org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType;
import org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dozer Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerTransformTypeImpl#getMappingFiles <em>Mapping Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DozerTransformTypeImpl extends TransformTypeImpl implements DozerTransformType {
    /**
     * The cached value of the '{@link #getMappingFiles() <em>Mapping Files</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappingFiles()
     * @generated
     * @ordered
     */
    protected DozerMappingFilesType mappingFiles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DozerTransformTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformPackage.Literals.DOZER_TRANSFORM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DozerMappingFilesType getMappingFiles() {
        return mappingFiles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMappingFiles(DozerMappingFilesType newMappingFiles, NotificationChain msgs) {
        DozerMappingFilesType oldMappingFiles = mappingFiles;
        mappingFiles = newMappingFiles;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES, oldMappingFiles, newMappingFiles);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMappingFiles(DozerMappingFilesType newMappingFiles) {
        if (newMappingFiles != mappingFiles) {
            NotificationChain msgs = null;
            if (mappingFiles != null)
                msgs = ((InternalEObject)mappingFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES, null, msgs);
            if (newMappingFiles != null)
                msgs = ((InternalEObject)newMappingFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES, null, msgs);
            msgs = basicSetMappingFiles(newMappingFiles, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES, newMappingFiles, newMappingFiles));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES:
                return basicSetMappingFiles(null, msgs);
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
            case TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES:
                return getMappingFiles();
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
            case TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES:
                setMappingFiles((DozerMappingFilesType)newValue);
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
            case TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES:
                setMappingFiles((DozerMappingFilesType)null);
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
            case TransformPackage.DOZER_TRANSFORM_TYPE__MAPPING_FILES:
                return mappingFiles != null;
        }
        return super.eIsSet(featureID);
    }

} //DozerTransformTypeImpl
