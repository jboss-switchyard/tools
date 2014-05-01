/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.sap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SapFactoryImpl extends EFactoryImpl implements SapFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SapFactory init() {
        try {
            SapFactory theSapFactory = (SapFactory)EPackage.Registry.INSTANCE.getEFactory(SapPackage.eNS_URI);
            if (theSapFactory != null) {
                return theSapFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SapFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SapFactoryImpl() {
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
            case SapPackage.ADDITIONAL_URI_PARAMETERS_TYPE: return createAdditionalUriParametersType();
            case SapPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case SapPackage.CAMEL_SAP_BINDING_TYPE: return createCamelSapBindingType();
            case SapPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case SapPackage.PARAMETER_TYPE: return createParameterType();
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
    public CamelSapBindingType createCamelSapBindingType() {
        CamelSapBindingTypeImpl camelSapBindingType = new CamelSapBindingTypeImpl();
        return camelSapBindingType;
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
    public SapPackage getSapPackage() {
        return (SapPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SapPackage getPackage() {
        return SapPackage.eINSTANCE;
    }

} //SapFactoryImpl
