/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.jms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JmsFactoryImpl extends EFactoryImpl implements JmsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JmsFactory init() {
        try {
            JmsFactory theJmsFactory = (JmsFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-jms:config:1.0"); 
            if (theJmsFactory != null) {
                return theJmsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new JmsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JmsFactoryImpl() {
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
            case JmsPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE: return createCamelJmsBindingType();
            case JmsPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
    public CamelJmsBindingType createCamelJmsBindingType() {
        CamelJmsBindingTypeImpl camelJmsBindingType = new CamelJmsBindingTypeImpl();
        return camelJmsBindingType;
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
    public JmsPackage getJmsPackage() {
        return (JmsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JmsPackage getPackage() {
        return JmsPackage.eINSTANCE;
    }

} //JmsFactoryImpl
