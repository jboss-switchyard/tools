/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Outbound Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection()
 * @model extendedMetaData="name='JCAOutboundConnection' kind='elementOnly'"
 * @generated
 */
public interface JCAOutboundConnection extends EObject {
    /**
     * Returns the value of the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Adapter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Adapter</em>' containment reference.
     * @see #setResourceAdapter(ResourceAdapter)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection_ResourceAdapter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='resourceAdapter' namespace='##targetNamespace'"
     * @generated
     */
    ResourceAdapter getResourceAdapter();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResourceAdapter <em>Resource Adapter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Adapter</em>' containment reference.
     * @see #getResourceAdapter()
     * @generated
     */
    void setResourceAdapter(ResourceAdapter value);

    /**
     * Returns the value of the '<em><b>Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' containment reference.
     * @see #setConnection(Connection)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection_Connection()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='connection' namespace='##targetNamespace'"
     * @generated
     */
    Connection getConnection();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getConnection <em>Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection</em>' containment reference.
     * @see #getConnection()
     * @generated
     */
    void setConnection(Connection value);

} // JCAOutboundConnection
