/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue()
 * @model extendedMetaData="name='PropertyValue' kind='mixed'"
 * @generated
 */
public interface PropertyValue extends SCAPropertyBase {
	/**
     * Returns the value of the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' attribute.
     * @see #setElement(QName)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_Element()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='element'"
     * @generated
     */
	QName getElement();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getElement <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' attribute.
     * @see #getElement()
     * @generated
     */
	void setElement(QName value);

	/**
     * Returns the value of the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' attribute.
     * @see #setFile(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_File()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='file'"
     * @generated
     */
	String getFile();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getFile <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' attribute.
     * @see #getFile()
     * @generated
     */
	void setFile(String value);

	/**
     * Returns the value of the '<em><b>Many</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Many</em>' attribute.
     * @see #isSetMany()
     * @see #unsetMany()
     * @see #setMany(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_Many()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='many'"
     * @generated
     */
	boolean isMany();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#isMany <em>Many</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Many</em>' attribute.
     * @see #isSetMany()
     * @see #unsetMany()
     * @see #isMany()
     * @generated
     */
	void setMany(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#isMany <em>Many</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetMany()
     * @see #isMany()
     * @see #setMany(boolean)
     * @generated
     */
	void unsetMany();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#isMany <em>Many</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Many</em>' attribute is set.
     * @see #unsetMany()
     * @see #isMany()
     * @see #setMany(boolean)
     * @generated
     */
	boolean isSetMany();

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_Source()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='source'"
     * @generated
     */
	String getSource();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
	void setSource(String value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(QName)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
	QName getType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
	void setType(QName value);

	/**
     * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getPropertyValue_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':11' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute();

} // PropertyValue
