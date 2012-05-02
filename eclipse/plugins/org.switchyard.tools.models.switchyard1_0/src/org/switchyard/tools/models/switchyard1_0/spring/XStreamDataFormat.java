/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XStream Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getConverters <em>Converters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getOmitFields <em>Omit Fields</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getImplicitCollections <em>Implicit Collections</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getDriverRef <em>Driver Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat()
 * @model extendedMetaData="name='xStreamDataFormat' kind='elementOnly'"
 * @generated
 */
public interface XStreamDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Converters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converters</em>' containment reference.
	 * @see #setConverters(ConverterList)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_Converters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='converters' namespace='##targetNamespace'"
	 * @generated
	 */
	ConverterList getConverters();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getConverters <em>Converters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converters</em>' containment reference.
	 * @see #getConverters()
	 * @generated
	 */
	void setConverters(ConverterList value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference.
	 * @see #setAliases(AliasList)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_Aliases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aliases' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasList getAliases();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getAliases <em>Aliases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliases</em>' containment reference.
	 * @see #getAliases()
	 * @generated
	 */
	void setAliases(AliasList value);

	/**
	 * Returns the value of the '<em><b>Omit Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Fields</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Fields</em>' containment reference.
	 * @see #setOmitFields(OmitFieldList)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_OmitFields()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='omitFields' namespace='##targetNamespace'"
	 * @generated
	 */
	OmitFieldList getOmitFields();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getOmitFields <em>Omit Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Fields</em>' containment reference.
	 * @see #getOmitFields()
	 * @generated
	 */
	void setOmitFields(OmitFieldList value);

	/**
	 * Returns the value of the '<em><b>Implicit Collections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Collections</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Collections</em>' containment reference.
	 * @see #setImplicitCollections(ImplicitCollectionList)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_ImplicitCollections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implicitCollections' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitCollectionList getImplicitCollections();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getImplicitCollections <em>Implicit Collections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Collections</em>' containment reference.
	 * @see #getImplicitCollections()
	 * @generated
	 */
	void setImplicitCollections(ImplicitCollectionList value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_Driver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='driver'"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Driver Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Ref</em>' attribute.
	 * @see #setDriverRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_DriverRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='driverRef'"
	 * @generated
	 */
	String getDriverRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getDriverRef <em>Driver Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Ref</em>' attribute.
	 * @see #getDriverRef()
	 * @generated
	 */
	void setDriverRef(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXStreamDataFormat_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XStreamDataFormat#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

} // XStreamDataFormat
