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

import org.switchyard.tools.models.switchyard1_0.spring.FilterParameters;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.FilterParametersImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.FilterParametersImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterParametersImpl extends EObjectImpl implements FilterParameters {
	/**
     * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInclude()
     * @generated
     * @ordered
     */
	protected EList<String> include;

	/**
     * The cached value of the '{@link #getExclude() <em>Exclude</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExclude()
     * @generated
     * @ordered
     */
	protected EList<String> exclude;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FilterParametersImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getFilterParameters();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getInclude() {
        if (include == null) {
            include = new EDataTypeEList<String>(String.class, this, SpringPackage.FILTER_PARAMETERS__INCLUDE);
        }
        return include;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getExclude() {
        if (exclude == null) {
            exclude = new EDataTypeEList<String>(String.class, this, SpringPackage.FILTER_PARAMETERS__EXCLUDE);
        }
        return exclude;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.FILTER_PARAMETERS__INCLUDE:
                return getInclude();
            case SpringPackage.FILTER_PARAMETERS__EXCLUDE:
                return getExclude();
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
            case SpringPackage.FILTER_PARAMETERS__INCLUDE:
                getInclude().clear();
                getInclude().addAll((Collection<? extends String>)newValue);
                return;
            case SpringPackage.FILTER_PARAMETERS__EXCLUDE:
                getExclude().clear();
                getExclude().addAll((Collection<? extends String>)newValue);
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
            case SpringPackage.FILTER_PARAMETERS__INCLUDE:
                getInclude().clear();
                return;
            case SpringPackage.FILTER_PARAMETERS__EXCLUDE:
                getExclude().clear();
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
            case SpringPackage.FILTER_PARAMETERS__INCLUDE:
                return include != null && !include.isEmpty();
            case SpringPackage.FILTER_PARAMETERS__EXCLUDE:
                return exclude != null && !exclude.isEmpty();
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
        result.append(" (include: ");
        result.append(include);
        result.append(", exclude: ");
        result.append(exclude);
        result.append(')');
        return result.toString();
    }

} //FilterParametersImpl
