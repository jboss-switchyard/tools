/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage
 * @generated
 */
public interface HornetQFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HornetQFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binding Type</em>'.
     * @generated
     */
    BindingType createBindingType();

    /**
     * Returns a new object of class '<em>Config Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Config Type</em>'.
     * @generated
     */
    ConfigType createConfigType();

    /**
     * Returns a new object of class '<em>Connector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector Type</em>'.
     * @generated
     */
    ConnectorType createConnectorType();

    /**
     * Returns a new object of class '<em>Discovery Group Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discovery Group Type</em>'.
     * @generated
     */
    DiscoveryGroupType createDiscoveryGroupType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>hq Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>hq Operation Selector Type</em>'.
     * @generated
     */
    hqOperationSelectorType createhqOperationSelectorType();

    /**
     * Returns a new object of class '<em>Properties Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Properties Type</em>'.
     * @generated
     */
    PropertiesType createPropertiesType();

    /**
     * Returns a new object of class '<em>Property Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Type</em>'.
     * @generated
     */
    PropertyType createPropertyType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    HornetQPackage getHornetQPackage();

} //HornetQFactory
