/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage
 * @generated
 */
public interface CamelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CamelFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Scheduled Poll Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduled Poll Consumer Type</em>'.
     * @generated
     */
    ScheduledPollConsumerType createScheduledPollConsumerType();

    /**
     * Returns a new object of class '<em>Scheduled Batch Poll Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduled Batch Poll Consumer Type</em>'.
     * @generated
     */
    ScheduledBatchPollConsumerType createScheduledBatchPollConsumerType();

    /**
     * Returns a new object of class '<em>Generic File Consumer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic File Consumer Type</em>'.
     * @generated
     */
    GenericFileConsumerType createGenericFileConsumerType();

    /**
     * Returns a new object of class '<em>Generic File Producer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic File Producer Type</em>'.
     * @generated
     */
    GenericFileProducerType createGenericFileProducerType();

    /**
     * Returns a new object of class '<em>Jms Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Jms Binding Type</em>'.
     * @generated
     */
    JmsBindingType createJmsBindingType();

    /**
     * Returns a new object of class '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binding Type</em>'.
     * @generated
     */
    CamelBindingType createCamelBindingType();

    /**
     * Returns a new object of class '<em>Direct Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Direct Binding Type</em>'.
     * @generated
     */
    CamelDirectBindingType createCamelDirectBindingType();

    /**
     * Returns a new object of class '<em>Timer Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timer Binding Type</em>'.
     * @generated
     */
    CamelTimerBindingType createCamelTimerBindingType();

    /**
     * Returns a new object of class '<em>Seda Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Seda Binding Type</em>'.
     * @generated
     */
    CamelSedaBindingType createCamelSedaBindingType();

    /**
     * Returns a new object of class '<em>Mock Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mock Binding Type</em>'.
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
    CamelPackage getCamelPackage();

} //CamelFactory
