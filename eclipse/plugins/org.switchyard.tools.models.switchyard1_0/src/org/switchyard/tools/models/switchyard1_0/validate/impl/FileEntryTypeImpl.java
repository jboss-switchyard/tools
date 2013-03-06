/**
 */
package org.switchyard.tools.models.switchyard1_0.validate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.validate.FileEntryType;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.FileEntryTypeImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileEntryTypeImpl extends EObjectImpl implements FileEntryType {
    /**
     * The default value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected static final String FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected String file = FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileEntryTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ValidatePackage.Literals.FILE_ENTRY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFile() {
        return file;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFile(String newFile) {
        String oldFile = file;
        file = newFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.FILE_ENTRY_TYPE__FILE, oldFile, file));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ValidatePackage.FILE_ENTRY_TYPE__FILE:
                return getFile();
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
            case ValidatePackage.FILE_ENTRY_TYPE__FILE:
                setFile((String)newValue);
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
            case ValidatePackage.FILE_ENTRY_TYPE__FILE:
                setFile(FILE_EDEFAULT);
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
            case ValidatePackage.FILE_ENTRY_TYPE__FILE:
                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
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
        result.append(" (file: ");
        result.append(file);
        result.append(')');
        return result.toString();
    }

} //FileEntryTypeImpl
