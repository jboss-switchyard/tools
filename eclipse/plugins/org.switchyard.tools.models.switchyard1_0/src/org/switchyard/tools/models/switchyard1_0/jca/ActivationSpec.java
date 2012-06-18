/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getAny <em>Any</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getCreate <em>Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec()
 * @model extendedMetaData="name='ActivationSpec' kind='elementOnly'"
 * @generated
 */
public interface ActivationSpec extends EObject {
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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<Property> getProperty();

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Create</b></em>' attribute.
     * The default value is <code>"ifNotExist"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Create</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
     * @see #isSetCreate()
     * @see #unsetCreate()
     * @see #setCreate(JCACreateResource)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec_Create()
     * @model default="ifNotExist" unsettable="true"
     *        extendedMetaData="kind='attribute' name='create'"
     * @generated
     */
    JCACreateResource getCreate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getCreate <em>Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
     * @see #isSetCreate()
     * @see #unsetCreate()
     * @see #getCreate()
     * @generated
     */
    void setCreate(JCACreateResource value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getCreate <em>Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCreate()
     * @see #getCreate()
     * @see #setCreate(JCACreateResource)
     * @generated
     */
    void unsetCreate();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getCreate <em>Create</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Create</em>' attribute is set.
     * @see #unsetCreate()
     * @see #getCreate()
     * @see #setCreate(JCACreateResource)
     * @generated
     */
    boolean isSetCreate();

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec_JndiName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='jndiName'"
     * @generated
     */
    String getJndiName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getJndiName <em>Jndi Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jndi Name</em>' attribute.
     * @see #getJndiName()
     * @generated
     */
    void setJndiName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getActivationSpec_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute();

} // ActivationSpec
