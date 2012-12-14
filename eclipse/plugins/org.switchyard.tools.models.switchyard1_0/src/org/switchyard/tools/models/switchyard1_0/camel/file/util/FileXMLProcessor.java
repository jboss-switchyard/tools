/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        FilePackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the FileResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new FileResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new FileResourceFactoryImpl());
        }
        return registrations;
    }

} //FileXMLProcessor
