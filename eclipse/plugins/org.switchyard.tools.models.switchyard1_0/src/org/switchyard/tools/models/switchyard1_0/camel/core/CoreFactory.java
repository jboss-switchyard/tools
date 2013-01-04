/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CoreFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.core.impl.CoreFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Base Camel Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Camel Binding</em>'.
     * @generated
     */
    BaseCamelBinding createBaseCamelBinding();

    /**
     * Returns a new object of class '<em>Camel Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Binding Type</em>'.
     * @generated
     */
    CamelBindingType createCamelBindingType();

    /**
     * Returns a new object of class '<em>Camel Direct Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Direct Binding Type</em>'.
     * @generated
     */
    CamelDirectBindingType createCamelDirectBindingType();

    /**
     * Returns a new object of class '<em>Camel Timer Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Timer Binding Type</em>'.
     * @generated
     */
    CamelTimerBindingType createCamelTimerBindingType();

    /**
     * Returns a new object of class '<em>Camel Seda Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Seda Binding Type</em>'.
     * @generated
     */
    CamelSedaBindingType createCamelSedaBindingType();

    /**
     * Returns a new object of class '<em>Camel Mock Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Mock Binding Type</em>'.
     * @generated
     */
    CamelMockBindingType createCamelMockBindingType();

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
    CorePackage getCorePackage();

} //CoreFactory
