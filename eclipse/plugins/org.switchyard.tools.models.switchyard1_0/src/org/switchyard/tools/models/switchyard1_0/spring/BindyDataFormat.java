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
 * A representation of the model object '<em><b>Bindy Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBindyDataFormat()
 * @model extendedMetaData="name='bindyDataFormat' kind='empty'"
 * @generated
 */
public interface BindyDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBindyDataFormat_Locale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locale'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBindyDataFormat_Packages()
	 * @model dataType="org.switchyard.tools.models.switchyard1_0.spring.PackagesType1" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='packages'"
	 * @generated
	 */
	List<String> getPackages();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getPackages <em>Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' attribute.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(List<String> value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.BindyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.BindyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(BindyType)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getBindyDataFormat_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	BindyType getType();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.BindyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(BindyType value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(BindyType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.BindyDataFormat#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(BindyType)
	 * @generated
	 */
	boolean isSetType();

} // BindyDataFormat
