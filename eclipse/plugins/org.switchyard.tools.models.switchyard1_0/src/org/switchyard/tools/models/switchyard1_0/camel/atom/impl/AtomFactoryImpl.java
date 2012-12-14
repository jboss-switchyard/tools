/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.atom.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.atom.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomFactoryImpl extends EFactoryImpl implements AtomFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AtomFactory init() {
        try {
            AtomFactory theAtomFactory = (AtomFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-atom:config:1.0"); 
            if (theAtomFactory != null) {
                return theAtomFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AtomFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AtomFactoryImpl() {
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
            case AtomPackage.CAMEL_ATOM_BINDING_TYPE: return createCamelAtomBindingType();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE: return createAtomScheduledPollConsumerType();
            case AtomPackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelAtomBindingType createCamelAtomBindingType() {
        CamelAtomBindingTypeImpl camelAtomBindingType = new CamelAtomBindingTypeImpl();
        return camelAtomBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AtomScheduledPollConsumerType createAtomScheduledPollConsumerType() {
        AtomScheduledPollConsumerTypeImpl atomScheduledPollConsumerType = new AtomScheduledPollConsumerTypeImpl();
        return atomScheduledPollConsumerType;
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
    public AtomPackage getAtomPackage() {
        return (AtomPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AtomPackage getPackage() {
        return AtomPackage.eINSTANCE;
    }

} //AtomFactoryImpl
