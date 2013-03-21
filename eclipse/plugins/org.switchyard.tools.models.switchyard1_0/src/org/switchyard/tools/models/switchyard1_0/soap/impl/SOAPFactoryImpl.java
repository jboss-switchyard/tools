/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.switchyard.tools.models.switchyard1_0.soap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SOAPFactoryImpl extends EFactoryImpl implements SOAPFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SOAPFactory init() {
        try {
            SOAPFactory theSOAPFactory = (SOAPFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-soap:config:1.0"); 
            if (theSOAPFactory != null) {
                return theSOAPFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SOAPFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPFactoryImpl() {
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
            case SOAPPackage.CONTEXT_MAPPER_TYPE: return createContextMapperType();
            case SOAPPackage.SOAP_MESSAGE_COMPOSER_TYPE: return createSOAPMessageComposerType();
            case SOAPPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case SOAPPackage.SOAP_BINDING_TYPE: return createSOAPBindingType();
            case SOAPPackage.INTERCEPTOR_TYPE: return createInterceptorType();
            case SOAPPackage.INTERCEPTORS_TYPE: return createInterceptorsType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SOAPPackage.SOAP_HEADERS_TYPE:
                return createSoapHeadersTypeFromString(eDataType, initialValue);
            case SOAPPackage.SOAP_HEADERS_TYPE_OBJECT:
                return createSoapHeadersTypeObjectFromString(eDataType, initialValue);
            case SOAPPackage.WSDL_PORT_TYPE:
                return createWsdlPortTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SOAPPackage.SOAP_HEADERS_TYPE:
                return convertSoapHeadersTypeToString(eDataType, instanceValue);
            case SOAPPackage.SOAP_HEADERS_TYPE_OBJECT:
                return convertSoapHeadersTypeObjectToString(eDataType, instanceValue);
            case SOAPPackage.WSDL_PORT_TYPE:
                return convertWsdlPortTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType createContextMapperType() {
        ContextMapperTypeImpl contextMapperType = new ContextMapperTypeImpl();
        return contextMapperType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPMessageComposerType createSOAPMessageComposerType() {
        SOAPMessageComposerTypeImpl soapMessageComposerType = new SOAPMessageComposerTypeImpl();
        return soapMessageComposerType;
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
    public SOAPBindingType createSOAPBindingType() {
        SOAPBindingTypeImpl soapBindingType = new SOAPBindingTypeImpl();
        return soapBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterceptorType createInterceptorType() {
        InterceptorTypeImpl interceptorType = new InterceptorTypeImpl();
        return interceptorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterceptorsType createInterceptorsType() {
        InterceptorsTypeImpl interceptorsType = new InterceptorsTypeImpl();
        return interceptorsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoapHeadersType createSoapHeadersTypeFromString(EDataType eDataType, String initialValue) {
        SoapHeadersType result = SoapHeadersType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSoapHeadersTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoapHeadersType createSoapHeadersTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSoapHeadersTypeFromString(SOAPPackage.Literals.SOAP_HEADERS_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSoapHeadersTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSoapHeadersTypeToString(SOAPPackage.Literals.SOAP_HEADERS_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createWsdlPortTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWsdlPortTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPPackage getSOAPPackage() {
        return (SOAPPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SOAPPackage getPackage() {
        return SOAPPackage.eINSTANCE;
    }

} //SOAPFactoryImpl
