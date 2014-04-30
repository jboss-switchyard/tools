/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.rss.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.rss.RssPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RssXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RssXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        RssPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the RssResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new RssResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new RssResourceFactoryImpl());
        }
        return registrations;
    }

} //RssXMLProcessor
