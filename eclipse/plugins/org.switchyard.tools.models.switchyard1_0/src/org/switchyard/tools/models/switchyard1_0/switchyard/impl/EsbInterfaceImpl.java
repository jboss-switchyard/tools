/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.InterfaceImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Esb Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl#getFaultType <em>Fault Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EsbInterfaceImpl extends InterfaceImpl implements EsbInterface {
	/**
     * The default value of the '{@link #getFaultType() <em>Fault Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultType()
     * @generated
     * @ordered
     */
    protected static final String FAULT_TYPE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getFaultType() <em>Fault Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultType()
     * @generated
     * @ordered
     */
    protected String faultType = FAULT_TYPE_EDEFAULT;
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
     * The default value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputType()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_TYPE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputType()
     * @generated
     * @ordered
     */
    protected String outputType = OUTPUT_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EsbInterfaceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.ESB_INTERFACE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.ESB_INTERFACE__INPUT_TYPE, oldInputType, inputType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputType(String newOutputType) {
        String oldOutputType = outputType;
        outputType = newOutputType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.ESB_INTERFACE__OUTPUT_TYPE, oldOutputType, outputType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFaultType(String newFaultType) {
        String oldFaultType = faultType;
        faultType = newFaultType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.ESB_INTERFACE__FAULT_TYPE, oldFaultType, faultType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SwitchyardPackage.ESB_INTERFACE__FAULT_TYPE:
                return getFaultType();
            case SwitchyardPackage.ESB_INTERFACE__INPUT_TYPE:
                return getInputType();
            case SwitchyardPackage.ESB_INTERFACE__OUTPUT_TYPE:
                return getOutputType();
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
            case SwitchyardPackage.ESB_INTERFACE__FAULT_TYPE:
                setFaultType((String)newValue);
                return;
            case SwitchyardPackage.ESB_INTERFACE__INPUT_TYPE:
                setInputType((String)newValue);
                return;
            case SwitchyardPackage.ESB_INTERFACE__OUTPUT_TYPE:
                setOutputType((String)newValue);
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
            case SwitchyardPackage.ESB_INTERFACE__FAULT_TYPE:
                setFaultType(FAULT_TYPE_EDEFAULT);
                return;
            case SwitchyardPackage.ESB_INTERFACE__INPUT_TYPE:
                setInputType(INPUT_TYPE_EDEFAULT);
                return;
            case SwitchyardPackage.ESB_INTERFACE__OUTPUT_TYPE:
                setOutputType(OUTPUT_TYPE_EDEFAULT);
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
            case SwitchyardPackage.ESB_INTERFACE__FAULT_TYPE:
                return FAULT_TYPE_EDEFAULT == null ? faultType != null : !FAULT_TYPE_EDEFAULT.equals(faultType);
            case SwitchyardPackage.ESB_INTERFACE__INPUT_TYPE:
                return INPUT_TYPE_EDEFAULT == null ? inputType != null : !INPUT_TYPE_EDEFAULT.equals(inputType);
            case SwitchyardPackage.ESB_INTERFACE__OUTPUT_TYPE:
                return OUTPUT_TYPE_EDEFAULT == null ? outputType != null : !OUTPUT_TYPE_EDEFAULT.equals(outputType);
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
        result.append(" (faultType: ");
        result.append(faultType);
        result.append(", inputType: ");
        result.append(inputType);
        result.append(", outputType: ");
        result.append(outputType);
        result.append(')');
        return result.toString();
    }

} //EsbInterfaceImpl
