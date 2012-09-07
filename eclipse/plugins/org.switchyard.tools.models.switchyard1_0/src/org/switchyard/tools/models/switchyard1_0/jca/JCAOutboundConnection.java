/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getAny <em>Any</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getManaged <em>Managed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getAnyAttribute <em>Any Attribute</em>}</li>
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

    /**
     * Returns the value of the '<em><b>Res Auth</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.jca.ResAuth}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Res Auth</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Res Auth</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
     * @see #isSetResAuth()
     * @see #unsetResAuth()
     * @see #setResAuth(ResAuth)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection_ResAuth()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='resAuth' namespace='##targetNamespace'"
     * @generated
     */
    ResAuth getResAuth();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResAuth <em>Res Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Res Auth</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
     * @see #isSetResAuth()
     * @see #unsetResAuth()
     * @see #getResAuth()
     * @generated
     */
    void setResAuth(ResAuth value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResAuth <em>Res Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResAuth()
     * @see #getResAuth()
     * @see #setResAuth(ResAuth)
     * @generated
     */
    void unsetResAuth();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResAuth <em>Res Auth</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Res Auth</em>' attribute is set.
     * @see #unsetResAuth()
     * @see #getResAuth()
     * @see #setResAuth(ResAuth)
     * @generated
     */
    boolean isSetResAuth();

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Managed</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Managed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Managed</em>' attribute.
     * @see #isSetManaged()
     * @see #unsetManaged()
     * @see #setManaged(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection_Managed()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='attribute' name='managed'"
     * @generated
     */
    Boolean getManaged();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getManaged <em>Managed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Managed</em>' attribute.
     * @see #isSetManaged()
     * @see #unsetManaged()
     * @see #getManaged()
     * @generated
     */
    void setManaged(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getManaged <em>Managed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetManaged()
     * @see #getManaged()
     * @see #setManaged(Boolean)
     * @generated
     */
    void unsetManaged();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getManaged <em>Managed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Managed</em>' attribute is set.
     * @see #unsetManaged()
     * @see #getManaged()
     * @see #setManaged(Boolean)
     * @generated
     */
    boolean isSetManaged();

    /**
     * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundConnection_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute();

} // JCAOutboundConnection
