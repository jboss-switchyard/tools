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

import org.switchyard.tools.models.switchyard1_0.spring.SecureSocketProtocolsParameters;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secure Socket Protocols Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SecureSocketProtocolsParametersImpl#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecureSocketProtocolsParametersImpl extends EObjectImpl implements SecureSocketProtocolsParameters {
	/**
     * The cached value of the '{@link #getSecureSocketProtocol() <em>Secure Socket Protocol</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSecureSocketProtocol()
     * @generated
     * @ordered
     */
	protected EList<String> secureSocketProtocol;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SecureSocketProtocolsParametersImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getSecureSocketProtocolsParameters();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getSecureSocketProtocol() {
        if (secureSocketProtocol == null) {
            secureSocketProtocol = new EDataTypeEList<String>(String.class, this, SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL);
        }
        return secureSocketProtocol;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
                return getSecureSocketProtocol();
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
            case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
                getSecureSocketProtocol().clear();
                getSecureSocketProtocol().addAll((Collection<? extends String>)newValue);
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
            case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
                getSecureSocketProtocol().clear();
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
            case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS__SECURE_SOCKET_PROTOCOL:
                return secureSocketProtocol != null && !secureSocketProtocol.isEmpty();
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
        result.append(" (secureSocketProtocol: ");
        result.append(secureSocketProtocol);
        result.append(')');
        return result.toString();
    }

} //SecureSocketProtocolsParametersImpl
