/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.hornetq.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HornetQFactoryImpl extends EFactoryImpl implements HornetQFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HornetQFactory init() {
        try {
            HornetQFactory theHornetQFactory = (HornetQFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-hornetq:config:1.0"); 
            if (theHornetQFactory != null) {
                return theHornetQFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new HornetQFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HornetQFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case HornetQPackage.BINDING_TYPE: return createBindingType();
            case HornetQPackage.CONFIG_TYPE: return createConfigType();
            case HornetQPackage.CONNECTOR_TYPE: return createConnectorType();
            case HornetQPackage.DISCOVERY_GROUP_TYPE: return createDiscoveryGroupType();
            case HornetQPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case HornetQPackage.PROPERTIES_TYPE: return createPropertiesType();
            case HornetQPackage.PROPERTY_TYPE: return createPropertyType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BindingType createBindingType() {
        BindingTypeImpl bindingType = new BindingTypeImpl();
        return bindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigType createConfigType() {
        ConfigTypeImpl configType = new ConfigTypeImpl();
        return configType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorType createConnectorType() {
        ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
        return connectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscoveryGroupType createDiscoveryGroupType() {
        DiscoveryGroupTypeImpl discoveryGroupType = new DiscoveryGroupTypeImpl();
        return discoveryGroupType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesType createPropertiesType() {
        PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
        return propertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyType createPropertyType() {
        PropertyTypeImpl propertyType = new PropertyTypeImpl();
        return propertyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HornetQPackage getHornetQPackage() {
        return (HornetQPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static HornetQPackage getPackage() {
        return HornetQPackage.eINSTANCE;
    }

} //HornetQFactoryImpl
