/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchyardFactoryImpl extends EFactoryImpl implements SwitchyardFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static SwitchyardFactory init() {
        try {
            SwitchyardFactory theSwitchyardFactory = (SwitchyardFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-config:switchyard:2.0"); 
            if (theSwitchyardFactory != null) {
                return theSwitchyardFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SwitchyardFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SwitchyardFactoryImpl() {
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
            case SwitchyardPackage.ARTIFACTS_TYPE: return createArtifactsType();
            case SwitchyardPackage.ARTIFACT_TYPE: return createArtifactType();
            case SwitchyardPackage.CONTEXT_MAPPER_TYPE: return createContextMapperType();
            case SwitchyardPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case SwitchyardPackage.DOMAIN_TYPE: return createDomainType();
            case SwitchyardPackage.ESB_INTERFACE: return createEsbInterface();
            case SwitchyardPackage.JAVA_OPERATION_SELECTOR_TYPE: return createJavaOperationSelectorType();
            case SwitchyardPackage.MESSAGE_COMPOSER_TYPE: return createMessageComposerType();
            case SwitchyardPackage.PROPERTIES_TYPE: return createPropertiesType();
            case SwitchyardPackage.PROPERTY_TYPE: return createPropertyType();
            case SwitchyardPackage.REGEX_OPERATION_SELECTOR_TYPE: return createRegexOperationSelectorType();
            case SwitchyardPackage.RESOURCE_TYPE: return createResourceType();
            case SwitchyardPackage.SECURITIES_TYPE: return createSecuritiesType();
            case SwitchyardPackage.SECURITY_TYPE: return createSecurityType();
            case SwitchyardPackage.STATIC_OPERATION_SELECTOR_TYPE: return createStaticOperationSelectorType();
            case SwitchyardPackage.SWITCH_YARD_TYPE: return createSwitchYardType();
            case SwitchyardPackage.THROTTLING_TYPE: return createThrottlingType();
            case SwitchyardPackage.TRANSFORMS_TYPE: return createTransformsType();
            case SwitchyardPackage.VALIDATES_TYPE: return createValidatesType();
            case SwitchyardPackage.XPATH_OPERATION_SELECTOR_TYPE: return createXPathOperationSelectorType();
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
            case SwitchyardPackage.PROP_BOOLEAN:
                return createPropBooleanFromString(eDataType, initialValue);
            case SwitchyardPackage.PROPERTY_VALUE:
                return createPropertyValueFromString(eDataType, initialValue);
            case SwitchyardPackage.PROP_INTEGER:
                return createPropIntegerFromString(eDataType, initialValue);
            case SwitchyardPackage.PROP_LONG:
                return createPropLongFromString(eDataType, initialValue);
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
            case SwitchyardPackage.PROP_BOOLEAN:
                return convertPropBooleanToString(eDataType, instanceValue);
            case SwitchyardPackage.PROPERTY_VALUE:
                return convertPropertyValueToString(eDataType, instanceValue);
            case SwitchyardPackage.PROP_INTEGER:
                return convertPropIntegerToString(eDataType, instanceValue);
            case SwitchyardPackage.PROP_LONG:
                return convertPropLongToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ArtifactsType createArtifactsType() {
        ArtifactsTypeImpl artifactsType = new ArtifactsTypeImpl();
        return artifactsType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ArtifactType createArtifactType() {
        ArtifactTypeImpl artifactType = new ArtifactTypeImpl();
        return artifactType;
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
	public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DomainType createDomainType() {
        DomainTypeImpl domainType = new DomainTypeImpl();
        return domainType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EsbInterface createEsbInterface() {
        EsbInterfaceImpl esbInterface = new EsbInterfaceImpl();
        return esbInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MessageComposerType createMessageComposerType() {
        MessageComposerTypeImpl messageComposerType = new MessageComposerTypeImpl();
        return messageComposerType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertiesType createPropertiesType() {
        PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
        return propertiesType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyType createPropertyType() {
        PropertyTypeImpl propertyType = new PropertyTypeImpl();
        return propertyType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceType createResourceType() {
        ResourceTypeImpl resourceType = new ResourceTypeImpl();
        return resourceType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SwitchYardType createSwitchYardType() {
        SwitchYardTypeImpl switchYardType = new SwitchYardTypeImpl();
        return switchYardType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThrottlingType createThrottlingType() {
        ThrottlingTypeImpl throttlingType = new ThrottlingTypeImpl();
        return throttlingType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformsType createTransformsType() {
        TransformsTypeImpl transformsType = new TransformsTypeImpl();
        return transformsType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValidatesType createValidatesType() {
        ValidatesTypeImpl validatesType = new ValidatesTypeImpl();
        return validatesType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaOperationSelectorType createJavaOperationSelectorType() {
        JavaOperationSelectorTypeImpl javaOperationSelectorType = new JavaOperationSelectorTypeImpl();
        return javaOperationSelectorType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RegexOperationSelectorType createRegexOperationSelectorType() {
        RegexOperationSelectorTypeImpl regexOperationSelectorType = new RegexOperationSelectorTypeImpl();
        return regexOperationSelectorType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StaticOperationSelectorType createStaticOperationSelectorType() {
        StaticOperationSelectorTypeImpl staticOperationSelectorType = new StaticOperationSelectorTypeImpl();
        return staticOperationSelectorType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XPathOperationSelectorType createXPathOperationSelectorType() {
        XPathOperationSelectorTypeImpl xPathOperationSelectorType = new XPathOperationSelectorTypeImpl();
        return xPathOperationSelectorType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecurityType createSecurityType() {
        SecurityTypeImpl securityType = new SecurityTypeImpl();
        return securityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecuritiesType createSecuritiesType() {
        SecuritiesTypeImpl securitiesType = new SecuritiesTypeImpl();
        return securitiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createPropBooleanFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createPropertyValueFromString(SwitchyardPackage.Literals.PROPERTY_VALUE, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPropBooleanToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.BOOLEAN.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(instanceValue)) {
            try {
                String value = convertPropertyValueToString(SwitchyardPackage.Literals.PROPERTY_VALUE, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createPropertyValueFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPropertyValueToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createPropIntegerFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createPropertyValueFromString(SwitchyardPackage.Literals.PROPERTY_VALUE, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPropIntegerToStringGen(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.INTEGER.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(instanceValue)) {
            try {
                String value = convertPropertyValueToString(SwitchyardPackage.Literals.PROPERTY_VALUE, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    public String convertPropIntegerToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        return instanceValue.toString();
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createPropLongFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createPropertyValueFromString(SwitchyardPackage.Literals.PROPERTY_VALUE, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPropLongToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.LONG.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SwitchyardPackage.Literals.PROPERTY_VALUE.isInstance(instanceValue)) {
            try {
                String value = convertPropertyValueToString(SwitchyardPackage.Literals.PROPERTY_VALUE, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SwitchyardPackage getSwitchyardPackage() {
        return (SwitchyardPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static SwitchyardPackage getPackage() {
        return SwitchyardPackage.eINSTANCE;
    }

} //SwitchyardFactoryImpl
