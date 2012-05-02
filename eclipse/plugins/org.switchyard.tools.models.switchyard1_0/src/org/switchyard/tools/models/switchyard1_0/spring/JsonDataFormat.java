/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#isPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#getUnmarshalTypeName <em>Unmarshal Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJsonDataFormat()
 * @model extendedMetaData="name='jsonDataFormat' kind='empty'"
 * @generated
 */
public interface JsonDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.JsonLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.JsonLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #setLibrary(JsonLibrary)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJsonDataFormat_Library()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='library'"
	 * @generated
	 */
	JsonLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.JsonLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(JsonLibrary value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(JsonLibrary)
	 * @generated
	 */
	void unsetLibrary();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#getLibrary <em>Library</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Library</em>' attribute is set.
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(JsonLibrary)
	 * @generated
	 */
	boolean isSetLibrary();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJsonDataFormat_PrettyPrint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	boolean isPrettyPrint();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute.
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
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrettyPrint()
	 * @see #isPrettyPrint()
	 * @see #setPrettyPrint(boolean)
	 * @generated
	 */
	void unsetPrettyPrint();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pretty Print</em>' attribute is set.
	 * @see #unsetPrettyPrint()
	 * @see #isPrettyPrint()
	 * @see #setPrettyPrint(boolean)
	 * @generated
	 */
	boolean isSetPrettyPrint();

	/**
	 * Returns the value of the '<em><b>Unmarshal Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshal Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmarshal Type Name</em>' attribute.
	 * @see #setUnmarshalTypeName(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJsonDataFormat_UnmarshalTypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalTypeName'"
	 * @generated
	 */
	String getUnmarshalTypeName();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JsonDataFormat#getUnmarshalTypeName <em>Unmarshal Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Type Name</em>' attribute.
	 * @see #getUnmarshalTypeName()
	 * @generated
	 */
	void setUnmarshalTypeName(String value);

} // JsonDataFormat
