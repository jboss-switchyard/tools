/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FtpXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FtpXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        FtpPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the FtpResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new FtpResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new FtpResourceFactoryImpl());
        }
        return registrations;
    }

} //FtpXMLProcessor
