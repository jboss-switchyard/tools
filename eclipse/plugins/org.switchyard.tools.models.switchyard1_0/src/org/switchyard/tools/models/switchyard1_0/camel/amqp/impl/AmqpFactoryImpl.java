/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.amqp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmqpFactoryImpl extends EFactoryImpl implements AmqpFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AmqpFactory init() {
        try {
            AmqpFactory theAmqpFactory = (AmqpFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-amqp:config:1.0"); 
            if (theAmqpFactory != null) {
                return theAmqpFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AmqpFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AmqpFactoryImpl() {
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
            case AmqpPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE: return createCamelAmqpBindingType();
            case AmqpPackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseCamelBinding createBaseCamelBinding() {
        BaseCamelBindingImpl baseCamelBinding = new BaseCamelBindingImpl();
        return baseCamelBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelAmqpBindingType createCamelAmqpBindingType() {
        CamelAmqpBindingTypeImpl camelAmqpBindingType = new CamelAmqpBindingTypeImpl();
        return camelAmqpBindingType;
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
    public AmqpPackage getAmqpPackage() {
        return (AmqpPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AmqpPackage getPackage() {
        return AmqpPackage.eINSTANCE;
    }

} //AmqpFactoryImpl
