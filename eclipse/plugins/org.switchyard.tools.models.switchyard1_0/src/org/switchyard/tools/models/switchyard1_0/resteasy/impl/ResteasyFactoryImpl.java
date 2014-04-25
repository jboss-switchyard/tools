/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.resteasy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.resteasy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResteasyFactoryImpl extends EFactoryImpl implements ResteasyFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ResteasyFactory init() {
        try {
            ResteasyFactory theResteasyFactory = (ResteasyFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-resteasy:config:2.0"); 
            if (theResteasyFactory != null) {
                return theResteasyFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ResteasyFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResteasyFactoryImpl() {
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
            case ResteasyPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case ResteasyPackage.PROXY_TYPE: return createProxyType();
            case ResteasyPackage.REST_BINDING_TYPE: return createRESTBindingType();
            case ResteasyPackage.BASIC_AUTHENTICATION_TYPE: return createBasicAuthenticationType();
            case ResteasyPackage.NTLM_AUTHENTICATION_TYPE: return createNTLMAuthenticationType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTBindingType createRESTBindingType() {
        RESTBindingTypeImpl restBindingType = new RESTBindingTypeImpl();
        return restBindingType;
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
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
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
    public ResteasyPackage getResteasyPackage() {
        return (ResteasyPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ResteasyPackage getPackage() {
        return ResteasyPackage.eINSTANCE;
    }

} //ResteasyFactoryImpl
