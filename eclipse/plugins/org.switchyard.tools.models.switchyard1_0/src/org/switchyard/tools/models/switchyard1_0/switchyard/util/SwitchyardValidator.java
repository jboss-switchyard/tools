/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.switchyard.tools.models.switchyard1_0.switchyard.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage
 * @generated
 */
public class SwitchyardValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final SwitchyardValidator INSTANCE = new SwitchyardValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.switchyard.tools.models.switchyard1_0.switchyard";

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
    public SwitchyardValidator() {
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
      return SwitchyardPackage.eINSTANCE;
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
            case SwitchyardPackage.ARTIFACTS_TYPE:
                return validateArtifactsType((ArtifactsType)value, diagnostics, context);
            case SwitchyardPackage.ARTIFACT_TYPE:
                return validateArtifactType((ArtifactType)value, diagnostics, context);
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE:
                return validateContextMapperType((ContextMapperType)value, diagnostics, context);
            case SwitchyardPackage.DOCUMENT_ROOT:
                return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
            case SwitchyardPackage.DOMAIN_TYPE:
                return validateDomainType((DomainType)value, diagnostics, context);
            case SwitchyardPackage.ESB_INTERFACE:
                return validateEsbInterface((EsbInterface)value, diagnostics, context);
            case SwitchyardPackage.HANDLERS_TYPE:
                return validateHandlersType((HandlersType)value, diagnostics, context);
            case SwitchyardPackage.HANDLER_TYPE:
                return validateHandlerType((HandlerType)value, diagnostics, context);
            case SwitchyardPackage.MESSAGE_COMPOSER_TYPE:
                return validateMessageComposerType((MessageComposerType)value, diagnostics, context);
            case SwitchyardPackage.PROPERTIES_TYPE:
                return validatePropertiesType((PropertiesType)value, diagnostics, context);
            case SwitchyardPackage.PROPERTY_TYPE:
                return validatePropertyType((PropertyType)value, diagnostics, context);
            case SwitchyardPackage.RESOURCE_TYPE:
                return validateResourceType((ResourceType)value, diagnostics, context);
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE:
                return validateSwitchYardBindingType((SwitchYardBindingType)value, diagnostics, context);
            case SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE:
                return validateSwitchYardOperationSelectorType((SwitchYardOperationSelectorType)value, diagnostics, context);
            case SwitchyardPackage.SWITCH_YARD_TYPE:
                return validateSwitchYardType((SwitchYardType)value, diagnostics, context);
            case SwitchyardPackage.TRANSFORMS_TYPE:
                return validateTransformsType((TransformsType)value, diagnostics, context);
            case SwitchyardPackage.TRANSFORM_TYPE:
                return validateTransformType((TransformType)value, diagnostics, context);
            case SwitchyardPackage.VALIDATES_TYPE:
                return validateValidatesType((ValidatesType)value, diagnostics, context);
            case SwitchyardPackage.VALIDATE_TYPE:
                return validateValidateType((ValidateType)value, diagnostics, context);
            case SwitchyardPackage.JAVA_OPERATION_SELECTOR_TYPE:
                return validateJavaOperationSelectorType((JavaOperationSelectorType)value, diagnostics, context);
            case SwitchyardPackage.REGEX_OPERATION_SELECTOR_TYPE:
                return validateRegexOperationSelectorType((RegexOperationSelectorType)value, diagnostics, context);
            case SwitchyardPackage.STATIC_OPERATION_SELECTOR_TYPE:
                return validateStaticOperationSelectorType((StaticOperationSelectorType)value, diagnostics, context);
            case SwitchyardPackage.XPATH_OPERATION_SELECTOR_TYPE:
                return validateXPathOperationSelectorType((XPathOperationSelectorType)value, diagnostics, context);
            case SwitchyardPackage.SECURITY_TYPE:
                return validateSecurityType((SecurityType)value, diagnostics, context);
            case SwitchyardPackage.SECURITIES_TYPE:
                return validateSecuritiesType((SecuritiesType)value, diagnostics, context);
            case SwitchyardPackage.PROP_BOOLEAN:
                return validatePropBoolean(value, diagnostics, context);
            case SwitchyardPackage.PROPERTY_VALUE:
                return validatePropertyValue((String)value, diagnostics, context);
            case SwitchyardPackage.PROP_INTEGER:
                return validatePropInteger(value, diagnostics, context);
            case SwitchyardPackage.PROP_LONG:
                return validatePropLong(value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateArtifactsType(ArtifactsType artifactsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(artifactsType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateArtifactType(ArtifactType artifactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(artifactType, diagnostics, context);
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
    public boolean validateDomainType(DomainType domainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(domainType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEsbInterface(EsbInterface esbInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(esbInterface, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateHandlersType(HandlersType handlersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(handlersType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateHandlerType(HandlerType handlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(handlerType, diagnostics, context);
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
    public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
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
    public boolean validateResourceType(ResourceType resourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(resourceType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSwitchYardBindingType(SwitchYardBindingType switchYardBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(switchYardBindingType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSwitchYardOperationSelectorType(SwitchYardOperationSelectorType switchYardOperationSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(switchYardOperationSelectorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSwitchYardType(SwitchYardType switchYardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(switchYardType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTransformsType(TransformsType transformsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(transformsType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTransformType(TransformType transformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(transformType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateValidatesType(ValidatesType validatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(validatesType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateValidateType(ValidateType validateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(validateType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateJavaOperationSelectorType(JavaOperationSelectorType javaOperationSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(javaOperationSelectorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRegexOperationSelectorType(RegexOperationSelectorType regexOperationSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(regexOperationSelectorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStaticOperationSelectorType(StaticOperationSelectorType staticOperationSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(staticOperationSelectorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateXPathOperationSelectorType(XPathOperationSelectorType xPathOperationSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(xPathOperationSelectorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSecurityType(SecurityType securityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(securityType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSecuritiesType(SecuritiesType securitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(securitiesType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropBoolean(Object propBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePropBoolean_MemberTypes(propBoolean, diagnostics, context);
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Prop Boolean</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropBoolean_MemberTypes(Object propBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (diagnostics != null) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if (XMLTypePackage.Literals.BOOLEAN.isInstance(propBoolean)) {
                if (xmlTypeValidator.validateBoolean((Boolean)propBoolean, tempDiagnostics, context)) return true;
            }
            if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(propBoolean)) {
                if (validatePropertyValue((String)propBoolean, tempDiagnostics, context)) return true;
            }
            for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
                diagnostics.add(diagnostic);
            }
        }
        else {
            if (XMLTypePackage.Literals.BOOLEAN.isInstance(propBoolean)) {
                if (xmlTypeValidator.validateBoolean((Boolean)propBoolean, null, context)) return true;
            }
            if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(propBoolean)) {
                if (validatePropertyValue((String)propBoolean, null, context)) return true;
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropertyValue(String propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePropertyValue_Pattern(propertyValue, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validatePropertyValue_Pattern
     */
    public static final  PatternMatcher [][] PROPERTY_VALUE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("\\$\\{([a-zA-Z0-9])*(:([a-zA-Z0-9])*)?\\}")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Property Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropertyValue_Pattern(String propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(SwitchyardPackage.Literals.PROPERTY_VALUE, propertyValue, PROPERTY_VALUE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropInteger(Object propInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePropInteger_MemberTypes(propInteger, diagnostics, context);
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Prop Integer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropInteger_MemberTypes(Object propInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (diagnostics != null) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if (XMLTypePackage.Literals.INTEGER.isInstance(propInteger)) {
                if (xmlTypeValidator.validateInteger((BigInteger)propInteger, tempDiagnostics, context)) return true;
            }
            if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(propInteger)) {
                if (validatePropertyValue((String)propInteger, tempDiagnostics, context)) return true;
            }
            for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
                diagnostics.add(diagnostic);
            }
        }
        else {
            if (XMLTypePackage.Literals.INTEGER.isInstance(propInteger)) {
                if (xmlTypeValidator.validateInteger((BigInteger)propInteger, null, context)) return true;
            }
            if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(propInteger)) {
                if (validatePropertyValue((String)propInteger, null, context)) return true;
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropLong(Object propLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePropLong_MemberTypes(propLong, diagnostics, context);
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Prop Long</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePropLong_MemberTypes(Object propLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (diagnostics != null) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if (XMLTypePackage.Literals.LONG.isInstance(propLong)) {
                if (xmlTypeValidator.validateLong((Long)propLong, tempDiagnostics, context)) return true;
            }
            if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(propLong)) {
                if (validatePropertyValue((String)propLong, tempDiagnostics, context)) return true;
            }
            for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
                diagnostics.add(diagnostic);
            }
        }
        else {
            if (XMLTypePackage.Literals.LONG.isInstance(propLong)) {
                if (xmlTypeValidator.validateLong((Long)propLong, null, context)) return true;
            }
            if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(propLong)) {
                if (validatePropertyValue((String)propLong, null, context)) return true;
            }
        }
        return false;
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

} //SwitchyardValidator
