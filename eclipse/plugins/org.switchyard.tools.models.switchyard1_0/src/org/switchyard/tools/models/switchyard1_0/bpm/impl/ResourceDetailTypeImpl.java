/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceDetailType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Detail Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceDetailTypeImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceDetailTypeImpl#isUsingExternalTypes <em>Using External Types</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceDetailTypeImpl#getWorksheetName <em>Worksheet Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceDetailTypeImpl extends CommonExtensionBaseImpl implements ResourceDetailType {
    /**
     * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputType()
     * @generated
     * @ordered
     */
    protected static final String INPUT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputType()
     * @generated
     * @ordered
     */
    protected String inputType = INPUT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isUsingExternalTypes() <em>Using External Types</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUsingExternalTypes()
     * @generated
     * @ordered
     */
    protected static final boolean USING_EXTERNAL_TYPES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUsingExternalTypes() <em>Using External Types</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUsingExternalTypes()
     * @generated
     * @ordered
     */
    protected boolean usingExternalTypes = USING_EXTERNAL_TYPES_EDEFAULT;

    /**
     * This is true if the Using External Types attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usingExternalTypesESet;

    /**
     * The default value of the '{@link #getWorksheetName() <em>Worksheet Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorksheetName()
     * @generated
     * @ordered
     */
    protected static final String WORKSHEET_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWorksheetName() <em>Worksheet Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorksheetName()
     * @generated
     * @ordered
     */
    protected String worksheetName = WORKSHEET_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceDetailTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.RESOURCE_DETAIL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputType(String newInputType) {
        String oldInputType = inputType;
        inputType = newInputType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_DETAIL_TYPE__INPUT_TYPE, oldInputType, inputType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUsingExternalTypes() {
        return usingExternalTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsingExternalTypes(boolean newUsingExternalTypes) {
        boolean oldUsingExternalTypes = usingExternalTypes;
        usingExternalTypes = newUsingExternalTypes;
        boolean oldUsingExternalTypesESet = usingExternalTypesESet;
        usingExternalTypesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES, oldUsingExternalTypes, usingExternalTypes, !oldUsingExternalTypesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUsingExternalTypes() {
        boolean oldUsingExternalTypes = usingExternalTypes;
        boolean oldUsingExternalTypesESet = usingExternalTypesESet;
        usingExternalTypes = USING_EXTERNAL_TYPES_EDEFAULT;
        usingExternalTypesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BPMPackage.RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES, oldUsingExternalTypes, USING_EXTERNAL_TYPES_EDEFAULT, oldUsingExternalTypesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUsingExternalTypes() {
        return usingExternalTypesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWorksheetName() {
        return worksheetName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorksheetName(String newWorksheetName) {
        String oldWorksheetName = worksheetName;
        worksheetName = newWorksheetName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_DETAIL_TYPE__WORKSHEET_NAME, oldWorksheetName, worksheetName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.RESOURCE_DETAIL_TYPE__INPUT_TYPE:
                return getInputType();
            case BPMPackage.RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES:
                return isUsingExternalTypes();
            case BPMPackage.RESOURCE_DETAIL_TYPE__WORKSHEET_NAME:
                return getWorksheetName();
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
            case BPMPackage.RESOURCE_DETAIL_TYPE__INPUT_TYPE:
                setInputType((String)newValue);
                return;
            case BPMPackage.RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES:
                setUsingExternalTypes((Boolean)newValue);
                return;
            case BPMPackage.RESOURCE_DETAIL_TYPE__WORKSHEET_NAME:
                setWorksheetName((String)newValue);
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
            case BPMPackage.RESOURCE_DETAIL_TYPE__INPUT_TYPE:
                setInputType(INPUT_TYPE_EDEFAULT);
                return;
            case BPMPackage.RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES:
                unsetUsingExternalTypes();
                return;
            case BPMPackage.RESOURCE_DETAIL_TYPE__WORKSHEET_NAME:
                setWorksheetName(WORKSHEET_NAME_EDEFAULT);
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
            case BPMPackage.RESOURCE_DETAIL_TYPE__INPUT_TYPE:
                return INPUT_TYPE_EDEFAULT == null ? inputType != null : !INPUT_TYPE_EDEFAULT.equals(inputType);
            case BPMPackage.RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES:
                return isSetUsingExternalTypes();
            case BPMPackage.RESOURCE_DETAIL_TYPE__WORKSHEET_NAME:
                return WORKSHEET_NAME_EDEFAULT == null ? worksheetName != null : !WORKSHEET_NAME_EDEFAULT.equals(worksheetName);
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
        result.append(" (inputType: ");
        result.append(inputType);
        result.append(", usingExternalTypes: ");
        if (usingExternalTypesESet) result.append(usingExternalTypes); else result.append("<unset>");
        result.append(", worksheetName: ");
        result.append(worksheetName);
        result.append(')');
        return result.toString();
    }

} //ResourceDetailTypeImpl
