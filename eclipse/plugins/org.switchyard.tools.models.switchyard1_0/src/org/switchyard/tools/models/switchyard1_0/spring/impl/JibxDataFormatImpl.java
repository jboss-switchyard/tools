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

import org.switchyard.tools.models.switchyard1_0.spring.JibxDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jibx Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JibxDataFormatImpl#getUnmarshallClass <em>Unmarshall Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JibxDataFormatImpl extends DataFormatImpl implements JibxDataFormat {
	/**
     * The default value of the '{@link #getUnmarshallClass() <em>Unmarshall Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnmarshallClass()
     * @generated
     * @ordered
     */
	protected static final String UNMARSHALL_CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUnmarshallClass() <em>Unmarshall Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnmarshallClass()
     * @generated
     * @ordered
     */
	protected String unmarshallClass = UNMARSHALL_CLASS_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JibxDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getJibxDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUnmarshallClass() {
        return unmarshallClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUnmarshallClass(String newUnmarshallClass) {
        String oldUnmarshallClass = unmarshallClass;
        unmarshallClass = newUnmarshallClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JIBX_DATA_FORMAT__UNMARSHALL_CLASS, oldUnmarshallClass, unmarshallClass));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.JIBX_DATA_FORMAT__UNMARSHALL_CLASS:
                return getUnmarshallClass();
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
            case SpringPackage.JIBX_DATA_FORMAT__UNMARSHALL_CLASS:
                setUnmarshallClass((String)newValue);
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
            case SpringPackage.JIBX_DATA_FORMAT__UNMARSHALL_CLASS:
                setUnmarshallClass(UNMARSHALL_CLASS_EDEFAULT);
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
            case SpringPackage.JIBX_DATA_FORMAT__UNMARSHALL_CLASS:
                return UNMARSHALL_CLASS_EDEFAULT == null ? unmarshallClass != null : !UNMARSHALL_CLASS_EDEFAULT.equals(unmarshallClass);
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
        result.append(" (unmarshallClass: ");
        result.append(unmarshallClass);
        result.append(')');
        return result.toString();
    }

} //JibxDataFormatImpl
