/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.BindyType;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bindy Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BindyDataFormatImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BindyDataFormatImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BindyDataFormatImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindyDataFormatImpl extends DataFormatImpl implements BindyDataFormat {
	/**
     * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLocale()
     * @generated
     * @ordered
     */
	protected static final String LOCALE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLocale()
     * @generated
     * @ordered
     */
	protected String locale = LOCALE_EDEFAULT;

	/**
     * The default value of the '{@link #getPackages() <em>Packages</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
	protected static final List<String> PACKAGES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
	protected List<String> packages = PACKAGES_EDEFAULT;

	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final BindyType TYPE_EDEFAULT = BindyType.CSV;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected BindyType type = TYPE_EDEFAULT;

	/**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean typeESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BindyDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getBindyDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLocale() {
        return locale;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLocale(String newLocale) {
        String oldLocale = locale;
        locale = newLocale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BINDY_DATA_FORMAT__LOCALE, oldLocale, locale));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<String> getPackages() {
        return packages;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPackages(List<String> newPackages) {
        List<String> oldPackages = packages;
        packages = newPackages;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BINDY_DATA_FORMAT__PACKAGES, oldPackages, packages));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BindyType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(BindyType newType) {
        BindyType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BINDY_DATA_FORMAT__TYPE, oldType, type, !oldTypeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetType() {
        BindyType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BINDY_DATA_FORMAT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetType() {
        return typeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.BINDY_DATA_FORMAT__LOCALE:
                return getLocale();
            case SpringPackage.BINDY_DATA_FORMAT__PACKAGES:
                return getPackages();
            case SpringPackage.BINDY_DATA_FORMAT__TYPE:
                return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.BINDY_DATA_FORMAT__LOCALE:
                setLocale((String)newValue);
                return;
            case SpringPackage.BINDY_DATA_FORMAT__PACKAGES:
                setPackages((List<String>)newValue);
                return;
            case SpringPackage.BINDY_DATA_FORMAT__TYPE:
                setType((BindyType)newValue);
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
            case SpringPackage.BINDY_DATA_FORMAT__LOCALE:
                setLocale(LOCALE_EDEFAULT);
                return;
            case SpringPackage.BINDY_DATA_FORMAT__PACKAGES:
                setPackages(PACKAGES_EDEFAULT);
                return;
            case SpringPackage.BINDY_DATA_FORMAT__TYPE:
                unsetType();
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
            case SpringPackage.BINDY_DATA_FORMAT__LOCALE:
                return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
            case SpringPackage.BINDY_DATA_FORMAT__PACKAGES:
                return PACKAGES_EDEFAULT == null ? packages != null : !PACKAGES_EDEFAULT.equals(packages);
            case SpringPackage.BINDY_DATA_FORMAT__TYPE:
                return isSetType();
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
        result.append(" (locale: ");
        result.append(locale);
        result.append(", packages: ");
        result.append(packages);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //BindyDataFormatImpl
