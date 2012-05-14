/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat()
 * @model extendedMetaData="name='csvDataFormat' kind='empty'"
 * @generated
 */
public interface CsvDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delimiter</em>' attribute.
     * @see #setDelimiter(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCsvDataFormat_Delimiter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='delimiter'"
     * @generated
     */
	String getDelimiter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CsvDataFormat#getDelimiter <em>Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delimiter</em>' attribute.
     * @see #getDelimiter()
     * @generated
     */
	void setDelimiter(String value);

} // CsvDataFormat
