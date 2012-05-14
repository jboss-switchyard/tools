/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
            SwitchyardFactory theSwitchyardFactory = (SwitchyardFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-config:switchyard:1.0"); 
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
            case SwitchyardPackage.HANDLERS_TYPE: return createHandlersType();
            case SwitchyardPackage.HANDLER_TYPE: return createHandlerType();
            case SwitchyardPackage.MESSAGE_COMPOSER_TYPE: return createMessageComposerType();
            case SwitchyardPackage.PROPERTIES_TYPE: return createPropertiesType();
            case SwitchyardPackage.PROPERTY_TYPE: return createPropertyType();
            case SwitchyardPackage.RESOURCE_TYPE: return createResourceType();
            case SwitchyardPackage.SWITCH_YARD_TYPE: return createSwitchYardType();
            case SwitchyardPackage.TRANSFORMS_TYPE: return createTransformsType();
            case SwitchyardPackage.VALIDATES_TYPE: return createValidatesType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public HandlersType createHandlersType() {
        HandlersTypeImpl handlersType = new HandlersTypeImpl();
        return handlersType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HandlerType createHandlerType() {
        HandlerTypeImpl handlerType = new HandlerTypeImpl();
        return handlerType;
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
