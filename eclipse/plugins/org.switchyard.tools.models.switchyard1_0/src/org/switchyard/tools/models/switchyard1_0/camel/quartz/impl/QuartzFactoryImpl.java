/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.quartz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuartzFactoryImpl extends EFactoryImpl implements QuartzFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QuartzFactory init() {
        try {
            QuartzFactory theQuartzFactory = (QuartzFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-quartz:config:1.0"); 
            if (theQuartzFactory != null) {
                return theQuartzFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new QuartzFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuartzFactoryImpl() {
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
            case QuartzPackage.ADDITIONAL_URI_PARAMETERS_TYPE: return createAdditionalUriParametersType();
            case QuartzPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE: return createCamelQuartzBindingType();
            case QuartzPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case QuartzPackage.PARAMETER_TYPE: return createParameterType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalUriParametersType createAdditionalUriParametersType() {
        AdditionalUriParametersTypeImpl additionalUriParametersType = new AdditionalUriParametersTypeImpl();
        return additionalUriParametersType;
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
    public CamelQuartzBindingType createCamelQuartzBindingType() {
        CamelQuartzBindingTypeImpl camelQuartzBindingType = new CamelQuartzBindingTypeImpl();
        return camelQuartzBindingType;
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
    public ParameterType createParameterType() {
        ParameterTypeImpl parameterType = new ParameterTypeImpl();
        return parameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuartzPackage getQuartzPackage() {
        return (QuartzPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static QuartzPackage getPackage() {
        return QuartzPackage.eINSTANCE;
    }

} //QuartzFactoryImpl
