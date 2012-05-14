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

import org.switchyard.tools.models.switchyard1_0.spring.ProtobufDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protobuf Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ProtobufDataFormatImpl#getInstanceClass <em>Instance Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtobufDataFormatImpl extends DataFormatImpl implements ProtobufDataFormat {
	/**
     * The default value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInstanceClass()
     * @generated
     * @ordered
     */
	protected static final String INSTANCE_CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInstanceClass()
     * @generated
     * @ordered
     */
	protected String instanceClass = INSTANCE_CLASS_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ProtobufDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getProtobufDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getInstanceClass() {
        return instanceClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInstanceClass(String newInstanceClass) {
        String oldInstanceClass = instanceClass;
        instanceClass = newInstanceClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS, oldInstanceClass, instanceClass));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
                return getInstanceClass();
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
            case SpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
                setInstanceClass((String)newValue);
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
            case SpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
                setInstanceClass(INSTANCE_CLASS_EDEFAULT);
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
            case SpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
                return INSTANCE_CLASS_EDEFAULT == null ? instanceClass != null : !INSTANCE_CLASS_EDEFAULT.equals(instanceClass);
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
        result.append(" (instanceClass: ");
        result.append(instanceClass);
        result.append(')');
        return result.toString();
    }

} //ProtobufDataFormatImpl
