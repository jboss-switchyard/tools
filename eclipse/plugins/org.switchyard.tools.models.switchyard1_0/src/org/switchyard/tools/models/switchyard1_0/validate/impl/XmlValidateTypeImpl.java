/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;


import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidateTypeImpl;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Validate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getSchemaFile <em>Schema File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl#getFailOnWarning <em>Fail On Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlValidateTypeImpl extends ValidateTypeImpl implements XmlValidateType {
	/**
     * The default value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchemaType()
     * @generated
     * @ordered
     */
	protected static final XmlSchemaType SCHEMA_TYPE_EDEFAULT = XmlSchemaType.DTD;
	/**
     * The cached value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchemaType()
     * @generated
     * @ordered
     */
	protected XmlSchemaType schemaType = SCHEMA_TYPE_EDEFAULT;
	/**
     * The default value of the '{@link #getSchemaFile() <em>Schema File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchemaFile()
     * @generated
     * @ordered
     */
	protected static final String SCHEMA_FILE_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getSchemaFile() <em>Schema File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchemaFile()
     * @generated
     * @ordered
     */
	protected String schemaFile = SCHEMA_FILE_EDEFAULT;
	/**
     * The default value of the '{@link #getFailOnWarning() <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFailOnWarning()
     * @generated
     * @ordered
     */
	protected static final String FAIL_ON_WARNING_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getFailOnWarning() <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFailOnWarning()
     * @generated
     * @ordered
     */
	protected String failOnWarning = FAIL_ON_WARNING_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XmlValidateTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ValidatePackage.Literals.XML_VALIDATE_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlSchemaType getSchemaType() {
        return schemaType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchemaType(XmlSchemaType newSchemaType) {
        XmlSchemaType oldSchemaType = schemaType;
        schemaType = newSchemaType == null ? SCHEMA_TYPE_EDEFAULT : newSchemaType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE, oldSchemaType, schemaType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSchemaFile() {
        return schemaFile;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchemaFile(String newSchemaFile) {
        String oldSchemaFile = schemaFile;
        schemaFile = newSchemaFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILE, oldSchemaFile, schemaFile));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFailOnWarning() {
        return failOnWarning;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFailOnWarning(String newFailOnWarning) {
        String oldFailOnWarning = failOnWarning;
        failOnWarning = newFailOnWarning;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING, oldFailOnWarning, failOnWarning));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                return getSchemaType();
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILE:
                return getSchemaFile();
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                return getFailOnWarning();
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                setSchemaType((XmlSchemaType)newValue);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILE:
                setSchemaFile((String)newValue);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                setFailOnWarning((String)newValue);
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                setSchemaType(SCHEMA_TYPE_EDEFAULT);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILE:
                setSchemaFile(SCHEMA_FILE_EDEFAULT);
                return;
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                setFailOnWarning(FAIL_ON_WARNING_EDEFAULT);
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
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_TYPE:
                return schemaType != SCHEMA_TYPE_EDEFAULT;
            case ValidatePackage.XML_VALIDATE_TYPE__SCHEMA_FILE:
                return SCHEMA_FILE_EDEFAULT == null ? schemaFile != null : !SCHEMA_FILE_EDEFAULT.equals(schemaFile);
            case ValidatePackage.XML_VALIDATE_TYPE__FAIL_ON_WARNING:
                return FAIL_ON_WARNING_EDEFAULT == null ? failOnWarning != null : !FAIL_ON_WARNING_EDEFAULT.equals(failOnWarning);
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
        result.append(" (schemaType: ");
        result.append(schemaType);
        result.append(", schemaFile: ");
        result.append(schemaFile);
        result.append(", failOnWarning: ");
        result.append(failOnWarning);
        result.append(')');
        return result.toString();
    }

} //XmlValidateTypeImpl
