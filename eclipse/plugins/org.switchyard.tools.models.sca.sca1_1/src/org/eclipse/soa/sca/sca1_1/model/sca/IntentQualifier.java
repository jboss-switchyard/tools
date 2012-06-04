/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntentQualifier()
 * @model extendedMetaData="name='IntentQualifier' kind='elementOnly'"
 * @generated
 */
public interface IntentQualifier extends EObject {
	/**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntentQualifier_Description()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
     * @generated
     */
	String getDescription();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
	void setDescription(String value);

	/**
     * Returns the value of the '<em><b>Default</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' attribute.
     * @see #isSetDefault()
     * @see #unsetDefault()
     * @see #setDefault(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntentQualifier_Default()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='default'"
     * @generated
     */
	boolean isDefault();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#isDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' attribute.
     * @see #isSetDefault()
     * @see #unsetDefault()
     * @see #isDefault()
     * @generated
     */
	void setDefault(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#isDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetDefault()
     * @see #isDefault()
     * @see #setDefault(boolean)
     * @generated
     */
	void unsetDefault();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#isDefault <em>Default</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Default</em>' attribute is set.
     * @see #unsetDefault()
     * @see #isDefault()
     * @see #setDefault(boolean)
     * @generated
     */
	boolean isSetDefault();

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getIntentQualifier_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

} // IntentQualifier
