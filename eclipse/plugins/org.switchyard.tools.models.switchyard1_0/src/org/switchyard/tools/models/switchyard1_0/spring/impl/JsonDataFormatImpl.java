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

import org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.JsonLibrary;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JsonDataFormatImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JsonDataFormatImpl#isPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JsonDataFormatImpl#getUnmarshalTypeName <em>Unmarshal Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonDataFormatImpl extends DataFormatImpl implements JsonDataFormat {
	/**
     * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
	protected static final JsonLibrary LIBRARY_EDEFAULT = JsonLibrary.XSTREAM;

	/**
     * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
	protected JsonLibrary library = LIBRARY_EDEFAULT;

	/**
     * This is true if the Library attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean libraryESet;

	/**
     * The default value of the '{@link #isPrettyPrint() <em>Pretty Print</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isPrettyPrint()
     * @generated
     * @ordered
     */
	protected static final boolean PRETTY_PRINT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isPrettyPrint() <em>Pretty Print</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isPrettyPrint()
     * @generated
     * @ordered
     */
	protected boolean prettyPrint = PRETTY_PRINT_EDEFAULT;

	/**
     * This is true if the Pretty Print attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean prettyPrintESet;

	/**
     * The default value of the '{@link #getUnmarshalTypeName() <em>Unmarshal Type Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnmarshalTypeName()
     * @generated
     * @ordered
     */
	protected static final String UNMARSHAL_TYPE_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUnmarshalTypeName() <em>Unmarshal Type Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnmarshalTypeName()
     * @generated
     * @ordered
     */
	protected String unmarshalTypeName = UNMARSHAL_TYPE_NAME_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JsonDataFormatImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getJsonDataFormat();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JsonLibrary getLibrary() {
        return library;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLibrary(JsonLibrary newLibrary) {
        JsonLibrary oldLibrary = library;
        library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
        boolean oldLibraryESet = libraryESet;
        libraryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JSON_DATA_FORMAT__LIBRARY, oldLibrary, library, !oldLibraryESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetLibrary() {
        JsonLibrary oldLibrary = library;
        boolean oldLibraryESet = libraryESet;
        library = LIBRARY_EDEFAULT;
        libraryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.JSON_DATA_FORMAT__LIBRARY, oldLibrary, LIBRARY_EDEFAULT, oldLibraryESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetLibrary() {
        return libraryESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isPrettyPrint() {
        return prettyPrint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPrettyPrint(boolean newPrettyPrint) {
        boolean oldPrettyPrint = prettyPrint;
        prettyPrint = newPrettyPrint;
        boolean oldPrettyPrintESet = prettyPrintESet;
        prettyPrintESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JSON_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint, !oldPrettyPrintESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetPrettyPrint() {
        boolean oldPrettyPrint = prettyPrint;
        boolean oldPrettyPrintESet = prettyPrintESet;
        prettyPrint = PRETTY_PRINT_EDEFAULT;
        prettyPrintESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.JSON_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, PRETTY_PRINT_EDEFAULT, oldPrettyPrintESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetPrettyPrint() {
        return prettyPrintESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUnmarshalTypeName() {
        return unmarshalTypeName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUnmarshalTypeName(String newUnmarshalTypeName) {
        String oldUnmarshalTypeName = unmarshalTypeName;
        unmarshalTypeName = newUnmarshalTypeName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JSON_DATA_FORMAT__UNMARSHAL_TYPE_NAME, oldUnmarshalTypeName, unmarshalTypeName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.JSON_DATA_FORMAT__LIBRARY:
                return getLibrary();
            case SpringPackage.JSON_DATA_FORMAT__PRETTY_PRINT:
                return isPrettyPrint();
            case SpringPackage.JSON_DATA_FORMAT__UNMARSHAL_TYPE_NAME:
                return getUnmarshalTypeName();
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
            case SpringPackage.JSON_DATA_FORMAT__LIBRARY:
                setLibrary((JsonLibrary)newValue);
                return;
            case SpringPackage.JSON_DATA_FORMAT__PRETTY_PRINT:
                setPrettyPrint((Boolean)newValue);
                return;
            case SpringPackage.JSON_DATA_FORMAT__UNMARSHAL_TYPE_NAME:
                setUnmarshalTypeName((String)newValue);
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
            case SpringPackage.JSON_DATA_FORMAT__LIBRARY:
                unsetLibrary();
                return;
            case SpringPackage.JSON_DATA_FORMAT__PRETTY_PRINT:
                unsetPrettyPrint();
                return;
            case SpringPackage.JSON_DATA_FORMAT__UNMARSHAL_TYPE_NAME:
                setUnmarshalTypeName(UNMARSHAL_TYPE_NAME_EDEFAULT);
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
            case SpringPackage.JSON_DATA_FORMAT__LIBRARY:
                return isSetLibrary();
            case SpringPackage.JSON_DATA_FORMAT__PRETTY_PRINT:
                return isSetPrettyPrint();
            case SpringPackage.JSON_DATA_FORMAT__UNMARSHAL_TYPE_NAME:
                return UNMARSHAL_TYPE_NAME_EDEFAULT == null ? unmarshalTypeName != null : !UNMARSHAL_TYPE_NAME_EDEFAULT.equals(unmarshalTypeName);
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
        result.append(" (library: ");
        if (libraryESet) result.append(library); else result.append("<unset>");
        result.append(", prettyPrint: ");
        if (prettyPrintESet) result.append(prettyPrint); else result.append("<unset>");
        result.append(", unmarshalTypeName: ");
        result.append(unmarshalTypeName);
        result.append(')');
        return result.toString();
    }

} //JsonDataFormatImpl
