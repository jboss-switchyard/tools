/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.netty.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NettyFactoryImpl extends EFactoryImpl implements NettyFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NettyFactory init() {
        try {
            NettyFactory theNettyFactory = (NettyFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-netty:config:1.0"); 
            if (theNettyFactory != null) {
                return theNettyFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new NettyFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NettyFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case NettyPackage.CAMEL_NETTY_TCP_BINDING_TYPE: return createCamelNettyTcpBindingType();
            case NettyPackage.CAMEL_NETTY_UDP_BINDING_TYPE: return createCamelNettyUdpBindingType();
            case NettyPackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelNettyTcpBindingType createCamelNettyTcpBindingType() {
        CamelNettyTcpBindingTypeImpl camelNettyTcpBindingType = new CamelNettyTcpBindingTypeImpl();
        return camelNettyTcpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelNettyUdpBindingType createCamelNettyUdpBindingType() {
        CamelNettyUdpBindingTypeImpl camelNettyUdpBindingType = new CamelNettyUdpBindingTypeImpl();
        return camelNettyUdpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NettyPackage getNettyPackage() {
        return (NettyPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static NettyPackage getPackage() {
        return NettyPackage.eINSTANCE;
    }

} //NettyFactoryImpl
