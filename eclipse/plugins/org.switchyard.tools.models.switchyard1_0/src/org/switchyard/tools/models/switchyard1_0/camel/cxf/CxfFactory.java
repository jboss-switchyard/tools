/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.cxf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage
 * @generated
 */
public interface CxfFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CxfFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CxfFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Additional Uri Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Additional Uri Parameters Type</em>'.
     * @generated
     */
    AdditionalUriParametersType createAdditionalUriParametersType();

    /**
     * Returns a new object of class '<em>Base Camel Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Camel Binding</em>'.
     * @generated
     */
    BaseCamelBinding createBaseCamelBinding();

    /**
     * Returns a new object of class '<em>Camel Cxf Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Cxf Binding Type</em>'.
     * @generated
     */
    CamelCxfBindingType createCamelCxfBindingType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter Type</em>'.
     * @generated
     */
    ParameterType createParameterType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CxfPackage getCxfPackage();

} //CxfFactory
