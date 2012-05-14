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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesParserRef <em>Properties Parser Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelPropertyPlaceholderDefinitionImpl#getPropertiesResolverRef <em>Properties Resolver Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelPropertyPlaceholderDefinitionImpl extends IdentifiedTypeImpl implements CamelPropertyPlaceholderDefinition {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                return getLocation();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                return getPropertiesParserRef();
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                return getPropertiesResolverRef();
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
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                setLocation((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                setPropertiesParserRef((String)newValue);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                setPropertiesResolverRef((String)newValue);
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
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                setPropertiesParserRef(PROPERTIES_PARSER_REF_EDEFAULT);
                return;
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                setPropertiesResolverRef(PROPERTIES_RESOLVER_REF_EDEFAULT);
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
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
                return PROPERTIES_PARSER_REF_EDEFAULT == null ? propertiesParserRef != null : !PROPERTIES_PARSER_REF_EDEFAULT.equals(propertiesParserRef);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
                return PROPERTIES_RESOLVER_REF_EDEFAULT == null ? propertiesResolverRef != null : !PROPERTIES_RESOLVER_REF_EDEFAULT.equals(propertiesResolverRef);
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
        result.append(" (location: ");
        result.append(location);
        result.append(", propertiesParserRef: ");
        result.append(propertiesParserRef);
        result.append(", propertiesResolverRef: ");
        result.append(propertiesResolverRef);
        result.append(')');
        return result.toString();
    }

} //CamelPropertyPlaceholderDefinitionImpl
