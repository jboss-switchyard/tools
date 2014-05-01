/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SapXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SapXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        SapPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the SapResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new SapResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new SapResourceFactoryImpl());
        }
        return registrations;
    }

} //SapXMLProcessor
