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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaFiles <em>Schema Files</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaCatalogs <em>Schema Catalogs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getFailOnWarning <em>Fail On Warning</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getNamespaceAware <em>Namespace Aware</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType()
 * @model extendedMetaData="name='XmlValidateType' kind='empty'"
 * @generated
 */
public interface XmlValidateType extends ValidateType {

	/**
     * Returns the value of the '<em><b>Schema Files</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Files</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Files</em>' containment reference.
     * @see #setSchemaFiles(SchemaFilesType)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_SchemaFiles()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='schemaFiles' namespace='##targetNamespace'"
     * @generated
     */
    SchemaFilesType getSchemaFiles();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaFiles <em>Schema Files</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Files</em>' containment reference.
     * @see #getSchemaFiles()
     * @generated
     */
    void setSchemaFiles(SchemaFilesType value);

    /**
     * Returns the value of the '<em><b>Schema Catalogs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Catalogs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Catalogs</em>' containment reference.
     * @see #setSchemaCatalogs(SchemaCatalogsType)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_SchemaCatalogs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='schemaCatalogs' namespace='##targetNamespace'"
     * @generated
     */
    SchemaCatalogsType getSchemaCatalogs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaCatalogs <em>Schema Catalogs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Catalogs</em>' containment reference.
     * @see #getSchemaCatalogs()
     * @generated
     */
    void setSchemaCatalogs(SchemaCatalogsType value);

    /**
     * Returns the value of the '<em><b>Schema Type</b></em>' attribute.
     * The default value is <code>"DTD"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
     * @see #isSetSchemaType()
     * @see #unsetSchemaType()
     * @see #setSchemaType(XmlSchemaType)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_SchemaType()
     * @model default="DTD" unsettable="true" required="true"
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
     * @see #isSetSchemaType()
     * @see #unsetSchemaType()
     * @see #getSchemaType()
     * @generated
     */
	void setSchemaType(XmlSchemaType value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaType <em>Schema Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSchemaType()
     * @see #getSchemaType()
     * @see #setSchemaType(XmlSchemaType)
     * @generated
     */
    void unsetSchemaType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getSchemaType <em>Schema Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Schema Type</em>' attribute is set.
     * @see #unsetSchemaType()
     * @see #getSchemaType()
     * @see #setSchemaType(XmlSchemaType)
     * @generated
     */
    boolean isSetSchemaType();

    /**
     * Returns the value of the '<em><b>Fail On Warning</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail On Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fail On Warning</em>' attribute.
     * @see #setFailOnWarning(String)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_FailOnWarning()
     * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
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

    /**
     * Returns the value of the '<em><b>Namespace Aware</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace Aware</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace Aware</em>' attribute.
     * @see #setNamespaceAware(String)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getXmlValidateType_NamespaceAware()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='namespaceAware'"
     * @generated
     */
    String getNamespaceAware();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType#getNamespaceAware <em>Namespace Aware</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace Aware</em>' attribute.
     * @see #getNamespaceAware()
     * @generated
     */
    void setNamespaceAware(String value);
} // XmlValidateType
