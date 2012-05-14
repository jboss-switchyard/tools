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
import org.switchyard.tools.models.switchyard1_0.spring.ZipDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ZipDataFormatImpl#getCompressionLevel <em>Compression Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZipDataFormatImpl extends DataFormatImpl implements ZipDataFormat {
	/**
     * The default value of the '{@link #getCompressionLevel() <em>Compression Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompressionLevel()
     * @generated
     * @ordered
     */
	protected static final int COMPRESSION_LEVEL_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCompressionLevel() <em>Compression Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompressionLevel()
     * @generated
     * @ordered
     */
	protected int compressionLevel = COMPRESSION_LEVEL_EDEFAULT;

	/**
     * This is true if the Compression Level attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean compressionLevelESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ZipDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getZipDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCompressionLevel() {
        return compressionLevel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompressionLevel(int newCompressionLevel) {
        int oldCompressionLevel = compressionLevel;
        compressionLevel = newCompressionLevel;
        boolean oldCompressionLevelESet = compressionLevelESet;
        compressionLevelESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ZIP_DATA_FORMAT__COMPRESSION_LEVEL, oldCompressionLevel, compressionLevel, !oldCompressionLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCompressionLevel() {
        int oldCompressionLevel = compressionLevel;
        boolean oldCompressionLevelESet = compressionLevelESet;
        compressionLevel = COMPRESSION_LEVEL_EDEFAULT;
        compressionLevelESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ZIP_DATA_FORMAT__COMPRESSION_LEVEL, oldCompressionLevel, COMPRESSION_LEVEL_EDEFAULT, oldCompressionLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCompressionLevel() {
        return compressionLevelESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.ZIP_DATA_FORMAT__COMPRESSION_LEVEL:
                return getCompressionLevel();
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
            case SpringPackage.ZIP_DATA_FORMAT__COMPRESSION_LEVEL:
                setCompressionLevel((Integer)newValue);
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
            case SpringPackage.ZIP_DATA_FORMAT__COMPRESSION_LEVEL:
                unsetCompressionLevel();
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
            case SpringPackage.ZIP_DATA_FORMAT__COMPRESSION_LEVEL:
                return isSetCompressionLevel();
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
        result.append(" (compressionLevel: ");
        if (compressionLevelESet) result.append(compressionLevel); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ZipDataFormatImpl
