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
            HttpFactory theHttpFactory = (HttpFactory)EPackage.Registry.INSTANCE.getEFactory(HttpPackage.eNS_URI);
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
            case HttpPackage.BASIC_AUTHENTICATION_TYPE: return createBasicAuthenticationType();
            case HttpPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case HttpPackage.HTTP_BINDING_TYPE: return createHTTPBindingType();
            case HttpPackage.NTLM_AUTHENTICATION_TYPE: return createNTLMAuthenticationType();
            case HttpPackage.PROXY_TYPE: return createProxyType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
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
    public HTTPBindingType createHTTPBindingType() {
        HTTPBindingTypeImpl httpBindingType = new HTTPBindingTypeImpl();
        return httpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicAuthenticationType createBasicAuthenticationType() {
        BasicAuthenticationTypeImpl basicAuthenticationType = new BasicAuthenticationTypeImpl();
        return basicAuthenticationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NTLMAuthenticationType createNTLMAuthenticationType() {
        NTLMAuthenticationTypeImpl ntlmAuthenticationType = new NTLMAuthenticationTypeImpl();
        return ntlmAuthenticationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProxyType createProxyType() {
        ProxyTypeImpl proxyType = new ProxyTypeImpl();
        return proxyType;
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
