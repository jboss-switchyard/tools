/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Beans Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat#isPrettyPrint <em>Pretty Print</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlBeansDataFormat()
 * @model extendedMetaData="name='xmlBeansDataFormat' kind='empty'"
 * @generated
 */
public interface XmlBeansDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Pretty Print</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pretty Print</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pretty Print</em>' attribute.
     * @see #isSetPrettyPrint()
     * @see #unsetPrettyPrint()
     * @see #setPrettyPrint(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlBeansDataFormat_PrettyPrint()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='prettyPrint'"
     * @generated
     */
	boolean isPrettyPrint();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pretty Print</em>' attribute.
     * @see #isSetPrettyPrint()
     * @see #unsetPrettyPrint()
     * @see #isPrettyPrint()
     * @generated
     */
	void setPrettyPrint(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetPrettyPrint()
     * @see #isPrettyPrint()
     * @see #setPrettyPrint(boolean)
     * @generated
     */
	void unsetPrettyPrint();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlBeansDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pretty Print</em>' attribute is set.
     * @see #unsetPrettyPrint()
     * @see #isPrettyPrint()
     * @see #setPrettyPrint(boolean)
     * @generated
     */
	boolean isSetPrettyPrint();

} // XmlBeansDataFormat
