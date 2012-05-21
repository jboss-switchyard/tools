/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Property Placeholder Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#isFallbackToUnaugmentedProperty <em>Fallback To Unaugmented Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPrefixToken <em>Prefix Token</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesParserRef <em>Properties Parser Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesResolverRef <em>Properties Resolver Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertyPrefix <em>Property Prefix</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertySuffix <em>Property Suffix</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getSuffixToken <em>Suffix Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelPropertyPlaceholderDefinitionImpl extends IdentifiedTypeImpl implements CamelPropertyPlaceholderDefinition {
	/**
     * The default value of the '{@link #isFallbackToUnaugmentedProperty() <em>Fallback To Unaugmented Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFallbackToUnaugmentedProperty()
     * @generated
     * @ordered
     */
    protected static final boolean FALLBACK_TO_UNAUGMENTED_PROPERTY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFallbackToUnaugmentedProperty() <em>Fallback To Unaugmented Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFallbackToUnaugmentedProperty()
     * @generated
     * @ordered
     */
    protected boolean fallbackToUnaugmentedProperty = FALLBACK_TO_UNAUGMENTED_PROPERTY_EDEFAULT;

    /**
     * This is true if the Fallback To Unaugmented Property attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fallbackToUnaugmentedPropertyESet;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
	protected static final String LOCATION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
	protected String location = LOCATION_EDEFAULT;

	/**
     * The default value of the '{@link #getPrefixToken() <em>Prefix Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefixToken()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_TOKEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefixToken() <em>Prefix Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefixToken()
     * @generated
     * @ordered
     */
    protected String prefixToken = PREFIX_TOKEN_EDEFAULT;

    /**
     * The default value of the '{@link #getPropertiesParserRef() <em>Properties Parser Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPropertiesParserRef()
     * @generated
     * @ordered
     */
	protected static final String PROPERTIES_PARSER_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPropertiesParserRef() <em>Properties Parser Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPropertiesParserRef()
     * @generated
     * @ordered
     */
	protected String propertiesParserRef = PROPERTIES_PARSER_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getPropertiesResolverRef() <em>Properties Resolver Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPropertiesResolverRef()
     * @generated
     * @ordered
     */
	protected static final String PROPERTIES_RESOLVER_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPropertiesResolverRef() <em>Properties Resolver Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPropertiesResolverRef()
     * @generated
     * @ordered
     */
	protected String propertiesResolverRef = PROPERTIES_RESOLVER_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getPropertyPrefix() <em>Property Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyPrefix()
     * @generated
     * @ordered
     */
    protected static final String PROPERTY_PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPropertyPrefix() <em>Property Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyPrefix()
     * @generated
     * @ordered
     */
    protected String propertyPrefix = PROPERTY_PREFIX_EDEFAULT;

    /**
     * The default value of the '{@link #getPropertySuffix() <em>Property Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertySuffix()
     * @generated
     * @ordered
     */
    protected static final String PROPERTY_SUFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPropertySuffix() <em>Property Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertySuffix()
     * @generated
     * @ordered
     */
    protected String propertySuffix = PROPERTY_SUFFIX_EDEFAULT;

    /**
     * The default value of the '{@link #getSuffixToken() <em>Suffix Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffixToken()
     * @generated
     * @ordered
     */
    protected static final String SUFFIX_TOKEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuffixToken() <em>Suffix Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffixToken()
     * @generated
     * @ordered
     */
    protected String suffixToken = SUFFIX_TOKEN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelPropertyPlaceholderDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFallbackToUnaugmentedProperty() {
        return fallbackToUnaugmentedProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFallbackToUnaugmentedProperty(boolean newFallbackToUnaugmentedProperty) {
        boolean oldFallbackToUnaugmentedProperty = fallbackToUnaugmentedProperty;
        fallbackToUnaugmentedProperty = newFallbackToUnaugmentedProperty;
        boolean oldFallbackToUnaugmentedPropertyESet = fallbackToUnaugmentedPropertyESet;
        fallbackToUnaugmentedPropertyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY, oldFallbackToUnaugmentedProperty, fallbackToUnaugmentedProperty, !oldFallbackToUnaugmentedPropertyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFallbackToUnaugmentedProperty() {
        boolean oldFallbackToUnaugmentedProperty = fallbackToUnaugmentedProperty;
        boolean oldFallbackToUnaugmentedPropertyESet = fallbackToUnaugmentedPropertyESet;
        fallbackToUnaugmentedProperty = FALLBACK_TO_UNAUGMENTED_PROPERTY_EDEFAULT;
        fallbackToUnaugmentedPropertyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY, oldFallbackToUnaugmentedProperty, FALLBACK_TO_UNAUGMENTED_PROPERTY_EDEFAULT, oldFallbackToUnaugmentedPropertyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFallbackToUnaugmentedProperty() {
        return fallbackToUnaugmentedPropertyESet;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLocation() {
        return location;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION, oldLocation, location));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrefixToken() {
        return prefixToken;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrefixToken(String newPrefixToken) {
        String oldPrefixToken = prefixToken;
        prefixToken = newPrefixToken;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PREFIX_TOKEN, oldPrefixToken, prefixToken));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPropertiesParserRef() {
        return propertiesParserRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPropertiesParserRef(String newPropertiesParserRef) {
        String oldPropertiesParserRef = propertiesParserRef;
        propertiesParserRef = newPropertiesParserRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF, oldPropertiesParserRef, propertiesParserRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPropertiesResolverRef() {
        return propertiesResolverRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPropertiesResolverRef(String newPropertiesResolverRef) {
        String oldPropertiesResolverRef = propertiesResolverRef;
        propertiesResolverRef = newPropertiesResolverRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF, oldPropertiesResolverRef, propertiesResolverRef));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPropertyPrefix() {
        return propertyPrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropertyPrefix(String newPropertyPrefix) {
        String oldPropertyPrefix = propertyPrefix;
        propertyPrefix = newPropertyPrefix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_PREFIX, oldPropertyPrefix, propertyPrefix));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPropertySuffix() {
        return propertySuffix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropertySuffix(String newPropertySuffix) {
        String oldPropertySuffix = propertySuffix;
        propertySuffix = newPropertySuffix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_SUFFIX, oldPropertySuffix, propertySuffix));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSuffixToken() {
        return suffixToken;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuffixToken(String newSuffixToken) {
        String oldSuffixToken = suffixToken;
        suffixToken = newSuffixToken;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__SUFFIX_TOKEN, oldSuffixToken, suffixToken));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY:
                return isFallbackToUnaugmentedProperty();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                return getLocation();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PREFIX_TOKEN:
                return getPrefixToken();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                return getPropertiesParserRef();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                return getPropertiesResolverRef();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_PREFIX:
                return getPropertyPrefix();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_SUFFIX:
                return getPropertySuffix();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__SUFFIX_TOKEN:
                return getSuffixToken();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY:
                setFallbackToUnaugmentedProperty((Boolean)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                setLocation((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PREFIX_TOKEN:
                setPrefixToken((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                setPropertiesParserRef((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                setPropertiesResolverRef((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_PREFIX:
                setPropertyPrefix((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_SUFFIX:
                setPropertySuffix((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__SUFFIX_TOKEN:
                setSuffixToken((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY:
                unsetFallbackToUnaugmentedProperty();
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PREFIX_TOKEN:
                setPrefixToken(PREFIX_TOKEN_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                setPropertiesParserRef(PROPERTIES_PARSER_REF_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                setPropertiesResolverRef(PROPERTIES_RESOLVER_REF_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_PREFIX:
                setPropertyPrefix(PROPERTY_PREFIX_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_SUFFIX:
                setPropertySuffix(PROPERTY_SUFFIX_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__SUFFIX_TOKEN:
                setSuffixToken(SUFFIX_TOKEN_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY:
                return isSetFallbackToUnaugmentedProperty();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PREFIX_TOKEN:
                return PREFIX_TOKEN_EDEFAULT == null ? prefixToken != null : !PREFIX_TOKEN_EDEFAULT.equals(prefixToken);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                return PROPERTIES_PARSER_REF_EDEFAULT == null ? propertiesParserRef != null : !PROPERTIES_PARSER_REF_EDEFAULT.equals(propertiesParserRef);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                return PROPERTIES_RESOLVER_REF_EDEFAULT == null ? propertiesResolverRef != null : !PROPERTIES_RESOLVER_REF_EDEFAULT.equals(propertiesResolverRef);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_PREFIX:
                return PROPERTY_PREFIX_EDEFAULT == null ? propertyPrefix != null : !PROPERTY_PREFIX_EDEFAULT.equals(propertyPrefix);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_SUFFIX:
                return PROPERTY_SUFFIX_EDEFAULT == null ? propertySuffix != null : !PROPERTY_SUFFIX_EDEFAULT.equals(propertySuffix);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__SUFFIX_TOKEN:
                return SUFFIX_TOKEN_EDEFAULT == null ? suffixToken != null : !SUFFIX_TOKEN_EDEFAULT.equals(suffixToken);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (fallbackToUnaugmentedProperty: ");
        if (fallbackToUnaugmentedPropertyESet) result.append(fallbackToUnaugmentedProperty); else result.append("<unset>");
        result.append(", location: ");
        result.append(location);
        result.append(", prefixToken: ");
        result.append(prefixToken);
        result.append(", propertiesParserRef: ");
        result.append(propertiesParserRef);
        result.append(", propertiesResolverRef: ");
        result.append(propertiesResolverRef);
        result.append(", propertyPrefix: ");
        result.append(propertyPrefix);
        result.append(", propertySuffix: ");
        result.append(propertySuffix);
        result.append(", suffixToken: ");
        result.append(suffixToken);
        result.append(')');
        return result.toString();
    }

} //CamelPropertyPlaceholderDefinitionImpl
