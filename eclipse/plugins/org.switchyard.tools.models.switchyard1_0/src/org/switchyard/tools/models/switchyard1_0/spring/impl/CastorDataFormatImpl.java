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

import org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Castor Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CastorDataFormatImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CastorDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CastorDataFormatImpl#getMappingFile <em>Mapping File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CastorDataFormatImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CastorDataFormatImpl#isValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CastorDataFormatImpl extends DataFormatImpl implements CastorDataFormat {
	/**
	 * The default value of the '{@link #getClasses() <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected List<String> classes = CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappingFile() <em>Mapping File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingFile()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingFile() <em>Mapping File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingFile()
	 * @generated
	 * @ordered
	 */
	protected String mappingFile = MAPPING_FILE_EDEFAULT;

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
	 * The default value of the '{@link #isValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidation()
	 * @generated
	 * @ordered
	 */
	protected boolean validation = VALIDATION_EDEFAULT;

	/**
	 * This is true if the Validation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CastorDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getCastorDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasses(List<String> newClasses) {
		List<String> oldClasses = classes;
		classes = newClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CASTOR_DATA_FORMAT__CLASSES, oldClasses, classes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CASTOR_DATA_FORMAT__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappingFile() {
		return mappingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingFile(String newMappingFile) {
		String oldMappingFile = mappingFile;
		mappingFile = newMappingFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CASTOR_DATA_FORMAT__MAPPING_FILE, oldMappingFile, mappingFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CASTOR_DATA_FORMAT__PACKAGES, oldPackages, packages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(boolean newValidation) {
		boolean oldValidation = validation;
		validation = newValidation;
		boolean oldValidationESet = validationESet;
		validationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CASTOR_DATA_FORMAT__VALIDATION, oldValidation, validation, !oldValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidation() {
		boolean oldValidation = validation;
		boolean oldValidationESet = validationESet;
		validation = VALIDATION_EDEFAULT;
		validationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CASTOR_DATA_FORMAT__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidation() {
		return validationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.CASTOR_DATA_FORMAT__CLASSES:
				return getClasses();
			case SpringPackage.CASTOR_DATA_FORMAT__ENCODING:
				return getEncoding();
			case SpringPackage.CASTOR_DATA_FORMAT__MAPPING_FILE:
				return getMappingFile();
			case SpringPackage.CASTOR_DATA_FORMAT__PACKAGES:
				return getPackages();
			case SpringPackage.CASTOR_DATA_FORMAT__VALIDATION:
				return isValidation();
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
			case SpringPackage.CASTOR_DATA_FORMAT__CLASSES:
				setClasses((List<String>)newValue);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__ENCODING:
				setEncoding((String)newValue);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__MAPPING_FILE:
				setMappingFile((String)newValue);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__PACKAGES:
				setPackages((List<String>)newValue);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__VALIDATION:
				setValidation((Boolean)newValue);
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
			case SpringPackage.CASTOR_DATA_FORMAT__CLASSES:
				setClasses(CLASSES_EDEFAULT);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__MAPPING_FILE:
				setMappingFile(MAPPING_FILE_EDEFAULT);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__PACKAGES:
				setPackages(PACKAGES_EDEFAULT);
				return;
			case SpringPackage.CASTOR_DATA_FORMAT__VALIDATION:
				unsetValidation();
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
			case SpringPackage.CASTOR_DATA_FORMAT__CLASSES:
				return CLASSES_EDEFAULT == null ? classes != null : !CLASSES_EDEFAULT.equals(classes);
			case SpringPackage.CASTOR_DATA_FORMAT__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case SpringPackage.CASTOR_DATA_FORMAT__MAPPING_FILE:
				return MAPPING_FILE_EDEFAULT == null ? mappingFile != null : !MAPPING_FILE_EDEFAULT.equals(mappingFile);
			case SpringPackage.CASTOR_DATA_FORMAT__PACKAGES:
				return PACKAGES_EDEFAULT == null ? packages != null : !PACKAGES_EDEFAULT.equals(packages);
			case SpringPackage.CASTOR_DATA_FORMAT__VALIDATION:
				return isSetValidation();
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
		result.append(" (classes: ");
		result.append(classes);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", mappingFile: ");
		result.append(mappingFile);
		result.append(", packages: ");
		result.append(packages);
		result.append(", validation: ");
		if (validationESet) result.append(validation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CastorDataFormatImpl
