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

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.TidyMarkupDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tidy Markup Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.TidyMarkupDataFormatImpl#getDataObjectType <em>Data Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TidyMarkupDataFormatImpl extends DataFormatImpl implements TidyMarkupDataFormat {
	/**
     * The default value of the '{@link #getDataObjectType() <em>Data Object Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataObjectType()
     * @generated
     * @ordered
     */
	protected static final String DATA_OBJECT_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDataObjectType() <em>Data Object Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataObjectType()
     * @generated
     * @ordered
     */
	protected String dataObjectType = DATA_OBJECT_TYPE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TidyMarkupDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getTidyMarkupDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDataObjectType() {
        return dataObjectType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDataObjectType(String newDataObjectType) {
        String oldDataObjectType = dataObjectType;
        dataObjectType = newDataObjectType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE, oldDataObjectType, dataObjectType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
                return getDataObjectType();
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
            case SpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
                setDataObjectType((String)newValue);
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
            case SpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
                setDataObjectType(DATA_OBJECT_TYPE_EDEFAULT);
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
            case SpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
                return DATA_OBJECT_TYPE_EDEFAULT == null ? dataObjectType != null : !DATA_OBJECT_TYPE_EDEFAULT.equals(dataObjectType);
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
        result.append(" (dataObjectType: ");
        result.append(dataObjectType);
        result.append(')');
        return result.toString();
    }

} //TidyMarkupDataFormatImpl
