/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.http;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.http.HttpPackage
 * @generated
 */
public interface HttpFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HttpFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.http.impl.HttpFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binding Type</em>'.
     * @generated
     */
    HttpBindingType createHttpBindingType();

    /**
     * Returns a new object of class '<em>Context Mapper Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Mapper Type</em>'.
     * @generated
     */
    HttpContextMapperType createHttpContextMapperType();

    /**
     * Returns a new object of class '<em>Message Composer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message Composer Type</em>'.
     * @generated
     */
    HttpMessageComposerType createHttpMessageComposerType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    HttpPackage getHttpPackage();

} //HttpFactory
