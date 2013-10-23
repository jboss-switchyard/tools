/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

import org.switchyard.tools.models.switchyard1_0.soap.*;

import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage
 * @generated
 */
public class SOAPSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SOAPPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPSwitch() {
        if (modelPackage == null) {
            modelPackage = SOAPPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SOAPPackage.CONTEXT_MAPPER_TYPE: {
                ContextMapperType contextMapperType = (ContextMapperType)theEObject;
                T result = caseContextMapperType(contextMapperType);
                if (result == null) result = caseSwitchyard_ContextMapperType(contextMapperType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.ENDPOINT_CONFIG_TYPE: {
                EndpointConfigType endpointConfigType = (EndpointConfigType)theEObject;
                T result = caseEndpointConfigType(endpointConfigType);
                if (result == null) result = caseCommonExtensionBase(endpointConfigType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.INTERCEPTORS_TYPE: {
                InterceptorsType interceptorsType = (InterceptorsType)theEObject;
                T result = caseInterceptorsType(interceptorsType);
                if (result == null) result = caseCommonExtensionBase(interceptorsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.INTERCEPTOR_TYPE: {
                InterceptorType interceptorType = (InterceptorType)theEObject;
                T result = caseInterceptorType(interceptorType);
                if (result == null) result = caseCommonExtensionBase(interceptorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.MESSAGE_COMPOSER_TYPE: {
                MessageComposerType messageComposerType = (MessageComposerType)theEObject;
                T result = caseMessageComposerType(messageComposerType);
                if (result == null) result = caseSwitchyard_MessageComposerType(messageComposerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.MTOM_TYPE: {
                MtomType mtomType = (MtomType)theEObject;
                T result = caseMtomType(mtomType);
                if (result == null) result = caseCommonExtensionBase(mtomType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.PROPERTIES_TYPE: {
                PropertiesType propertiesType = (PropertiesType)theEObject;
                T result = casePropertiesType(propertiesType);
                if (result == null) result = caseCommonExtensionBase(propertiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.PROPERTY_TYPE: {
                PropertyType propertyType = (PropertyType)theEObject;
                T result = casePropertyType(propertyType);
                if (result == null) result = caseCommonExtensionBase(propertyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.PROXY_TYPE: {
                ProxyType proxyType = (ProxyType)theEObject;
                T result = caseProxyType(proxyType);
                if (result == null) result = caseCommonExtensionBase(proxyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.SOAP_BINDING_TYPE: {
                SOAPBindingType soapBindingType = (SOAPBindingType)theEObject;
                T result = caseSOAPBindingType(soapBindingType);
                if (result == null) result = caseSwitchYardBindingType(soapBindingType);
                if (result == null) result = caseBinding(soapBindingType);
                if (result == null) result = caseCommonExtensionBase(soapBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.BASIC_AUTHENTICATION_TYPE: {
                BasicAuthenticationType basicAuthenticationType = (BasicAuthenticationType)theEObject;
                T result = caseBasicAuthenticationType(basicAuthenticationType);
                if (result == null) result = caseCommonExtensionBase(basicAuthenticationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SOAPPackage.NTLM_AUTHENTICATION_TYPE: {
                NTLMAuthenticationType ntlmAuthenticationType = (NTLMAuthenticationType)theEObject;
                T result = caseNTLMAuthenticationType(ntlmAuthenticationType);
                if (result == null) result = caseBasicAuthenticationType(ntlmAuthenticationType);
                if (result == null) result = caseCommonExtensionBase(ntlmAuthenticationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Mapper Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Mapper Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextMapperType(ContextMapperType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSOAPBindingType(SOAPBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Authentication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Authentication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicAuthenticationType(BasicAuthenticationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>NTLM Authentication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>NTLM Authentication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNTLMAuthenticationType(NTLMAuthenticationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interceptor Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interceptor Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterceptorType(InterceptorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message Composer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message Composer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessageComposerType(MessageComposerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interceptors Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interceptors Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterceptorsType(InterceptorsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mtom Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mtom Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMtomType(MtomType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyType(PropertyType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertiesType(PropertiesType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Endpoint Config Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Endpoint Config Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndpointConfigType(EndpointConfigType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Proxy Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Proxy Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProxyType(ProxyType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Mapper Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Mapper Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchyard_ContextMapperType(org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonExtensionBase(CommonExtensionBase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message Composer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message Composer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchyard_MessageComposerType(org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinding(Binding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Yard Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Yard Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchYardBindingType(SwitchYardBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SOAPSwitch
