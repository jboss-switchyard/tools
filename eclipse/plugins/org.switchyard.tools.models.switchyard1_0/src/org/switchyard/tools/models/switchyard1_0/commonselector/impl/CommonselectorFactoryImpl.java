/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonselector.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.commonselector.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonselectorFactoryImpl extends EFactoryImpl implements CommonselectorFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CommonselectorFactory init() {
        try {
            CommonselectorFactory theCommonselectorFactory = (CommonselectorFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-common-selector:config:1.0"); 
            if (theCommonselectorFactory != null) {
                return theCommonselectorFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CommonselectorFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonselectorFactoryImpl() {
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
            case CommonselectorPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case CommonselectorPackage.STATIC_OPERATION_SELECTOR_TYPE: return createStaticOperationSelectorType();
            case CommonselectorPackage.XPATH_OPERATION_SELECTOR_TYPE: return createXPathOperationSelectorType();
            case CommonselectorPackage.REGEX_OPERATION_SELECTOR_TYPE: return createRegexOperationSelectorType();
            case CommonselectorPackage.JAVA_OPERATION_SELECTOR_TYPE: return createJavaOperationSelectorType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
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
    public StaticOperationSelectorType createStaticOperationSelectorType() {
        StaticOperationSelectorTypeImpl staticOperationSelectorType = new StaticOperationSelectorTypeImpl();
        return staticOperationSelectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPathOperationSelectorType createXPathOperationSelectorType() {
        XPathOperationSelectorTypeImpl xPathOperationSelectorType = new XPathOperationSelectorTypeImpl();
        return xPathOperationSelectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegexOperationSelectorType createRegexOperationSelectorType() {
        RegexOperationSelectorTypeImpl regexOperationSelectorType = new RegexOperationSelectorTypeImpl();
        return regexOperationSelectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaOperationSelectorType createJavaOperationSelectorType() {
        JavaOperationSelectorTypeImpl javaOperationSelectorType = new JavaOperationSelectorTypeImpl();
        return javaOperationSelectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonselectorPackage getCommonselectorPackage() {
        return (CommonselectorPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CommonselectorPackage getPackage() {
        return CommonselectorPackage.eINSTANCE;
    }

} //CommonselectorFactoryImpl
