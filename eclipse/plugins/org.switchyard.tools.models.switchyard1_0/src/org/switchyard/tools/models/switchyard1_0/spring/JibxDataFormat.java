/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jibx Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JibxDataFormat#getUnmarshallClass <em>Unmarshall Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJibxDataFormat()
 * @model extendedMetaData="name='jibxDataFormat' kind='empty'"
 * @generated
 */
public interface JibxDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Unmarshall Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshall Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unmarshall Class</em>' attribute.
     * @see #setUnmarshallClass(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJibxDataFormat_UnmarshallClass()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='unmarshallClass'"
     * @generated
     */
	String getUnmarshallClass();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JibxDataFormat#getUnmarshallClass <em>Unmarshall Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unmarshall Class</em>' attribute.
     * @see #getUnmarshallClass()
     * @generated
     */
	void setUnmarshallClass(String value);

} // JibxDataFormat
