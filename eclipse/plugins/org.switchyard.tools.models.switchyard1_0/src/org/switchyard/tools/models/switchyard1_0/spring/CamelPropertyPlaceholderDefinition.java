/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Property Placeholder Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertiesParserRef <em>Properties Parser Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertiesResolverRef <em>Properties Resolver Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition()
 * @model extendedMetaData="name='camelPropertyPlaceholderDefinition' kind='empty'"
 * @generated
 */
public interface CamelPropertyPlaceholderDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Properties Parser Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Parser Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Parser Ref</em>' attribute.
	 * @see #setPropertiesParserRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_PropertiesParserRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertiesParserRef'"
	 * @generated
	 */
	String getPropertiesParserRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertiesParserRef <em>Properties Parser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Parser Ref</em>' attribute.
	 * @see #getPropertiesParserRef()
	 * @generated
	 */
	void setPropertiesParserRef(String value);

	/**
	 * Returns the value of the '<em><b>Properties Resolver Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Resolver Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Resolver Ref</em>' attribute.
	 * @see #setPropertiesResolverRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_PropertiesResolverRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertiesResolverRef'"
	 * @generated
	 */
	String getPropertiesResolverRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertiesResolverRef <em>Properties Resolver Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Resolver Ref</em>' attribute.
	 * @see #getPropertiesResolverRef()
	 * @generated
	 */
	void setPropertiesResolverRef(String value);

} // CamelPropertyPlaceholderDefinition
