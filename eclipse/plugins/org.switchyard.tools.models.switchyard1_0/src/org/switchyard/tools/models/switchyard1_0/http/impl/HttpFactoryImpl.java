/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.http.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.http.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HttpFactoryImpl extends EFactoryImpl implements HttpFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HttpFactory init() {
        try {
            HttpFactory theHttpFactory = (HttpFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-http:config:1.0"); 
            if (theHttpFactory != null) {
                return theHttpFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new HttpFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpFactoryImpl() {
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
            case HttpPackage.HTTP_BINDING_TYPE: return createHttpBindingType();
            case HttpPackage.HTTP_CONTEXT_MAPPER_TYPE: return createHttpContextMapperType();
            case HttpPackage.HTTP_MESSAGE_COMPOSER_TYPE: return createHttpMessageComposerType();
            case HttpPackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpBindingType createHttpBindingType() {
        HttpBindingTypeImpl httpBindingType = new HttpBindingTypeImpl();
        return httpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpContextMapperType createHttpContextMapperType() {
        HttpContextMapperTypeImpl httpContextMapperType = new HttpContextMapperTypeImpl();
        return httpContextMapperType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpMessageComposerType createHttpMessageComposerType() {
        HttpMessageComposerTypeImpl httpMessageComposerType = new HttpMessageComposerTypeImpl();
        return httpMessageComposerType;
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
    public HttpPackage getHttpPackage() {
        return (HttpPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static HttpPackage getPackage() {
        return HttpPackage.eINSTANCE;
    }

} //HttpFactoryImpl
