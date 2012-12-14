/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.quartz.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuartzXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuartzXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        QuartzPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the QuartzResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new QuartzResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new QuartzResourceFactoryImpl());
        }
        return registrations;
    }

} //QuartzXMLProcessor
