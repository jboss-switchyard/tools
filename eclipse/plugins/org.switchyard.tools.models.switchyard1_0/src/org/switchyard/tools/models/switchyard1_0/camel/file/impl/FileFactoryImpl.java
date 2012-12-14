/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.file.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileFactoryImpl extends EFactoryImpl implements FileFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FileFactory init() {
        try {
            FileFactory theFileFactory = (FileFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-file:config:1.0"); 
            if (theFileFactory != null) {
                return theFileFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FileFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileFactoryImpl() {
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
            case FilePackage.CAMEL_FILE_BINDING_TYPE: return createCamelFileBindingType();
            case FilePackage.FILE_CONSUMER_TYPE: return createFileConsumerType();
            case FilePackage.FILE_PRODUCER_TYPE: return createFileProducerType();
            case FilePackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelFileBindingType createCamelFileBindingType() {
        CamelFileBindingTypeImpl camelFileBindingType = new CamelFileBindingTypeImpl();
        return camelFileBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileConsumerType createFileConsumerType() {
        FileConsumerTypeImpl fileConsumerType = new FileConsumerTypeImpl();
        return fileConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileProducerType createFileProducerType() {
        FileProducerTypeImpl fileProducerType = new FileProducerTypeImpl();
        return fileProducerType;
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
    public FilePackage getFilePackage() {
        return (FilePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FilePackage getPackage() {
        return FilePackage.eINSTANCE;
    }

} //FileFactoryImpl
