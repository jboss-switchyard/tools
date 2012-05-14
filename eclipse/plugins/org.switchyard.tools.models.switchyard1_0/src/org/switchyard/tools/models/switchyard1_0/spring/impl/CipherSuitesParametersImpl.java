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

import org.switchyard.tools.models.switchyard1_0.spring.CipherSuitesParameters;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cipher Suites Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CipherSuitesParametersImpl#getCipherSuite <em>Cipher Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CipherSuitesParametersImpl extends EObjectImpl implements CipherSuitesParameters {
	/**
     * The cached value of the '{@link #getCipherSuite() <em>Cipher Suite</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCipherSuite()
     * @generated
     * @ordered
     */
	protected EList<String> cipherSuite;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CipherSuitesParametersImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getCipherSuitesParameters();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getCipherSuite() {
        if (cipherSuite == null) {
            cipherSuite = new EDataTypeEList<String>(String.class, this, SpringPackage.CIPHER_SUITES_PARAMETERS__CIPHER_SUITE);
        }
        return cipherSuite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.CIPHER_SUITES_PARAMETERS__CIPHER_SUITE:
                return getCipherSuite();
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
            case SpringPackage.CIPHER_SUITES_PARAMETERS__CIPHER_SUITE:
                getCipherSuite().clear();
                getCipherSuite().addAll((Collection<? extends String>)newValue);
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
            case SpringPackage.CIPHER_SUITES_PARAMETERS__CIPHER_SUITE:
                getCipherSuite().clear();
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
            case SpringPackage.CIPHER_SUITES_PARAMETERS__CIPHER_SUITE:
                return cipherSuite != null && !cipherSuite.isEmpty();
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
        result.append(" (cipherSuite: ");
        result.append(cipherSuite);
        result.append(')');
        return result.toString();
    }

} //CipherSuitesParametersImpl
