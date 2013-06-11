/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage
 * @generated
 */
public interface SOAPFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SOAPFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Mapper Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Mapper Type</em>'.
     * @generated
     */
    ContextMapperType createContextMapperType();

    /**
     * Returns a new object of class '<em>Message Composer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message Composer Type</em>'.
     * @generated
     */
    SOAPMessageComposerType createSOAPMessageComposerType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binding Type</em>'.
     * @generated
     */
    SOAPBindingType createSOAPBindingType();

    /**
     * Returns a new object of class '<em>Interceptor Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interceptor Type</em>'.
     * @generated
     */
    InterceptorType createInterceptorType();

    /**
     * Returns a new object of class '<em>Interceptors Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interceptors Type</em>'.
     * @generated
     */
    InterceptorsType createInterceptorsType();

    /**
     * Returns a new object of class '<em>Mtom Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mtom Type</em>'.
     * @generated
     */
    MtomType createMtomType();

    /**
     * Returns a new object of class '<em>Property Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Type</em>'.
     * @generated
     */
    PropertyType createPropertyType();

    /**
     * Returns a new object of class '<em>Properties Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Properties Type</em>'.
     * @generated
     */
    PropertiesType createPropertiesType();

    /**
     * Returns a new object of class '<em>Endpoint Config Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Endpoint Config Type</em>'.
     * @generated
     */
    EndpointConfigType createEndpointConfigType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SOAPPackage getSOAPPackage();

} //SOAPFactory
