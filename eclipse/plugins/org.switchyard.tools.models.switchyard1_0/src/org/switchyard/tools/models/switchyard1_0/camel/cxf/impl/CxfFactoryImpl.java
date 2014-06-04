/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.cxf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.cxf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CxfFactoryImpl extends EFactoryImpl implements CxfFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CxfFactory init() {
        try {
            CxfFactory theCxfFactory = (CxfFactory)EPackage.Registry.INSTANCE.getEFactory(CxfPackage.eNS_URI);
            if (theCxfFactory != null) {
                return theCxfFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CxfFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CxfFactoryImpl() {
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
            case CxfPackage.ADDITIONAL_URI_PARAMETERS_TYPE: return createAdditionalUriParametersType();
            case CxfPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE: return createCamelCxfBindingType();
            case CxfPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case CxfPackage.PARAMETER_TYPE: return createParameterType();
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
    public CamelCxfBindingType createCamelCxfBindingType() {
        CamelCxfBindingTypeImpl camelCxfBindingType = new CamelCxfBindingTypeImpl();
        return camelCxfBindingType;
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
    public CxfPackage getCxfPackage() {
        return (CxfPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CxfPackage getPackage() {
        return CxfPackage.eINSTANCE;
    }

} //CxfFactoryImpl
