/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hl7 Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.Hl7DataFormatImpl#isValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hl7DataFormatImpl extends DataFormatImpl implements Hl7DataFormat {
	/**
     * The default value of the '{@link #isValidate() <em>Validate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isValidate()
     * @generated
     * @ordered
     */
	protected static final boolean VALIDATE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isValidate() <em>Validate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isValidate()
     * @generated
     * @ordered
     */
	protected boolean validate = VALIDATE_EDEFAULT;

	/**
     * This is true if the Validate attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean validateESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Hl7DataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getHl7DataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isValidate() {
        return validate;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValidate(boolean newValidate) {
        boolean oldValidate = validate;
        validate = newValidate;
        boolean oldValidateESet = validateESet;
        validateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.HL7_DATA_FORMAT__VALIDATE, oldValidate, validate, !oldValidateESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetValidate() {
        boolean oldValidate = validate;
        boolean oldValidateESet = validateESet;
        validate = VALIDATE_EDEFAULT;
        validateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.HL7_DATA_FORMAT__VALIDATE, oldValidate, VALIDATE_EDEFAULT, oldValidateESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetValidate() {
        return validateESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.HL7_DATA_FORMAT__VALIDATE:
                return isValidate();
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
            case SpringPackage.HL7_DATA_FORMAT__VALIDATE:
                setValidate((Boolean)newValue);
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
            case SpringPackage.HL7_DATA_FORMAT__VALIDATE:
                unsetValidate();
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
            case SpringPackage.HL7_DATA_FORMAT__VALIDATE:
                return isSetValidate();
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
        result.append(" (validate: ");
        if (validateESet) result.append(validate); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //Hl7DataFormatImpl
