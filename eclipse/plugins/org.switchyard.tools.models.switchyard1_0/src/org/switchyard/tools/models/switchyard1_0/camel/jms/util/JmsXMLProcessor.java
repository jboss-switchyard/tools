/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jms.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JmsXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JmsXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        JmsPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the JmsResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new JmsResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new JmsResourceFactoryImpl());
        }
        return registrations;
    }

} //JmsXMLProcessor
