/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.amqp.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AmqpXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AmqpXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        AmqpPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the AmqpResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new AmqpResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new AmqpResourceFactoryImpl());
        }
        return registrations;
    }

} //AmqpXMLProcessor
