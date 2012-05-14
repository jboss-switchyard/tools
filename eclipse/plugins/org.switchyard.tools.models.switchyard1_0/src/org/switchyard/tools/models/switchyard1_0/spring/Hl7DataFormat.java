/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hl7 Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat#isValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getHl7DataFormat()
 * @model extendedMetaData="name='hl7DataFormat' kind='empty'"
 * @generated
 */
public interface Hl7DataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Validate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validate</em>' attribute.
     * @see #isSetValidate()
     * @see #unsetValidate()
     * @see #setValidate(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getHl7DataFormat_Validate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='validate'"
     * @generated
     */
	boolean isValidate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat#isValidate <em>Validate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validate</em>' attribute.
     * @see #isSetValidate()
     * @see #unsetValidate()
     * @see #isValidate()
     * @generated
     */
	void setValidate(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat#isValidate <em>Validate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetValidate()
     * @see #isValidate()
     * @see #setValidate(boolean)
     * @generated
     */
	void unsetValidate();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.Hl7DataFormat#isValidate <em>Validate</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Validate</em>' attribute is set.
     * @see #unsetValidate()
     * @see #isValidate()
     * @see #setValidate(boolean)
     * @generated
     */
	boolean isSetValidate();

} // Hl7DataFormat
