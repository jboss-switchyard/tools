/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        JpaPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the JpaResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new JpaResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new JpaResourceFactoryImpl());
        }
        return registrations;
    }

} //JpaXMLProcessor
