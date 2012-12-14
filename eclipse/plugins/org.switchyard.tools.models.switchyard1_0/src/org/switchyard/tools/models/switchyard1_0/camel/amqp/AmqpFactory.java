/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.amqp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage
 * @generated
 */
public interface AmqpFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AmqpFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Camel Amqp Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Amqp Binding Type</em>'.
     * @generated
     */
    CamelAmqpBindingType createCamelAmqpBindingType();

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
    AmqpPackage getAmqpPackage();

} //AmqpFactory
