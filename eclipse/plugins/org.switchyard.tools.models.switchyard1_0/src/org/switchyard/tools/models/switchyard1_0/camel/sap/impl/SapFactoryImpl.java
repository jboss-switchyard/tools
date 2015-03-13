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
            case SapPackage.CAMEL_SAP_IDOC_DESTINATION_TYPE: return createCamelSapIDocDestinationType();
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE: return createCamelSapIDocListDestinationType();
            case SapPackage.CAMEL_SAP_IDOC_LIST_SERVER_TYPE: return createCamelSapIDocListServerType();
            case SapPackage.CAMEL_SAP_QI_DOC_DESTINATION_TYPE: return createCamelSapQIDocDestinationType();
            case SapPackage.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE: return createCamelSapQIDocListDestinationType();
            case SapPackage.CAMEL_SAP_QRFC_DESTINATION_TYPE: return createCamelSapQRfcDestinationType();
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE: return createCamelSapSRfcDestinationType();
            case SapPackage.CAMEL_SAP_SRFC_SERVER_TYPE: return createCamelSapSRfcServerType();
            case SapPackage.CAMEL_SAP_TRFC_DESTINATION_TYPE: return createCamelSapTRfcDestinationType();
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE: return createCamelSapTRfcServerType();
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
    public CamelSapIDocDestinationType createCamelSapIDocDestinationType() {
        CamelSapIDocDestinationTypeImpl camelSapIDocDestinationType = new CamelSapIDocDestinationTypeImpl();
        return camelSapIDocDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapIDocListDestinationType createCamelSapIDocListDestinationType() {
        CamelSapIDocListDestinationTypeImpl camelSapIDocListDestinationType = new CamelSapIDocListDestinationTypeImpl();
        return camelSapIDocListDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapIDocListServerType createCamelSapIDocListServerType() {
        CamelSapIDocListServerTypeImpl camelSapIDocListServerType = new CamelSapIDocListServerTypeImpl();
        return camelSapIDocListServerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapQIDocDestinationType createCamelSapQIDocDestinationType() {
        CamelSapQIDocDestinationTypeImpl camelSapQIDocDestinationType = new CamelSapQIDocDestinationTypeImpl();
        return camelSapQIDocDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapQIDocListDestinationType createCamelSapQIDocListDestinationType() {
        CamelSapQIDocListDestinationTypeImpl camelSapQIDocListDestinationType = new CamelSapQIDocListDestinationTypeImpl();
        return camelSapQIDocListDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapQRfcDestinationType createCamelSapQRfcDestinationType() {
        CamelSapQRfcDestinationTypeImpl camelSapQRfcDestinationType = new CamelSapQRfcDestinationTypeImpl();
        return camelSapQRfcDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapSRfcDestinationType createCamelSapSRfcDestinationType() {
        CamelSapSRfcDestinationTypeImpl camelSapSRfcDestinationType = new CamelSapSRfcDestinationTypeImpl();
        return camelSapSRfcDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapSRfcServerType createCamelSapSRfcServerType() {
        CamelSapSRfcServerTypeImpl camelSapSRfcServerType = new CamelSapSRfcServerTypeImpl();
        return camelSapSRfcServerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapTRfcDestinationType createCamelSapTRfcDestinationType() {
        CamelSapTRfcDestinationTypeImpl camelSapTRfcDestinationType = new CamelSapTRfcDestinationTypeImpl();
        return camelSapTRfcDestinationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSapTRfcServerType createCamelSapTRfcServerType() {
        CamelSapTRfcServerTypeImpl camelSapTRfcServerType = new CamelSapTRfcServerTypeImpl();
        return camelSapTRfcServerType;
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
