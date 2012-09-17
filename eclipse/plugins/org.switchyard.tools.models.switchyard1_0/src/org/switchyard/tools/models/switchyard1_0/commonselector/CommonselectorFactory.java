/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonselector;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage
 * @generated
 */
public interface CommonselectorFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CommonselectorFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Static Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Operation Selector Type</em>'.
     * @generated
     */
    StaticOperationSelectorType createStaticOperationSelectorType();

    /**
     * Returns a new object of class '<em>XPath Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XPath Operation Selector Type</em>'.
     * @generated
     */
    XPathOperationSelectorType createXPathOperationSelectorType();

    /**
     * Returns a new object of class '<em>Regex Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regex Operation Selector Type</em>'.
     * @generated
     */
    RegexOperationSelectorType createRegexOperationSelectorType();

    /**
     * Returns a new object of class '<em>Java Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Operation Selector Type</em>'.
     * @generated
     */
    JavaOperationSelectorType createJavaOperationSelectorType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CommonselectorPackage getCommonselectorPackage();

} //CommonselectorFactory
