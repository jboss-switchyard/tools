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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#isFallbackToUnaugmentedProperty <em>Fallback To Unaugmented Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPrefixToken <em>Prefix Token</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertiesParserRef <em>Properties Parser Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertiesResolverRef <em>Properties Resolver Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertyPrefix <em>Property Prefix</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertySuffix <em>Property Suffix</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getSuffixToken <em>Suffix Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition()
 * @model extendedMetaData="name='camelPropertyPlaceholderDefinition' kind='empty'"
 * @generated
 */
public interface CamelPropertyPlaceholderDefinition extends IdentifiedType {
	/**
     * Returns the value of the '<em><b>Fallback To Unaugmented Property</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fallback To Unaugmented Property</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fallback To Unaugmented Property</em>' attribute.
     * @see #isSetFallbackToUnaugmentedProperty()
     * @see #unsetFallbackToUnaugmentedProperty()
     * @see #setFallbackToUnaugmentedProperty(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_FallbackToUnaugmentedProperty()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='fallbackToUnaugmentedProperty'"
     * @generated
     */
    boolean isFallbackToUnaugmentedProperty();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#isFallbackToUnaugmentedProperty <em>Fallback To Unaugmented Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fallback To Unaugmented Property</em>' attribute.
     * @see #isSetFallbackToUnaugmentedProperty()
     * @see #unsetFallbackToUnaugmentedProperty()
     * @see #isFallbackToUnaugmentedProperty()
     * @generated
     */
    void setFallbackToUnaugmentedProperty(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#isFallbackToUnaugmentedProperty <em>Fallback To Unaugmented Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFallbackToUnaugmentedProperty()
     * @see #isFallbackToUnaugmentedProperty()
     * @see #setFallbackToUnaugmentedProperty(boolean)
     * @generated
     */
    void unsetFallbackToUnaugmentedProperty();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#isFallbackToUnaugmentedProperty <em>Fallback To Unaugmented Property</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fallback To Unaugmented Property</em>' attribute is set.
     * @see #unsetFallbackToUnaugmentedProperty()
     * @see #isFallbackToUnaugmentedProperty()
     * @see #setFallbackToUnaugmentedProperty(boolean)
     * @generated
     */
    boolean isSetFallbackToUnaugmentedProperty();

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
     * Returns the value of the '<em><b>Prefix Token</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix Token</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix Token</em>' attribute.
     * @see #setPrefixToken(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_PrefixToken()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='prefixToken'"
     * @generated
     */
    String getPrefixToken();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPrefixToken <em>Prefix Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix Token</em>' attribute.
     * @see #getPrefixToken()
     * @generated
     */
    void setPrefixToken(String value);

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

    /**
     * Returns the value of the '<em><b>Property Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Prefix</em>' attribute.
     * @see #setPropertyPrefix(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_PropertyPrefix()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='propertyPrefix'"
     * @generated
     */
    String getPropertyPrefix();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertyPrefix <em>Property Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Prefix</em>' attribute.
     * @see #getPropertyPrefix()
     * @generated
     */
    void setPropertyPrefix(String value);

    /**
     * Returns the value of the '<em><b>Property Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Suffix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Suffix</em>' attribute.
     * @see #setPropertySuffix(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_PropertySuffix()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='propertySuffix'"
     * @generated
     */
    String getPropertySuffix();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getPropertySuffix <em>Property Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Suffix</em>' attribute.
     * @see #getPropertySuffix()
     * @generated
     */
    void setPropertySuffix(String value);

    /**
     * Returns the value of the '<em><b>Suffix Token</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suffix Token</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Suffix Token</em>' attribute.
     * @see #setSuffixToken(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelPropertyPlaceholderDefinition_SuffixToken()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='suffixToken'"
     * @generated
     */
    String getSuffixToken();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition#getSuffixToken <em>Suffix Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suffix Token</em>' attribute.
     * @see #getSuffixToken()
     * @generated
     */
    void setSuffixToken(String value);

} // CamelPropertyPlaceholderDefinition
