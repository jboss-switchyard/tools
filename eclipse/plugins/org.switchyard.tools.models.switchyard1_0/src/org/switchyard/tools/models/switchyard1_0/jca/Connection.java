/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getJndiName <em>Jndi Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getConnection()
 * @model extendedMetaData="name='Connection' kind='elementOnly'"
 * @generated
 */
public interface Connection extends EObject {
    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.jca.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getConnection_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jndi Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jndi Name</em>' attribute.
     * @see #setJndiName(String)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getConnection_JndiName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='jndiName'"
     * @generated
     */
    String getJndiName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getJndiName <em>Jndi Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jndi Name</em>' attribute.
     * @see #getJndiName()
     * @generated
     */
    void setJndiName(String value);

} // Connection
