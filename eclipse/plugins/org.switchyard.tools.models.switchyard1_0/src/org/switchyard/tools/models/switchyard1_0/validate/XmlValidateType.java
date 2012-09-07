/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate;

import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Validate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 XML Validator Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaFile <em>Schema File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getFailOnWarning <em>Fail On Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType()
 * @model extendedMetaData="name='XmlValidateType' kind='empty'"
 * @generated
 */
public interface XmlValidateType extends ValidateType {

	/**
     * Returns the value of the '<em><b>Schema Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
     * @see #setSchemaType(XmlSchemaType)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_SchemaType()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='schemaType'"
     * @generated
     */
	XmlSchemaType getSchemaType();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaType <em>Schema Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
     * @see #getSchemaType()
     * @generated
     */
	void setSchemaType(XmlSchemaType value);

	/**
     * Returns the value of the '<em><b>Schema File</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schema File</em>' attribute.
     * @see #setSchemaFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_SchemaFile()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='schemaFile'"
     * @generated
     */
	String getSchemaFile();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaFile <em>Schema File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema File</em>' attribute.
     * @see #getSchemaFile()
     * @generated
     */
	void setSchemaFile(String value);

	/**
     * Returns the value of the '<em><b>Fail On Warning</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail On Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fail On Warning</em>' attribute.
     * @see #setFailOnWarning(String)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_FailOnWarning()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='failOnWarning'"
     * @generated
     */
	String getFailOnWarning();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getFailOnWarning <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fail On Warning</em>' attribute.
     * @see #getFailOnWarning()
     * @generated
     */
	void setFailOnWarning(String value);
} // XmlValidateType
