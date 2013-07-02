/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.switchyard.tools.models.switchyard1_0.soap.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage
 * @generated
 */
public class SOAPValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final SOAPValidator INSTANCE = new SOAPValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.switchyard.tools.models.switchyard1_0.soap";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTypeValidator xmlTypeValidator;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPValidator() {
        super();
        xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return SOAPPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case SOAPPackage.CONTEXT_MAPPER_TYPE:
                return validateContextMapperType((ContextMapperType)value, diagnostics, context);
            case SOAPPackage.DOCUMENT_ROOT:
                return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
            case SOAPPackage.ENDPOINT_CONFIG_TYPE:
                return validateEndpointConfigType((EndpointConfigType)value, diagnostics, context);
            case SOAPPackage.INTERCEPTORS_TYPE:
                return validateInterceptorsType((InterceptorsType)value, diagnostics, context);
            case SOAPPackage.INTERCEPTOR_TYPE:
                return validateInterceptorType((InterceptorType)value, diagnostics, context);
            case SOAPPackage.MESSAGE_COMPOSER_TYPE:
                return validateMessageComposerType((MessageComposerType)value, diagnostics, context);
            case SOAPPackage.MTOM_TYPE:
                return validateMtomType((MtomType)value, diagnostics, context);
            case SOAPPackage.PROPERTIES_TYPE:
                return validatePropertiesType((PropertiesType)value, diagnostics, context);
            case SOAPPackage.PROPERTY_TYPE:
                return validatePropertyType((PropertyType)value, diagnostics, context);
            case SOAPPackage.PROXY_TYPE:
                return validateProxyType((ProxyType)value, diagnostics, context);
            case SOAPPackage.SOAP_BINDING_TYPE:
                return validateSOAPBindingType((SOAPBindingType)value, diagnostics, context);
            case SOAPPackage.BASIC_AUTHENTICATION_TYPE:
                return validateBasicAuthenticationType((BasicAuthenticationType)value, diagnostics, context);
            case SOAPPackage.NTLM_AUTHENTICATION_TYPE:
                return validateNTLMAuthenticationType((NTLMAuthenticationType)value, diagnostics, context);
            case SOAPPackage.SOAP_HEADERS_TYPE:
                return validateSoapHeadersType((SoapHeadersType)value, diagnostics, context);
            case SOAPPackage.SOAP_HEADERS_TYPE_OBJECT:
                return validateSoapHeadersTypeObject((SoapHeadersType)value, diagnostics, context);
            case SOAPPackage.WSDL_PORT_TYPE:
                return validateWsdlPortType((String)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateContextMapperType(ContextMapperType contextMapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(contextMapperType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSOAPBindingType(SOAPBindingType soapBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(soapBindingType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicAuthenticationType(BasicAuthenticationType basicAuthenticationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(basicAuthenticationType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNTLMAuthenticationType(NTLMAuthenticationType ntlmAuthenticationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ntlmAuthenticationType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInterceptorType(InterceptorType interceptorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(interceptorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMessageComposerType(MessageComposerType messageComposerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(messageComposerType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInterceptorsType(InterceptorsType interceptorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(interceptorsType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMtomType(MtomType mtomType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(mtomType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEndpointConfigType(EndpointConfigType endpointConfigType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(endpointConfigType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProxyType(ProxyType proxyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(proxyType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSoapHeadersType(SoapHeadersType soapHeadersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSoapHeadersTypeObject(SoapHeadersType soapHeadersTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateWsdlPortType(String wsdlPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateWsdlPortType_Pattern(wsdlPortType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateWsdlPortType_Pattern
     */
    public static final  PatternMatcher [][] WSDL_PORT_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("\\{.+\\}.+:[^:]+|.+:[^:]+|[^:]+")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Wsdl Port Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateWsdlPortType_Pattern(String wsdlPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(SOAPPackage.Literals.WSDL_PORT_TYPE, wsdlPortType, WSDL_PORT_TYPE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //SOAPValidator
