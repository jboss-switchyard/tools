/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Socket Protocols Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SecureSocketProtocolsParameters#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSecureSocketProtocolsParameters()
 * @model extendedMetaData="name='secureSocketProtocolsParameters' kind='elementOnly'"
 * @generated
 */
public interface SecureSocketProtocolsParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Secure Socket Protocol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Socket Protocol</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Socket Protocol</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSecureSocketProtocolsParameters_SecureSocketProtocol()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='secureSocketProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSecureSocketProtocol();

} // SecureSocketProtocolsParameters
