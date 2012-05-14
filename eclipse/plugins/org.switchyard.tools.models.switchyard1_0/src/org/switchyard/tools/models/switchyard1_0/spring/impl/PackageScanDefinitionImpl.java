/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.switchyard.tools.models.switchyard1_0.spring.PackageScanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Scan Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PackageScanDefinitionImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PackageScanDefinitionImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.PackageScanDefinitionImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageScanDefinitionImpl extends EObjectImpl implements PackageScanDefinition {
	/**
     * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackage()
     * @generated
     * @ordered
     */
	protected EList<String> package_;

	/**
     * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExcludes()
     * @generated
     * @ordered
     */
	protected EList<String> excludes;

	/**
     * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIncludes()
     * @generated
     * @ordered
     */
	protected EList<String> includes;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PackageScanDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getPackageScanDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getPackage() {
        if (package_ == null) {
            package_ = new EDataTypeEList<String>(String.class, this, SpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE);
        }
        return package_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getExcludes() {
        if (excludes == null) {
            excludes = new EDataTypeEList<String>(String.class, this, SpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES);
        }
        return excludes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getIncludes() {
        if (includes == null) {
            includes = new EDataTypeEList<String>(String.class, this, SpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES);
        }
        return includes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
                return getPackage();
            case SpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
                return getExcludes();
            case SpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
                return getIncludes();
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
            case SpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
                getPackage().clear();
                getPackage().addAll((Collection<? extends String>)newValue);
                return;
            case SpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
                getExcludes().clear();
                getExcludes().addAll((Collection<? extends String>)newValue);
                return;
            case SpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
                getIncludes().clear();
                getIncludes().addAll((Collection<? extends String>)newValue);
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
            case SpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
                getPackage().clear();
                return;
            case SpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
                getExcludes().clear();
                return;
            case SpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
                getIncludes().clear();
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
            case SpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
                return package_ != null && !package_.isEmpty();
            case SpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
                return excludes != null && !excludes.isEmpty();
            case SpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
                return includes != null && !includes.isEmpty();
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
        result.append(" (package: ");
        result.append(package_);
        result.append(", excludes: ");
        result.append(excludes);
        result.append(", includes: ");
        result.append(includes);
        result.append(')');
        return result.toString();
    }

} //PackageScanDefinitionImpl
