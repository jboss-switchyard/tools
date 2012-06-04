/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMS Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSDestination()
 * @model extendedMetaData="name='JMSDestination' kind='elementOnly'"
 * @generated
 */
public interface JMSDestination extends EObject {
	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSDestination_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
	EList<BindingProperty> getProperty();

	/**
     * Returns the value of the '<em><b>Create</b></em>' attribute.
     * The default value is <code>"ifNotExist"</code>.
     * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Create</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource
     * @see #isSetCreate()
     * @see #unsetCreate()
     * @see #setCreate(JMSCreateResource)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSDestination_Create()
     * @model default="ifNotExist" unsettable="true"
     *        extendedMetaData="kind='attribute' name='create'"
     * @generated
     */
	JMSCreateResource getCreate();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getCreate <em>Create</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource
     * @see #isSetCreate()
     * @see #unsetCreate()
     * @see #getCreate()
     * @generated
     */
	void setCreate(JMSCreateResource value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getCreate <em>Create</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCreate()
     * @see #getCreate()
     * @see #setCreate(JMSCreateResource)
     * @generated
     */
	void unsetCreate();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getCreate <em>Create</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Create</em>' attribute is set.
     * @see #unsetCreate()
     * @see #getCreate()
     * @see #setCreate(JMSCreateResource)
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSDestination_JndiName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='jndiName'"
     * @generated
     */
	String getJndiName();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getJndiName <em>Jndi Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jndi Name</em>' attribute.
     * @see #getJndiName()
     * @generated
     */
	void setJndiName(String value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"queue"</code>.
     * The literals are from the enumeration {@link org.eclipse.soa.sca.sca1_1.model.sca.TypeType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSDestination_Type()
     * @model default="queue" unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
	TypeType getType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
	void setType(TypeType value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType)
     * @generated
     */
	void unsetType();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType)
     * @generated
     */
	boolean isSetType();

} // JMSDestination
