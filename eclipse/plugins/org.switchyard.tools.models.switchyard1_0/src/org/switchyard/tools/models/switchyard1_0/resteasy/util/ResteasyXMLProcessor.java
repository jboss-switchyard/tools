/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.resteasy.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResteasyXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResteasyXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        ResteasyPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the ResteasyResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new ResteasyResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new ResteasyResourceFactoryImpl());
        }
        return registrations;
    }

} //ResteasyXMLProcessor
