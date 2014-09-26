/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.InputMappingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.InputMappingTypeImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputMappingTypeImpl extends MappingTypeImpl implements InputMappingType {
    /**
     * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected String output = OUTPUT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputMappingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.INPUT_MAPPING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOutput() {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutput(String newOutput) {
        String oldOutput = output;
        output = newOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.INPUT_MAPPING_TYPE__OUTPUT, oldOutput, output));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.INPUT_MAPPING_TYPE__OUTPUT:
                return getOutput();
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
            case BPMPackage.INPUT_MAPPING_TYPE__OUTPUT:
                setOutput((String)newValue);
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
            case BPMPackage.INPUT_MAPPING_TYPE__OUTPUT:
                setOutput(OUTPUT_EDEFAULT);
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
            case BPMPackage.INPUT_MAPPING_TYPE__OUTPUT:
                return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
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
        result.append(" (output: ");
        result.append(output);
        result.append(')');
        return result.toString();
    }

} //InputMappingTypeImpl
