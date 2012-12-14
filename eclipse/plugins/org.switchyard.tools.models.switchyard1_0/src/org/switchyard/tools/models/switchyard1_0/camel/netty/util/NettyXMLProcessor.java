/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NettyXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NettyXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        NettyPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the NettyResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new NettyResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new NettyResourceFactoryImpl());
        }
        return registrations;
    }

} //NettyXMLProcessor
