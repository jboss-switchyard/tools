/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.validate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidateFactoryImpl extends EFactoryImpl implements ValidateFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ValidateFactory init() {
        try {
            ValidateFactory theValidateFactory = (ValidateFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-config:validate:2.0"); 
            if (theValidateFactory != null) {
                return theValidateFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ValidateFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValidateFactoryImpl() {
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
            case ValidatePackage.DOCUMENT_ROOT: return createDocumentRoot();
            case ValidatePackage.JAVA_VALIDATE_TYPE: return createJavaValidateType();
            case ValidatePackage.XML_VALIDATE_TYPE: return createXmlValidateType();
            case ValidatePackage.SCHEMA_FILES_TYPE: return createSchemaFilesType();
            case ValidatePackage.SCHEMA_CATALOGS_TYPE: return createSchemaCatalogsType();
            case ValidatePackage.FILE_ENTRY_TYPE: return createFileEntryType();
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
            case ValidatePackage.XML_SCHEMA_TYPE:
                return createXmlSchemaTypeFromString(eDataType, initialValue);
            case ValidatePackage.XML_SCHEMA_TYPE_OBJECT:
                return createXmlSchemaTypeObjectFromString(eDataType, initialValue);
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
            case ValidatePackage.XML_SCHEMA_TYPE:
                return convertXmlSchemaTypeToString(eDataType, instanceValue);
            case ValidatePackage.XML_SCHEMA_TYPE_OBJECT:
                return convertXmlSchemaTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public JavaValidateType createJavaValidateType() {
        JavaValidateTypeImpl javaValidateType = new JavaValidateTypeImpl();
        return javaValidateType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlValidateType createXmlValidateType() {
        XmlValidateTypeImpl xmlValidateType = new XmlValidateTypeImpl();
        return xmlValidateType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFilesType createSchemaFilesType() {
        SchemaFilesTypeImpl schemaFilesType = new SchemaFilesTypeImpl();
        return schemaFilesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaCatalogsType createSchemaCatalogsType() {
        SchemaCatalogsTypeImpl schemaCatalogsType = new SchemaCatalogsTypeImpl();
        return schemaCatalogsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileEntryType createFileEntryType() {
        FileEntryTypeImpl fileEntryType = new FileEntryTypeImpl();
        return fileEntryType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlSchemaType createXmlSchemaTypeFromString(EDataType eDataType, String initialValue) {
        XmlSchemaType result = XmlSchemaType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertXmlSchemaTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XmlSchemaType createXmlSchemaTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createXmlSchemaTypeFromString(ValidatePackage.Literals.XML_SCHEMA_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertXmlSchemaTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertXmlSchemaTypeToString(ValidatePackage.Literals.XML_SCHEMA_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValidatePackage getValidatePackage() {
        return (ValidatePackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static ValidatePackage getPackage() {
        return ValidatePackage.eINSTANCE;
    }

} //ValidateFactoryImpl
