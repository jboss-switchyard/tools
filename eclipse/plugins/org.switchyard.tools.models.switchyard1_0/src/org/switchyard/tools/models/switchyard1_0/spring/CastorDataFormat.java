/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Castor Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getMappingFile <em>Mapping File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#isValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCastorDataFormat()
 * @model extendedMetaData="name='castorDataFormat' kind='empty'"
 * @generated
 */
public interface CastorDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Classes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Classes</em>' attribute.
     * @see #setClasses(List)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCastorDataFormat_Classes()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.spring.ClassesType" many="false"
     *        extendedMetaData="kind='attribute' name='classes'"
     * @generated
     */
	List<String> getClasses();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getClasses <em>Classes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classes</em>' attribute.
     * @see #getClasses()
     * @generated
     */
	void setClasses(List<String> value);

	/**
     * Returns the value of the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Encoding</em>' attribute.
     * @see #setEncoding(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCastorDataFormat_Encoding()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='encoding'"
     * @generated
     */
	String getEncoding();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getEncoding <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encoding</em>' attribute.
     * @see #getEncoding()
     * @generated
     */
	void setEncoding(String value);

	/**
     * Returns the value of the '<em><b>Mapping File</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping File</em>' attribute.
     * @see #setMappingFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCastorDataFormat_MappingFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='mappingFile'"
     * @generated
     */
	String getMappingFile();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getMappingFile <em>Mapping File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping File</em>' attribute.
     * @see #getMappingFile()
     * @generated
     */
	void setMappingFile(String value);

	/**
     * Returns the value of the '<em><b>Packages</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' attribute.
     * @see #setPackages(List)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCastorDataFormat_Packages()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.spring.PackagesType" many="false"
     *        extendedMetaData="kind='attribute' name='packages'"
     * @generated
     */
	List<String> getPackages();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#getPackages <em>Packages</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Packages</em>' attribute.
     * @see #getPackages()
     * @generated
     */
	void setPackages(List<String> value);

	/**
     * Returns the value of the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validation</em>' attribute.
     * @see #isSetValidation()
     * @see #unsetValidation()
     * @see #setValidation(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCastorDataFormat_Validation()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='validation'"
     * @generated
     */
	boolean isValidation();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#isValidation <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation</em>' attribute.
     * @see #isSetValidation()
     * @see #unsetValidation()
     * @see #isValidation()
     * @generated
     */
	void setValidation(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#isValidation <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetValidation()
     * @see #isValidation()
     * @see #setValidation(boolean)
     * @generated
     */
	void unsetValidation();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CastorDataFormat#isValidation <em>Validation</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Validation</em>' attribute is set.
     * @see #unsetValidation()
     * @see #isValidation()
     * @see #setValidation(boolean)
     * @generated
     */
	boolean isSetValidation();

} // CastorDataFormat
